"use strict"
angular.module ("myApp", 	[]);


angular.module ("myApp").controller('MainController',['$scope',function($scope){
	 
	var vm=this;

	vm.message=" ";
	vm.name="Prasanna";
	vm.specialname="angular js";
	
	$scope.$watch(function(newValue,oldValue){
		console.log=(newValue,'newValue',oldValue,'oldValue');
		if(vm.specialname == vm.name){
			
		vm.message="hello welcome in the world of angular JS"	
		}
		else
		{
			vm.message="not a proper welcome ";
		}
	});
 }]);


