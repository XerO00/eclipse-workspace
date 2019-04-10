"use strict"
angular.module ("myApp", 	['ngResource']);

angular.module ("myApp").service('AppModel', function($http,$q){   
    
    this.getStates=function(abr)
     {
    	var defer= $q.defer();
    	
    	$http.get('http://localhost:8080/AngularJS2/json/user.html/'+abr)
    	.then(function(response){
    			defer.resolve(response.data);
                                 }.bind(this),
                                function(response){
    	            defer.reject('error:response.data,status:response.status');
               });
    	return defer.promise;
     };
});
angular.module ("myApp").controller("MainController",['AppModel' , function(AppModel){
    this.model=AppModel;

	var vm=this;
	
	vm.states= [];
	
	this.getStates=function(abr)
	  {
		vm.model.getStates(abr).then(function(data){
			vm.states.push(data);
		                   });
	  };	

}]);

////
/*http://localhost:8080/api/public/users/:id

http://localhost:8080/AngularJS2/json/users/:id
	
*/