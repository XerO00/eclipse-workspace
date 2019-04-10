"use strict"
angular.module ("myApp", 	['ngSanitize']);

angular.module ("myApp").controller('MainController',['$sce',function($sce){

	this.imagsrc="images/gini.jpg";
    this.weblink="https://hexaware.skillport.com/skillportfe/main.action#summary/LP/CDE$103467:_ss_lp:sphexaware/lp_NT_LP_AngularJs";
}]);






