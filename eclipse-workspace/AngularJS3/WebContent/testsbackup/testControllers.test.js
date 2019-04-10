var $controller;

describe('testMainController',function(){
	
	beforeEach(module("myApp"));
	
	beforeEach(inject(function(_$controller_){
		$controller=_$controller_;			
	}));	
	it('should return square of given value',function(){
		var controller=$controller('MainController',{$scope:{}});
		controller.calculateSquare(8);
		expect(controller.result).toEqual(64);
	});
});	
