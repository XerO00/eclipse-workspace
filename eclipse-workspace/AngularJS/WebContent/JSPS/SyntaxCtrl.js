"use strict"
angular.module ("myApp", 	[]);

angular.module ("myApp").controller('ParentController',[ function(){

	this.message='Parent message';
}]);

angular.module ("myApp").controller('FirstController',[function(){
	
	this.message='FirstController message';
	
}]);


angular.module ("myApp").controller('SecondController',['$scope','$interval',function($scope,$interval){
	
	this.message='SecondController message';
	this.value=1;
	
	$interval(function()
			{
		this.value=Math.round(Math.random((10)*1)+1);
			}.bind(this),2000);	

	$scope.$watch('Second.value',function(newvalue,oldvalue)
			{
		console.log=('new',newvalue,'old',oldvalue);
			});	


}]);