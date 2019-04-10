"use strict"
angular.module ("myApp", 	['ngSanitize']);

angular.module ("myApp").controller('MainController',['$sce',function($sce){

	this.foodlist=[
		{name:'Apple',price:23},
		{name:'Banana',price:2}
	];
}]);






