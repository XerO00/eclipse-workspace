"use strict"
angular.module ("myApp", 	[ ]);

angular.module ("myApp").controller('MainController',['$scope', '$log', function($scope, $log) {
            			  $scope.$log = $log;
			              $scope.message = 'Hello World!';

				this.logClicked=function(data)
				{ 
					$log.log(data);
				};

}]);


/*

['$scope', '$log', function($scope, $log) {
  $scope.$log = $log;
  $scope.message = 'Hello World!';
['$log',function($log){

	this.logClicked=function(data)
	{ 
		$log.log(data);
	};
*/
