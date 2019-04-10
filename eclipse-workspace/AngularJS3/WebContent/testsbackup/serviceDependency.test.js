describe('UserService',function(){
    var UserService;
    var mockRandomNameService;

	beforeEach(module("myApp"));
	
	beforeEach(function(){
		
		mockRandomNameService=jasmine.createSpyObj('mySpy' ,['firstName','lastName']);
		mockRandomNameService.firstName.and.returnValue('Hricha');
		mockRandomNameService.lastName.and.returnValue('Andhlakr');
		
		module(function($provide)
		  {
	      $provide.value('RandomNameService',mockRandomNameService);
	      });
	});	

	beforeEach(inject(function(_UserService_){
		UserService = _UserService_;
	}));	

	it('should reurn Hricha Andhlakr ',function(){
		expect(UserService.getFullName()).toEqual('Hricha Andhlakr');
	});
});	
/*
	
    var UserService;
    var mockRandomNameService;
	
	beforeEach(module("myApp"));
	
	beforeEach(inject(function(){
*
*/