"use strict"
angular.module ("myApp", 	[]);

angular.module ("myApp").controller("MainController",[ function($scope){

	this.user={
			firstname :'prasanna',
	  		lastname  :'andhalkar',
	        accountype:'saving',
			balance	  :1345
	};
}]);
