describe('transformFilter',function(){

	var transformFilter;
    var MockTransformService;

	beforeEach(module("myApp"));
	
	beforeEach(inject(function(_transformFilter_){
		transformFilter = _transformFilter_;
	}));	

	beforeEach(function(){
		
		MockTransformService=jasmine.createSpyObj('mySpy' ,['transform']);
		MockTransformService.transform.and.returnValue('transformed value');
		
		module(function($provide)
				  {
			      $provide.value('TransformService',MockTransformService);
			      });		
	});
	
	it('should transform the value ',function(){
		expect(transformFilter('This is test')).toEqual('transformed value');
	});
});	
/*
	
    var UserService;
    var mockRandomNameService;
	
	beforeEach(module("myApp"));
	
	beforeEach(inject(function(){
*
*/