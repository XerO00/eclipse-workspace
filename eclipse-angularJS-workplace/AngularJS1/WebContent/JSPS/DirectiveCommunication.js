"use strict"
angular.module ("myApp", 	['ngSanitize']);

angular.module ("myApp").directive('tstSchoolView',function(){

	return{			
	     templateUrl:'templates/school.html',
	     restrict:'E',
	     
	     controller:function($scope)
	       {
	    	$scope.courses=['chem','Math','PCS','Ajax'];
	    	
	    	this.addCourse=function(courseName)
	    	      {
	    		  $scope.courses.push(courseName);
	    		  console.log('Course is added: ' + couorseName);
	    	      }
	       }
	    	 
           };
});
angular.module ("myApp").directive('tstCourseBio',function(){

	return{
		 restrict:'A',
		 require: 'tstSchoolView',
	     link:function(scope,elem,attrs,schoolController)
	       {
	    		  schoolController.addCourse('Biology');
	    		  console.log('Biology course created: ');
	       }
	    	 
           };
});

angular.module ("myApp").controller('MainController',['$scope',function($scope){

}]);