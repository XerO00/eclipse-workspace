describe('testMainController',function(){
	
    var $controller;
    var mockCalculatorService;
	
	beforeEach(module("myApp"));
	
	beforeEach(inject(function(_$controller_){
		$controller = _$controller_;
		mockCalculatorService=jasmine.createSpyObj('mySpy' ,['add','subtract','divide','multiply']);
		mockCalculatorService.add.and.returnValue(5);
		mockCalculatorService.subtract.and.returnValue(1);
		mockCalculatorService.divide.and.returnValue(1.5);
		mockCalculatorService.multiply.and.returnValue(6);
	}));	
	
	it('should add 3 and 2 and return 5',function(){
	var controller=$controller('MainController',{$scope:{},calculateService:mockCalculatorService});
		controller.add(3,2);
		expect(controller.result).toEqual(5);
	});
	it('should divide 3 by 2 and return 1.5',function(){
	var controller=$controller('MainController',{$scope:{},calculateService:mockCalculatorService});
		controller.div(2,3);
		expect(controller.result).toEqual(1.5);
		});
});	
/*


it('should add 3 and 2 and return 5',function(){
var controller=$controller('MainController',{$scope:{},calculateService:mockCalculatorService});
	controller.add(3,2);
	expect(controller.result).toEqual(5);
});
it('should add 3 and 2 and return 5',function(){
var controller=$controller('MainController',{$scope:{},calculateService:mockCalculatorService});
	controller.add(3,2);
	expect(controller.result).toEqual(5);
});

*
*/