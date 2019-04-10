"use strict"
angular.module ("myApp", 	[]);

angular.module ("myApp").controller('MainController',[function(){

	var vm=this;

	vm.clickcount=0;
	
	vm.dblclickcount=0;
	
	vm.click=function(amount)
		{
		vm.clickcount +=amount;
		}
    vm.doubleclick=function()
    {
    	vm.dblclickcount=vm.dblclickcount+1;	
    }
	
}]);


/*BAD PRACTICE
function external(elem,amount){
	
	var $scope=angular.element(elem).scope();
	mctrl.clickcount += parseInt(amount);
	$scope.$apply();	
}
*/
