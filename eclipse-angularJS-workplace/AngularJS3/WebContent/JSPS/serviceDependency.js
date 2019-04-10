"use strict"
angular.module ("myApp", 	[ ]);
angular.module ("myApp").service('RandomNameService',function() {
	
	var firstNames=['Prasanna','Hricha','Poonam','hitesh','Siva','Rohit','Akshay'];
	var lastNames=['Andhlakr','Tripathi'];
	
	this.getFirstName=function()
		  {
		   var index=Math.floor(Math.random()*firstNames.lenght);
		   return firstNames[1];	 
		  };
	this.getLastName=function()
		  {
		  var index=Math.floor(Math.random()*lastNames.lenght);
		  return lastNames[0];
		  };
});
angular.module ("myApp").service('UserService',function(RandomNameService) {
	
   this.getFullName=function()
	      {
		  return RandomNameService.getFirstName() + ' ' + RandomNameService.getLastName();
	      }
});
angular.module ("myApp").controller('MainController',['UserService',function(UserService){

   this.name='Sundar';
   this.getName=function()
         {
	      this.name=UserService.getFullName();
         };
}]);
/*
 * 
 * 
	this.div=function(v1,v2)
	  {
	   return parseInt(v2)/parseInt(v1);
	  } ;
	this.sub=function(v1,v2)
	  {
	   return parseInt(v2)-parseInt(v1);
	  }  ;
	this.Mul=function(v1,v2)
	  {
	   return parseInt(v2)*parseInt(v1);
	  };
	  th moments of the  
 * */

