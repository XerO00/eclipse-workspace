"use strict"
angular.module ("myApp", 	['ngRoute']);

angular.module ("myApp").config(['$routeProvider',function($routeProvider){
	$routeProvider
	.when('/product/:productID',{
		templateUrl:'templates/product.html',
		controller:'ProductController',
		controllerAs:'vm'
	})
	.when('/welcome',{
		templateUrl:'templates/welcome.html',
		controller:'WelcomeController',
		controllerAs:'vm'
	})
	.otherwise({ redirectTo:'/welcome'});
}]);
angular.module ('myApp').controller('ProductController',['$routeParams' , function($routeParams){
    this.details='ProductController ';
    this.productID=$routeParams.productID;
}]);

angular.module ('myApp').controller('WelcomeController', function(){
	this.details='Welcome Controller ';
});


/*
$http.get('http://localhost:8080/AngularJS2/json/customer.html').then(function(response) {
    $scope.states = response.data.records;
})
/*/