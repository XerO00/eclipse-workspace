"use strict"
angular.module ("myApp", 	[]);


angular.module ("myApp").controller('MainController',[function(){

	this.fruitList=['apple','banana'];
	 
	this.user={
		firstname:'prasanna a',
		lastname:'Andhalkar bullshit',
		favoriteFruit:'Cherry',
		isActive:false
	};
  
	
}]);

angular.module ("myApp").filter('YesOrNo',[function(){

return function(value){
	
	if(value===true){
		return 'Yes';
	}else if(value===false){
		return 'No';
	}else{
		return'Unknown';
	}
	
};

	
}]);

