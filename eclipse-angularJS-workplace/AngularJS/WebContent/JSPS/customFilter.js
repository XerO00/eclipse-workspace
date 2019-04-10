"use strict"
angular.module ("myApp", 	[]);

angular.module ("myApp").controller("MainController",[ function($scope){

	this.user={
			firstname :'prasanna xer0',
	  		lastname  :'andhalkar family is bullshit',
	        accountype:'saving',
			balance	  :1345,
			lastLogin= new Date('January 14,2018')
		};
}]);

angular.module ("myApp").filter("Capitalize", function(){ 

	return function(value){
		var words= value.split(' ');
		
		for(var counter=0; counter < words.length; counter++)
		{
			words[counter]=	words[counter].substr(0,1).toUpperCase() +  words[counter].substr(1).toLowerCase();
		}	return words.join(' '); 
	};})
/*	
	return function(value){

		var result =null;
		var words = value.split(' ');
		words.forEach(function(item){
			
			if(result){	
				result +=' ';
				}
			else{
				result='';
			}
			result += item.substr(0,1).toUpperCase() +item.substr(1).toLowerCase();
			;
	
		return result;
	};18002663090
	
	
});*/