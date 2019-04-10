"use strict"
angular.module ("myApp", 	['ngSanitize']);
angular.module ("myApp").controller('MainController',['$scope',function($scope){
	$scope.bird=
	  {
			name:'bird'
	  };
	$scope.horse=
	  {
			name:'horse'
	  };
	$scope.snake=
	  {
			name:'snake'
	  };
}]);
angular.module ("myApp").controller('birdController',['$scope',function($scope){
	$scope.state='waiting';
	$scope.move=function()
	   {
		$scope.state='Flying';	
	   };
}]);
angular.module ("myApp").directive('tstDynCtrl',function(){

	return{
	       scope:{
	        	 
	        	 item:'='
	             },
	     templateUrl:'templates/animal.html',
	     restrict:'EA',
	     controller:'@',
	     name:'controllerName'        
	     };
});

angular.module ("myApp").controller('snakeController',['$scope',function($scope){
	$scope.state='waiting';
	$scope.move=function()
	   {
		$scope.state='Slithering';	
	   };
}]);
angular.module ("myApp").controller('horseController',['$scope',function($scope){
	$scope.state='waiting';
	$scope.move=function()
	   {
		$scope.state='galloping';	
	   };
}]);
