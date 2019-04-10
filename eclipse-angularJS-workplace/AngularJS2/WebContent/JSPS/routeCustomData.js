"use strict"
angular.module ("myApp", 	['ngRoute']);
angular.module ("myApp").config(['$routeProvider',function($routeProvider){
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
	.otherwise({ redirectTo:'/welcome'});
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
/*
/*/		