"use strict"
angular.module ("myApp", 	[]);


angular.module ("myApp").controller('MainController',function(){
    var vm=this;
    vm.pan_no='BJCPA0526R';
    vm.pan_no_confirm='';
    vm.msg='';
	vm.dochange=function()
	{
		  
		var pan=/[a-zA-Z]{5}[0-9]{4}[a-zA-Z]{1}/;
		
		if(vm.pan_no === vm.pan_no_confirm)
		     {
			vm.msg='This is correct name and confirmed';
			 }
		
	  else { 
		  vm.msg='This is Incorrect';
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