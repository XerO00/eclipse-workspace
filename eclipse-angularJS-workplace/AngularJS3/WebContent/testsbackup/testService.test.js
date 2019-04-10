var TestService;

describe('TestService',function(){
	
	beforeEach(module("myApp"));
	
	beforeEach(inject(function(_TestService_){
      TestService=_TestService_;			
	}));	
	it('should return test data',function(){
		expect(TestService.getData()).toEqual('xyz123');
	});
});	
