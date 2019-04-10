"use strict"
angular.module ("myApp", 	[]);


angular.module ("myApp").controller('MainController',['$locale',function($locale){
	
	this.date=new Date();
	this.cost=54960.56;
	
 	this.formattedDate=$locale.DATETIME_FORMATS.fulldate;

}]);