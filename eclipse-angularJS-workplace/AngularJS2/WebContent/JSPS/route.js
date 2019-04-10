"use strict"
angular.module ("myApp", 	['ngRoute']);

angular.module ("myApp").config(['$routeProvider',function($routeProvider){
	$routeProvider
	.when('/about',{
		templateUrl:'templates/about.html',
		controller:'AboutController',
		controllerAs:'vm'
	})
	.when('/contact',{
		templateUrl:'templates/contact.html',
		controller:'ContactController',
		controllerAs:'vm'
	})
	.when('/welcome',{
		templateUrl:'templates/welcome.html',
		controller:'WelcomeController',
		controllerAs:'vm'
	});
}]);
angular.module ("myApp").controller("AboutController", function(){
    this.details='About Controller ';
    this.name='Prasanna';
});

angular.module ("myApp").controller("ContactController", function(){
	this.details='Contact Controller ';
});


angular.module ("myApp").controller("WelcomeController", function(){
	this.details='Welcome Controller ';
});


/*
$http.get('http://localhost:8080/AngularJS2/json/customer.html').then(function(response) {
    $scope.states = response.data.records;
})
/*/