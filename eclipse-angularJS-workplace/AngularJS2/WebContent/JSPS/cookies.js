"use strict"
angular.module ("myApp", 	['ngCookies']);

angular.module ("myApp").controller('MainController',['$cookies',function($cookies){
	
	var vm=this;
	vm.currentItem='';
	vm.key=[];
	

 	vm.addItem=function(itemKey,itemValue)
      {
 		vm.key.push(itemKey);
 		$cookies.put(itemKey,itemValue);
      };

	vm.getItem=function(itemKey)
     {
		vm.currentItem=$cookies.get(itemKey);
     };
     
     vm.getItemValue=function(itemKey)
     {
		return $cookies.get(itemKey);
     };
   
     vm.removeItem=function(itemKey)
     {
        vm.key=vm.key.filter(function(key)
        		 {
        	    return (key !== itemKey);
        		 });
 		$cookies.remove(itemKey);
		};
    
}]);

/*this is compile example to understand 
 * var can be used as function show as above 
 vm.key=vm.key.filter(function(key)
				{
			      return (key !== itemKey);
		         });
 * 
 */ 