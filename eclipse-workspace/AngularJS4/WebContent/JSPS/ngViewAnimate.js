"use strict"
angular.module ("myApp",  ['ngRoute', 'ngAnimate']);

angular.module ("myApp").config(function($routeProvider) {
	
	$routeProvider
    .when('/mercury', {
      templateUrl: "templates/about1.html",
      controller: "mercuryCtrl"
    })
    .when('/venus', {
      templateUrl: "templates/about1.html",
      controller: "venusCtrl"
    })
    .when('/earth', {
      templateUrl: "templates/about1.html",
      controller: "earthCtrl"
    })
    .when('/mars', {
      templateUrl: "templates/about1.html",
      controller: "marsCtrl"
    })
});

angular.module ("myApp").controller("mercuryCtrl", function($scope) {
  $scope.planet = {
    name: 'Mercury',
    carbondioxide: 'Trace Amount',
    nitrogen: 'Trace Amount',
    oxygen: '42%',
    hydrogen: '22%'
  }
});

angular.module ("myApp").controller("venusCtrl", function($scope, $route) {
  $scope.planet = {
    name: 'Venus',
    carbondioxide: '96.5%',
    nitrogen: '3.5%',
    oxygen: 'Almost None',
    hydrogen: 'Almost None'
  }
});

angular.module ("myApp").controller("earthCtrl", function($scope, $route) {
  $scope.planet = {
    name: 'Earth',
    carbondioxide: '0.038%',
    nitrogen: '78.1%',
    oxygen: '21%',
    hydrogen: 'Almost None'
  }
});

angular.module ("myApp").controller("marsCtrl", function($scope, $route) {
  $scope.planet = {
    name: 'Mars',
    carbondioxide: '95.7%',
    nitrogen: '2.7%',
    oxygen: '0.2%',
    hydrogen: 'Almost None'
  }
});