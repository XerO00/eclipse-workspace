"use strict"
angular.module ("myApp", 	[]);


angular.module ("myApp").controller('MainController',[function(){

   this.items=
 [   {name:'apple', type:'fruit'},
	 {name:'pinapple', type:'fruit'},
	 {name:'same like fruit', type:'other'},
	 {name:'banana', type:'fruit'},
	 {name:'cherry', type:'fruit'},
	 {name:'milk', type:'dairy'},
	 {name:'butter', type:'dairy'},
	 {name:'tak', type:'dairy'},
	 {name:'potato', type:'veg'},
	 {name:'tomato', type:'veg'}
];	

this.selectedtype='';

}]);



