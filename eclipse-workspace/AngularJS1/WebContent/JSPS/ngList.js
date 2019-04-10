"use strict"
angular.module ("myApp", 	[]);


angular.module ("myApp").controller('MainController',[function(){
	
	this.name=['Prasanna','Hricha'];

    this.getType=function(value)
      {
    	return typeof(value);
      }
}]);