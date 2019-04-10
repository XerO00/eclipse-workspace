"use strict"
angular.module ("myApp", 	[]);


angular.module ("myApp").factory('$exceptionHandler',function(){

	return function(exception,cause)
	  {
		
		alert('Opps thrown Error');
	  }
	
});


angular.module ("myApp").controller('MainController',[function(){
	
	var vm=this;	
    vm.msg='';
 	vm.throwError=function()
      {
 		throw new Error('Throw Error function throwing the error');
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