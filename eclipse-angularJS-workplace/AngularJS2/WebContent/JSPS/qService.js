"use strict"
angular.module ("myApp", 	[ ]);

angular.module ("myApp").service('AppModel',function($q,$timeout) {
 
	var Syncusers=
		[
		{name:'Prasanna',id:1},
		{name:'Ronaldo',id:2}
	    ];
	
	var Asyncusers=
		[
		{name:'Ram',id:1},
		{name:'Raldo',id:2}
	    ];
	
	this.getSync=function()
	   {
		return Syncusers; 
	   };
   this.getAsyncbad=function()
     {
	   $timeout(function(){
		   return Asyncusers;
	   },300)	;
     };
		this.getAsync=function(success)
		   {
			var defer = $q.defer();
			
			$timeout(function()
			{
			if(success){defer.resolve(Asyncusers);
			}	
			else
			{
		    defer.reject(new Error('Error occured'));}
			},600);
			
			return defer.promise; 
		   };
});
angular.module ("myApp").controller('MainController',['AppModel' ,function(AppModel) {

	var vm=this;
	
	vm.model=AppModel;
	vm.users=[];
	
	vm.getSync=function()
	  {
		vm.users=vm.model.getSync();
	  }
	vm.getAsyncbad=function()
	  {
		vm.users=vm.model.getAsyncbad();
	  }
	vm.getAsync=function(success)
	  {
		vm.model.getAsync(success).then(function(result){
			vm.users=result;
		},function(error){console.log(error);});
	  };
}]);