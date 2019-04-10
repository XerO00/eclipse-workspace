"use strict"
angular.module ("myApp", 	['ngSanitize']);
angular.module ("myApp").directive('tstNumGen',function(){

		return{
		       scope:{
		        	 numGenFunction:'&',
		             count:'?',
		             onSave:'&'
		             },
		     templateUrl:'templates/ng-numgen.html',
		     restrict:'E',
		     
           controller:function($scope)
               {
        	    if($scope.numGenFunction)  
                   {
        	    	$scope.items=$scope.numGenFunction({count:$scope.count});
                   }
              $scope._onSave=function()
               {
  	            if($scope.onSave)
  	        	   {
  	        	   $scope.onSave(); 
  	        	   }
                }  
               } 
		};
}) ;
angular.module ("myApp").controller('MainController',[function(){

  this.randomNum=function(count)
	  {
	  var result=[];
	  count = count || 10;
	  for(var counter=0 ; counter < count ;counter++)
	     {
		 var item=Math.round(Math.random()*100) + 1;
			 result.push(item);
	     }
	  return result;  
	  } ;  
  
  this.seqNum=function(count)
      {
		  var result=[];
		  count=count || 10;
		  for(var counter=0 ; counter < count ;counter++)
		     {
			 var item=counter + 1;
				 result.push(item);
		     }
		  return result;
	  } ;  

    $scope.onSaveFirst=function()
      {
	  alert('This saves first');
      };

   this.onSaveSec=function()
      {
	  alert('This saves Sec');
      };
	    
}]);



