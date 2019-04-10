"use strict"
angular.module ("myApp", 	[]);

angular.module ("myApp").factory("AppModel", function(){
   var model={};
   
   model.user=
	   {
		   name:'Factory name',
		   Age:23
	   };
   model.sayHello=function()
       {
	      alert('Say Hello From appModel Factoty');
       };
    return model;	
});

angular.module ("myApp").service("AppModel", function(){
   
    this.user=
		   {
			   name:'Service name',
			   Age:23
		   };
	
	this.sayHello=function()
       {
	      alert('Say Hello From appModel Service');
       };

});

angular.module ("myApp").controller("MainController",['AppModel' , function(AppModel){

    this.model=AppModel;
}]);

angular.module ("myApp").controller("FirstController",['AppModel' ,  function(AppModel){

    this.model=AppModel;
	this.user={
			name:'First Controller'
	};	
}]);


angular.module ("myApp").controller("SecondController",['AppModel' ,  function(AppModel){
	

    this.model=AppModel;
	this.user={
			name:'Second Controller'
	};	
}]);