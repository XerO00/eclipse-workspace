"use strict"
angular.module ("myApp", 	['ngRoute']);

angular.module ("myApp").config(['$routeProvider',function($routeProvider){
	$routeProvider
	.when('/welcome',{
		templateUrl:'templates/Welcome1.html',
		controller:'WelcomeController',
		controllerAs:'vm'
	})
	.otherwise({ redirectTo:'/Welcome1'});
}]);	

angular.module ('myApp').controller('WelcomeController',['$route', function($route){
    
	this.reload=function()
	  {
		$route.reload('/Welcome1');
	  }
	this.details='Welcome Controller ';

}]);


/*
$http.get('http://localhost:8080/AngularJS2/json/customer.html').then(function(response) {
    $scope.states = response.data.records;
})
/*/		