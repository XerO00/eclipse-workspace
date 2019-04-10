"use strict"

angular.module ("myApp", 	[]);

angular.module ("myApp").controller("MainController",function($scope, $http) {

	this.getStates=function()
	{
	$http.get("http://localhost:8080/AngularJS2/welcome.html")
	  .then(function(response) {
	       $scope.myWelcome = response.data;
	  
	  });
/*sss
<script>
var app = angular.module('myApp', []);
app.controller('myCtrl', function($scope, $http) {
  $http.get("http://localhost:8080/AngularJS2/welcome.html")
  .then(function(response) {
      $scope.myWelcome = response.data;
  });
});


$http.get('http://localhost:8080/AngularJS2/json/customer.html').then(function(response) {
    $scope.states = response.data.records;
})


angular.module ("myApp").service('AppModel', fu<script>
var app = angular.module('myApp', []);
app.controller('myCtrl', function($scope, $http) {
  $http.get("http://localhost:8080/AngularJS2/welcome.html")
  .then(function(response) {
      $scope.myWelcome = response.data;
  });
});


$http.get('http://localhost:8080/AngularJS2/json/customer.html').then(function(response) {
    $scope.states = response.data.records;
})


angular.module ("myApp").service('AppModel', function($http){
   
    this.states = [{name:'Mijoram', abr:'MJ'}];
    
    this.getStates=function()
     {
    	$http.get('http://localhost:8080/AngularJS2/json/user.html')
    	.then(function(response){
    			this.states=response.data;
                                 }.bind(this),
                                function(response){
    	                                  console.log(response.data);
               });
     };
});
angular.module ("myApp").controller("MainController",['AppModel' , function(AppModel){
    this.model=AppModel;
}]);
nction($http){
   
    this.states = [{name:'Mijoram', abr:'MJ'}];
    
    this.getStates=function()
     {
    	$http.get('http://localhost:8080/AngularJS2/json/user.html')
    	.then(function(response){
    			this.states=response.data;
                                 }.bind(this),
                                function(response){
    	                                  console.log(response.data);
               });
     };
});
angular.module ("myApp").controller("MainController",['AppModel' , function(AppModel){
    this.model=AppModel;
}]);


*/	
