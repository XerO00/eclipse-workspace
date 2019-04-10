"use strict"
angular.module ("myApp", 	['ngSanitize']);


angular.module ("myApp").directive('tstUserView',function(){

	return{
	       scope:{
	        	 
	        	 item:'='
	             },	
	     transclude:true,
	     templateUrl:'templates/user.html',
	     restrict:'AE'
	    	 
           };
});

angular.module ("myApp").controller('MainController',['$scope',function($scope){

  this.user=
	  {
		  firstName:'Prasanna',
		  lastName:'Andhalkar'
	  } ;  
  this.msg='Hello from controller msg which is transclude demo'
}]);