"use strict"
angular.module ("myApp", 	[ ]);

angular.module ("myApp").service('TestService',function() {
 
	var data='xyz123';
	this.getData=function()
	   {
		return data; 
	   };
   
});
angular.module ("myApp").controller('MainController',['TestService' ,function(TestService) {

	var vm=this;
	
	vm.model=TestService;
	vm.data='';
	
	vm.getData=function()
	  {
		vm.data=vm.model.getData();
	  }
}]);
/**/

