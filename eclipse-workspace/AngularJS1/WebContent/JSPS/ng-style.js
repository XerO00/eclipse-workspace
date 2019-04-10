"use strict"
angular.module ("myApp", 	['ngSanitize']);

angular.module ("myApp").controller('MainController',['$sce',function($sce){
	
	this.enableStyle=function(){
	
		this.style=
	    {
	color:'red',		
	fontSize:'19px'		
	    };
	

	
		this.style1=
    	{
 	 color:'green',		
	 fontSize:'11px'		
    	};
	};
	this.disableStyle=function(){	
		
		this.style=null;
		this.style1=null;
	};
	
}]);






