"use strict"
angular.module ("myApp", 	['ngSanitize']);


angular.module ("myApp").directive('tstVehicleView',function(){

	return{
	       scope:{
	        	 
	        	 item:'='
	             },
	     templateUrl:'templates/vehicle.html',
	     restrict:'EA'
           };
});

angular.module ("myApp").controller('MainController',['$scope',function($scope){

  $scope.item=
	  {
		  year:2014,
		  color:'red',
		  owner:'Maruti'
		  
	  }
    ;  
  $scope.first=
  {
	  year:2015,
	  color:'black',
	  owner:'BMW'
	  
  }
	;
  $scope.second=
  {
	  year:2017,
	  color:'Voilet',
	  owner:'Gini'
	  
  }
  ;
}]);



