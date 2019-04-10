describe('CustomDirective',function(){

	var myElement;
	
	beforeEach(module("myApp"));
	
	beforeEach(module('templates/about.html'));
	
	beforeEach(inject(function($compile,$rootScope){
		myElement= angular.element('<tst-external-directive></tst-external-directive>');
		$compile(myElement)($rootScope);
		$rootScope.$digest();
		
	}));	
	it('should create a DOM node with template text',function(){
		expect(myElement.text()).toContain('This is my external tempate directive');
	});
});	
/*
	
    var UserService;
    var mockRandomNameService;
	
	beforeEach(module("myApp"));
	
	beforeEach(inject(function(){
*
*/