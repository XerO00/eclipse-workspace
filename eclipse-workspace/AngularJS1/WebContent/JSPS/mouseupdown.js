"use strict"
angular.module ("myApp", 	[]);

angular.module ("myApp").controller('MainController',[function(){

	var vm=this;

	vm.upclickcount=0;
	
	vm.downclickcount=0;
	
	vm.upclick=function(event)
		{
		console.log(event);
		vm.upclickcount =upclickcount+1;
		}
	
    vm.downclick=function(event)
       {
    	console.log(event);
    	vm.downclickcount=vm.downclickcount+1;	
       }
	
}]);


/*BAD PRACTICE
function external(elem,amount){
	
	var $scope=angular.element(elem).scope();
	mctrl.clickcount += parseInt(amount);
	$scope.$apply();	
}
*/
