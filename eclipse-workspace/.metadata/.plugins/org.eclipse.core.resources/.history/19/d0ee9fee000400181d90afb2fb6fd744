"use strict"
angular.module ("myApp", 	[]);


angular.module ("myApp").controller('MainController',function($scope){
    var vm=this;
 
	vm.valid=true;
    vm.not_valid=false;
    vm.pan_no='BJCPA0526R';
    
	vm.panValidation=function()
	{
		  
		var pan=/[a-zA-Z]{5}[0-9]{4}[a-zA-Z]{1}/;
		if(pan.MainController(vm.pan_no) == false)
		     {
			vm.valid=false;		
			vm.not_valid=true;
		     }
		
	  else {
			vm.valid=true;		
			vm.not_valid=false;
	        }
	    
	 };	
				  
});

/* *
   
     
     $scope.not_valid=true;
	         $scope.valid=false;
		      } 
		  else{
		         $scope.not_valid=false;
		         $scope.valid=true;
			   } 
*/