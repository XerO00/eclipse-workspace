"use strict"
angular.module ("myApp", 	[]);
angular.module ("myApp").config(function($interpolateProvider){
	 
	$interpolateProvider.startSymbol('{!');

	$interpolateProvider.endymbol('!}');
		
	});

angular.module ("myApp").controller('MainController',[function(){
	 
this.message="hello and welcome to world of loneliness";
	
}]);


