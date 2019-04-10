"use strict"
angular.module ("myApp", 	[]);


angular.module ("myApp").controller('MainController',[function(){

	
	var vm=this;
	
	vm.show=true;
	vm.show1=true;
	
    vm.showMSG='Hell! keep it up';
    vm.showMSG1='No Optin!';
 
    vm.isShowin = function()
    {
    return vm.showMSG1;		
    };
    
}]);


/*
 * 
 * 
 * 
 * 
 */