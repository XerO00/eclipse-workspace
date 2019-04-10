"use strict"
angular.module ("myApp", 	[]);
angular.module ("myApp").directive('tstVehicleView',function(){

	return{
	       scope:{
	        	 
	        	 year:'@',
	        	 make:'@',
	        	 model:'@',
	        	 info:'@'
	             },
	     templateUrl:'templates/vehicle1.html',
	     restrict:'EA'
	     };
});
angular.module ("myApp").controller('MainController',['$scope',function($scope){

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

/* ,
         
	    	 controller:function()
	    	    {
	    		consol.log('typeof(year)', typeof($scope.year));
	    		consol.log('typeof(make)', typeof($scope.make)); 
	    		consol.log('typeof(info)', typeof($scope.info));
	    	    }

*/