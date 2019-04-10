"use strict"
angular.module ("myApp", 	[ ]);

angular.module ("myApp").directive('tstExternalDirective',function(){

	return{			
	     templateUrl:'templates/about.html',
	     restrict:'E',
	     replace:true.
	     scope:{
          person:'=';
	     }
      
	};
});
/*
angular.module ("myApp").controller('MainController',['$scope',function($scope){

}]);

*/