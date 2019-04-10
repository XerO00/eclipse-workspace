"use strict"
angular.module ("myApp", 	[]);


angular.module ("myApp").controller('MainController',['$timeout',function($timeout){
	
	var timeoutPromise=null;
	
	this.msg='No timeout selected';
	
	this.delay=1000;
	
   this.startTimeOut=function()
     {
	this.msg='';
	this.cancelTimeout();
	this.msg='timeout has now started';
	timeoutPromise=$timeout(function(data)
			  {
		    this.msg='timeout has now ended';
		    timeoutPromise=null;
		    
			  },this.delay,true,{data:'testing123'});
     };
   
   this.cancelTimeout=function()
     {
	   if(timeoutPromise)
		   {
		   $timeout.cancel(timeoutPromise);
		   timeoutPromise=null;
		   this.msg='timeout has now cancelled';
		   }
     };

}]);