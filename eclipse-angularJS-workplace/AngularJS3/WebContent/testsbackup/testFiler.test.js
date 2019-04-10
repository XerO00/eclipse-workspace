describe('DasheshFilter',function(){

	var dashesFilter;

	beforeEach(module("myApp"));

	beforeEach(inject(function(_dashesFilter_){
		dashesFilter = _dashesFilter_;
	}));	

	it('should reurn This-is-test ',function(){
		expect(dashesFilter('This is test')).toEqual('This-is-test');
	});
});	
/*
	
    var UserService;
    var mockRandomNameService;
	
	beforeEach(module("myApp"));
	
	beforeEach(inject(function(){
*
*/