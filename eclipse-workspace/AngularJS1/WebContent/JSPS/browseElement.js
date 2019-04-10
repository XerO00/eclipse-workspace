"use strict"
angular.module ("myApp", 	['ngSanitize']);
angular.module ("myApp").controller('MainController',[function(){
  
}]);
angular.module ("myApp").directive('tstRollOver',function(){

	return{
	       scope:{
	        	 label:'@'
	             },
	     templateUrl:'templates/test-rollover.html',
	     replace:true,
	     link:function(scope,element,attrs)
		   {
	    	 var originalColor=element.css('background-color');
	    	 
	    	element.bind('mouseover',function()
	    		{
	    		element.css('background-color',attrs.activeColor)
	    		}) ;

	    	element.bind('mouseout',function()
	    		{
	    		element.css('background-color',originalColor);
	    		}) ;
		   }
	     };
});