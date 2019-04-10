"use strict"
angular.module ("myApp", 	[]);


angular.module ("myApp").controller('MainController',['$scope','$compile',function($scope,$compile){
	
	this.addNewField=function(htmlMarkup)
     {
     var newElement=$compile(htmlMarkup)($scope);
     var parentElement=angular.element('#myDiv');
     parentElement.append(newElement);
     };
   
}]);

/*this is compile example to understand 
 * var can be used as function show as above 
 
 * 
 */ 