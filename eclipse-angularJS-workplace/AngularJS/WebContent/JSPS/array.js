"use strict"
angular.module ("myApp", 	[]);

angular.module ("myApp").controller("MainController",[ function($scope){

	this.users=[{
			firstname :'prasanna xer0',
	  		lastname  :'andhalkar family is bullshit',
	        accountype:'saving',
			balance	  :1345
	},
	
	{
		firstname :'Hrich xer0',
  		lastname  :'sen family is bullshit',
        accountype:'saving',
		balance	  :9876
},

{
	    firstname :'Tanu xer0',
		lastname  :'dcosta family is bullshit',
    accountype:'saving',
	balance	  :8764
},

{
	    firstname :'Rajani xer0',
		lastname  :'shinde family is bullshit',
    accountype:'saving',
	balance	  :1234
}];
}]);
