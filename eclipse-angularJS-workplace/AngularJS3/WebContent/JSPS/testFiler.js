"use strict"
angular.module ("myApp", 	[ ]);

angular.module ("myApp").filter('dashes', function() {
  
	return function(value)
	  {
		value=value.replace(/\s/g,'-');
		return value;
	  }
	
});

angular.module ("myApp").controller('MainController',['$filter' ,function($filter) {
          
	var dashFilter=$filter('dashes');
	
	this.message='This is my filter example for using them into controller with return function';
	this.secmsg=dashFilter('This is my second message to use filter function into controller');
	
	this.dynamicFilter=function()
	 {
		this.thirdMsg=dashFilter(this.inputData);
	 };
}]);


/*

*/
