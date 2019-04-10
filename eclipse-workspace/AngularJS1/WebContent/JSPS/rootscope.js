"use strict"
angular.module ("myApp", 	[]);

angular.module ("myApp").run(function($rootScope){

	$rootScope.userModel=
	 {
			name:'Prasanna',
			job :'Boss'
	 };

	$rootScope.rootscopedemo=function()
	{
		return 'Get your bud up';
	};
});

angular.module ("myApp").controller('MainController',['$scope',function($scope){

	$scope.userModel=
	 {
			name:'Prasanna',
			job :'BUDUP'
	 };


}]);
