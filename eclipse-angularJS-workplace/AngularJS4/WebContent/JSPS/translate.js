"use strict"
angular.module ("myApp", 	[ 'ngMessageFormat','ngLocale','pascalprecht.translate']);

angular.module ("myApp").config('translate',function($translateProvider){
	   
	$translateProvider.translations('en',{
		
		WELCOME_MESSAGE:'Welcome to the app'
	});
	$translateProvider.translations('fr',{
		
		WELCOME_MESSAGE:'Welcome to the app'
	});
  
});

angular.module ("myApp").controller('MainController',['$scope','translate',function($scope,$translate){
   
	$scope.firstName='Prsanna';
	$scope.message='Welcome';
	
	$scope.setLanguage = function (key)
	  {
		$translate.use(key);
		console.log("Key updatedd" + key);
	  };

}]);	