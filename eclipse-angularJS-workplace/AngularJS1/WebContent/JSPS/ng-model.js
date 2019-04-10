"use strict"
angular.module ("myApp", 	['ngSanitize']);

angular.module ("myApp").controller('MainController',['$sce',function($sce){

	this.user=
	{
			color:'Blue'
	};
	this.colorlist=
		[
		{name:'Green',value:'Green'},
		{name:'Yellow',value:'Yellow'}
  
		];
	
}]);






