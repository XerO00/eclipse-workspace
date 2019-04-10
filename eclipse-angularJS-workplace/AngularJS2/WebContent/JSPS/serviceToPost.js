"use strict"
angular.module ("myApp", 	[]);

angular.module ("myApp").service("AppModel", function($http){
   
    this.user=[]
    
    this.addUser=function(user1)
     {
    	$http.post('http://localhost:8080/AngularJS/jason.html',user1)
    	.then(function(response){
    			this.user.push(response.data);
                                 }.bind(this),
                                function(response){
    	                                  console.log('Error');
               });
     };
});

angular.module ("myApp").controller("MainController",['AppModel' , function(AppModel){
    this.model=AppModel;
}]);

////