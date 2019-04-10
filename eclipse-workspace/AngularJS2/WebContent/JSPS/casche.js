"use strict"
angular.module ("myApp", 	[]);


angular.module ("myApp").controller('MainController',['$cacheFactory',function($cacheFactory){
	
	var vm=this;
	
	vm.key=[];
	vm.cache=$cacheFactory('');
	

 	vm.addItem=function(itemKey,itemValue)
      {
 		vm.key.push(itemKey);
 		vm.cache.put(itemKey,itemValue);
      };

	vm.getItem=function(itemKey)
     {
		vm.currentItem=vm.cache.get(itemKey);
     };
   
     vm.removeItem=function(itemKey)
     {
		
		vm.cache.remove(itemKey);
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