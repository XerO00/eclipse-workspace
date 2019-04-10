"use strict"
angular.module ("myApp", 	[]);


angular.module ("myApp").controller('MainController',['$scope',function($scope){
	
	$scope.show=false;
	
	$scope.user=
	 {
            isOn:true,
			name:'Prasanna'
	 };
	$scope.hobbies='Cricket';
	
}]);