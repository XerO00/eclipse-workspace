"use strict"
angular.module ("myApp", 	['ngSanitize']);


angular.module ("myApp").directive('tstVehicleView',function(){

	return{
	       scope:{
	        	 
	        	 item:'='
	             },
	     replace:true,       
	     templateUrl:'templates/twowaybinding.html',
	     restrict:'EA'
	    	 
           };
});

angular.module ("myApp").controller('MainController',['$scope',function($scope){

  $scope.item=
	  {
		  year:2014,
		  color:'red',
		  price:43455
	  } ;  
  $scope.first=
  {
	  year:2015,
	  color:'black',
	  price:45667
  };
  $scope.second=
  {
	  year:2017,
	  color:'Voilet',
	  price:9876
  };
}]);

/***Relace used for replacing custom attribute  i.e. tst-vehicle-view 
These are replacted into browser inspect element output

to relace with original or standard keyword replace usd
*/

