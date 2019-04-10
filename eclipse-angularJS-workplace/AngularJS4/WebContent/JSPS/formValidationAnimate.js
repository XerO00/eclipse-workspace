"use strict"
angular.module ("myApp", 	['ngAnimate']);

angular.module ("myApp").controller('MainController',[function(){

	 
	this.user={
		
	};
	 
	this.submitForm=function(form){

		  if(form.$valid)
		     {
	           window.alert('Passed');			
		      } 
		  else{	
	           window.alert('Failed');
           	  } 
		  };	  
}]);


