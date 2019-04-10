describe('testMainController',function(){
    
    var CalculatorService;
    
	beforeEach(module("myApp"));
	
	beforeEach(inject(function(_CalculatorService_){
	
	 CalculatorService= _CalculatorService_;
	
	}));	
	
	it ('should add 3 and 2 and return 5',function()
	   {
		expect(CalculatorService.add(3,2)).toEqual(5);
	   });
});	
/*
 * 
 * 	$controller=_$controller_;
		mockCalculatorService=jasmine.createSpyObj('mySpy' ,['add','subtract','divide','multiply']);
		mockCalculatorService.add.and.returnValue(5);
		mockCalculatorService.subtract.and.returnValue(1);
		mockCalculatorService.divide.and.returnValue(1.5);
		mockCalculatorService.multiply.and.returnValue(6);
	
 * 
 * */