"use strict"
angular.module ("myApp", 	['ngSanitize']);


angular.module ("myApp").directive('tstVehicleView',function(){

	return{
	       scope:{
	        	 
	        	 item:'='
	             },
	     replace:true,       
	     templateUrl:'templates/vehicle2.html',
	     restrict:'EA',
	     controller:function($scope)
	       {
	    	 $scope.msg='';
	    	 $scope.onClick=function()
	    	    {
	    		 if($scope.msg)
	    			   {
	    			 $scope.msg='This event has been saved for First time';
	    			   }
	    		 else
	    			  {
	    			 $scope.msg='This event has been saved for Second time';
	    			  }
	    	    }
	       }
	    	 
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

/***Relace used for replacing custom attribute  i.e. tst-vehicle-view 

THis is example for adding a controller into a directive 

*/

