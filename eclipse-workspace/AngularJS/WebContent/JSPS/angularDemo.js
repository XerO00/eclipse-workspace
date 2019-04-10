var app = angular.module ("demoApp", 	[]);
app.controller("demoCtrl", function($scope){
    $scope.message="Hello"
	$scope.sayHello=function(name){
	return $scope.message +' '+ name+'.';
	};
	
})	;
