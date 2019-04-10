"use strict"
angular.module ("myApp", 	[ ]);
angular.module ("myApp").service('calculateService',function() {
	
	   this.add=function(v1,v2)
     	  {
          return parseInt(v2)+parseInt(v1);
    	  };
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
		  
});
angular.module ("myApp").controller('MainController',['calculateService',function(calculateService){
	
	this.v1=0;
	this.v2=0;
	
	this.add=function(v1,v2)
	    {
		this.result=calculateService.add(v1,v2);
	    };
	this.sub=function(v1,v2)
	    {
	   this.result=calculateService.sub(v1,v2);
	     };
    this.Mul=function(v1,v2)
        {
		this.result=calculateService.Mul(v1,v2);
	    };	  
    this.div=function(v1,v2)
        {
	   this.result=calculateService.div(v1,v2);
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
	  
 * */

