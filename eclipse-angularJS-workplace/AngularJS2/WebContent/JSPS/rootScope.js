"use strict"
angular.module ("myApp", 	[ ]);

angular.module ("myApp").run(function($rootScope) {
	 $rootScope.msg='trhis is rootScopeMsg';
     $rootScope.sayHello=function(value)
	  {
    	 alert('Say Hello');
	  };
	
});

angular.module ("myApp").controller('MainController',['$scope' ,function($scope) {

}]);


/*

['$scope', '$log', function($scope, $log) {
  $scope.$log = $log;
  $scope.message = 'Hello World!';
['$log',function($log){

	this.logClicked=function(data)
	{ 
		$log.log(data);
	};
*/
