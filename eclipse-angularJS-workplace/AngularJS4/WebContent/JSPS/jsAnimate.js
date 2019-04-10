"use strict"
var myApp=angular.module ('myApp', 	['ngRoute','ngAnimate']);

angular.module ("myApp").config(['$routeProvider','$locationProvider',function($routeProvider,$locationProvider){
	$routeProvider
	.when('/about',{
		templateUrl:'templates/about1.html',
		controller:'AboutController',
		controllerAs:'vm',
		  data:
		  {
               customValue1:'customValue'			  
		  }
	})
	.when('/welcome',{
		templateUrl:'templates/Welcome2.html',
		controller:'WelcomeController',
		controllerAs:'vm',
			data:
			{
				customValue2:'customValue2'
		    }
	})
	//.otherwise({ redirectTo:'/welcome'});
	//$locationProvider.html5Mode(true);
}]);	

angular.module ('myApp').controller('WelcomeController',['$route', function($route){
	this.data=$route.current.data;
	this.reload=function()
	  {
		$route.reload('/welcome');
	  }
	this.details='Welcome Controller ';

}]);

angular.module ("myApp").controller("AboutController",['$route', function($route){
    this.details='About Controller ';
    this.data=$route.current.data;
}]);

angular.module ("myApp").controller('taskCtrl',  function($scope) {
	  $scope.tasks = [
	    { title: 'Go to the Zoo'},
	    { title: 'Take a Nap'},
	    { title: 'Start Learning AngularJS'},
	    { title: 'Meet Susan at the Gym'}
	  ];

	  $scope.addtask = function() {
	    $scope.tasks.push($scope.task);
	    $scope.task = {};
	  };

	  $scope.removeItem = function(index) {
	    $scope.tasks.splice(index, 1);
	  };
	});
myApp.animation('.custom-fade',['$window', function($window){

	function fadeOut(element,done)
	       {
		
	      element.style.opacity=1;
	      (function f()
	          {
	    	    if((element.style.opacity -=.1)<0)
	    	    	  {
	    	    	  element.style.display="none";
	    	    	  done();
	    	    	  }
	    	    else
	    	    	 {
	    	    	  $window.requestAnimationFrame(f);
	    	    	 }
	          })();
	       }
	
	function fadeIn(element,done) 	
    {
	
         element.style.opacity=0;
         element.style.display="block";
   (function f()
       {
	   var value=parseFloat(element.style.opacity);
 	    if(!((value += .1)>1))
 	    	  {
 	          element.style.opacity=value;
 	         $window.requestAnimationFrame(f);
 	    	  }
 	    else
 	    	  {
 	    	  done();
 	    	  }
       })();
    }
	
	return {
		
		enter: function(element,done)
	       {
			fadeIn(element[0],done);
	       },	
	    leave:function(element,done)
          {
	    	fadeOut(element[0],done);
          }
	 }
}]);	
	/*
/*/		