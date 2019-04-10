"use strict"
angular.module ("myApp", 	[]);
angular.module ("myApp").controller("MainController",['$scope' ,'$interval',  function($scope,$interval){
    var items=['Apple','A','Banana','Pinapple'];
	$scope.itemIndex=null;
	$scope.currentItem='';
	
	$scope.getItem= function(){
			
		$scope.currentItem=items[$scope.itemIndex];
	};
}])	;
