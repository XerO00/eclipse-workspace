"use strict"
angular.module ("myApp", 	['ngSanitize']);

angular.module ("myApp").controller('MainController',['$sce',function($sce){
	
  this.class1="firstclass";
  this.class2="secondclass";
  this.isSelect=true;
}]);






