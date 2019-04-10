"use strict"
angular.module ("myApp", 	[]);


angular.module ("myApp").controller('MainController',['$parse',function($parse){
	
	this.executeMulltiply=function()
     {
		var part={part:{id:'534343'}};
		var multiply=$parse('8*8');
		var getId=$parse('part.id')
 
       this.result=multiply();
	   this.idOfPart=getId(part);	
     };
   
}]);

/*this is example of how to use of parse also the
 * var can be used as function show as above 
 
 * 
 */ 