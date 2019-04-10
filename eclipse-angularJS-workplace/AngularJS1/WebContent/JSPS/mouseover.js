"use strict"
angular.module ("myApp", 	[]);

angular.module ("myApp").controller('MainController',[function(){

	var vm=this;

	vm.mouseOverCount=0;
	vm.mouseMoveCount=0;
	
	vm.X=0;
	vm.Y=0;
	
	vm.doMouseOver=function(event)
		{
		console.log(event);
		vm.mouseOverCount++;
		};
	
    vm.doMouseMove=function(event)
       {
    	console.log(event);
    	vm.mouseMoveCount++;
    	vm.X=event.offsetX;
    	vm.Y=event.offsetY;
       };
	
}]);


/*BAD PRACTICE
function external(elem,amount){
	
	var $scope=angular.element(elem).scope();
	mctrl.clickcount += parseInt(amount);
	$scope.$apply();	
}
*/
