"use strict"
angular.module ("myApp", 	[ ]);
angular.module ("myApp").service('TransformService' ,function() {
	this.transform=function(value,mode)
	{
	  var result=null;
	  switch(mode)
	  {
	     case'dashes':		
	    	 result=value.replace(/\s/g,'-');
	    	 break;
	     case'capitalize':		
	    	 var words= value.split(' ');
	    	 for(var counter=0; counter< words.length ; counter++)
	    		 {
	    		 words[counter]=words[counter].substr(0,1).	toUpperCase() + words[counter].substr(1).toLowerCase();
	    		 }
	    	 result=words.join(' ');
	    	 break;
	  }
	return result; 
	}
});
angular.module ("myApp").filter('transform', function(TransformService) {
  
	return function(value,mode)
	  {
		return TransformService.transform(value,mode);
	  }
});

angular.module ("myApp").controller('MainController',['$filter' ,function($filter) {
          
	var transformFilter=$filter('transform');
	
	this.firstValue ='This exapple for filter dependency testing';
	this.secondValue=transformFilter('This exapple for testing second filter dependency','dashes');
	
	this.thirdValue='';	
	this.applyFilter=function()
	 {
		this.thirdValue=transformFilter(this.inputData,'capitalize');
	 }
}]);


/*

*/
