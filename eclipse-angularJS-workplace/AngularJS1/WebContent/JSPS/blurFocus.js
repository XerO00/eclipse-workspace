"use strict"
angular.module ("myApp", 	['ngSanitize']);

angular.module ("myApp").controller('MainController',['$sce',function($sce){

	this.user=
	{
    msg:'',			
	name:''
	};
	
	this.sayHello=function()
	  {
		    this.user.msg='please enter name';
	  };
	this.sayGoodBye=function()
	{ 
		if(!this.user.name || this.user.name.length == 0)
			{
			this.user.msg='Aww didnt enter name';
			}
		else
			{
			this.user.msg='WC ' + this.user.name;
			}
	};
}]);






