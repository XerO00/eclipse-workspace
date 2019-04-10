"use strict"
angular.module ("myApp", 	[ ]);


angular.module ("myApp").controller('MainController',['$window','$document' ,function($window,$document) {

    this.sayHello=function()
	  {
  	  $window.alert('Say Hello');
	  };
    this.doc=function()
	  {
      console.log($document);
	  $document[0].bgColor='blue';
	  };	  

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
