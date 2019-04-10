"use strict"
angular.module ("myApp", 	[ 'ngMessageFormat','ngLocale']);

angular.module ("myApp").controller('MainController',['$scope',function($scope){
   
	$scope.studentNum=0;
	$scope.course='Angular';
	

}]);