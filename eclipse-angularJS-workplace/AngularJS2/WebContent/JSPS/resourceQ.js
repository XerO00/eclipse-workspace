"use strict"
angular.module ("myApp", 	['ngResource']);

angular.module ("myApp").factory('User', function($resource){
   
    return $resource('http://localhost:8080/AngularJS2/json/users/:id',{id:'@id'}); 
});

angular.module ("myApp").controller("MainController",['User' , function(User){

	var vm=this;
	
	vm.users= [];
	vm.selectedUser=null;
	
	this.addUser=function(name)
	  {
		var user= new User({name:name});
	    user.$save(function(newUser,putResponseHeaders)
	    {
	    	vm.selectedUser=newUser;
	    }         );
	  };	
	  
		this.getUsers=function()
		   {
		    	vm.users=User.query();
		   };
		   
		   this.getUser=function(id)
		   {
		    	vm.selectedUser=User.get({id:id});
		   };

		   this.deleteUser=function(id)
		   {
		    	vm.selectedUser=User.delete({id:id});
		   };
}]);

////
/*http://localhost:8080/api/public/users/:id

http://localhost:8080/AngularJS2/json/users/:id
	
*/