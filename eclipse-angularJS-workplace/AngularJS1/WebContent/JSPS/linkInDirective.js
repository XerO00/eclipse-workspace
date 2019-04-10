"use strict"
angular.module ("myApp", 	[]);
angular.module ("myApp").directive('tstLinKDirective',function(){
		return function(scope,element,attrs)
		  {
			 element.bind('mouseover',function()
					 {
				 element.addClass('area-on');
					 });
			 element.bind('mouseout',function()
					 {
				 element.removeClass('area-on');
					 });
		  };
});
angular.module ("myApp").controller('MainController',['$scope',function($scope){


}]);
