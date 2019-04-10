"use strict"
angular.module ("myApp", 	['ngRoute']);
angular.module ("myApp").config(['$routeProvider',function($routeProvider){
	$routeProvider
	.when('/about',{
		templateUrl:'templates/about3.html',
		controller:'AboutController',
		controllerAs:'vm'
	})
	.when('/welcome',{
		templateUrl:'templates/Welcome4.html',
		controller:'WelcomeController',
		controllerAs:'vm'
		
	})
	.otherwise({ redirectTo:'/welcome'});
}]);	

angular.module ('myApp').controller('NavController',['$location', function($location){
	this.goto=function(path)
	  {
		$location.replace();
		$location.path(path);
	  }
}]);


angular.module ('myApp').controller('WelcomeController', function(){
	this.details='About Controller ';
});

angular.module ("myApp").controller("AboutController",function(){
    this.details='About Controller ';
});
/*
/*/		