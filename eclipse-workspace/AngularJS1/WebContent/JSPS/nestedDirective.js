"use strict"
angular.module ("myApp", 	['ngSanitize']);
angular.module ("myApp").directive('tstSchoolView',function(){
	return{	
		 transclude:true,
	     templateUrl:'templates/school1.html',
	     restrict:'E',
	     
	     controller:function($scope)
	       {
	    	$scope.students=[{name:'Prasana',studentNumber:'2354'}];
	    	
	    	this.register=function(name, studentNumber)
	    	      {
	    		  $scope.students.push({name:name,studentNumber:studentNumber});
	    		 // console.log('Name: ' + couorseName);
	    	      }
	       }    	 
           };
});
angular.module ("myApp").directive('tstStudentView',function(){

	return{
		 restrict:'E',
		 require: '^tstSchoolView',
		 templateUrl:'templates/student.html',
		 scope:
			  {
			   name:'@',
			   studentNumber:'@'
			  },
	     link:function(scope,elem,attrs,schoolController)
	       {
	    		  schoolController.register(scope.name,scope.studentNumber);
	    	//	  console.log('Biology course created: ');
	       }    	 
           };
});
angular.module ("myApp").controller('MainController',['$scope',function($scope){
}]);