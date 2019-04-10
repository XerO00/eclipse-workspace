"use strict"
angular.module ("myApp", 	['ngSanitize']);
angular.module ("myApp").controller('MainController',[function(){
  this.currtemp='567';
}]);
angular.module ("myApp").directive('tstWatchObserve',function(){

	return{
	       scope:{
	        	 temperature:'@'
	             },
	     templateUrl:'templates/thermometer.html',
	     restrict:'EA',
	     link:function(scope,element,attrs)
		   {
	    	attrs.$observe('temperature',function(newValue)
	    		{
	    		var temp=attrs.temperature;	
	    		
	    		 if(temp>86)
	    			 {
	    			 element.addClass('freezing')
	    			 element.removeClass('normal')
	    			 element.removeClass('heating')
	    			 }
	    		 else if(temp>=45 && temp<=98)
	    			 {
	    			 element.addClass('normal')
	    			 element.removeClass('freezing')
	    			 element.removeClass('heating')
	    			 }
	    		 else 
    			 {
    			 element.addClass('heating')
    			 element.removeClass('freezing')
    			 element.removeClass('normal')
    			 }
	    		}) ;
		   }
	     };
});