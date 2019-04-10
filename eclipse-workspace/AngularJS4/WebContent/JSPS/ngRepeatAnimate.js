"use strict"
angular.module ("myApp",  ['ngRoute', 'ngAnimate']);

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