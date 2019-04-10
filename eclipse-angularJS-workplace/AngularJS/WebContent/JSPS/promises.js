"use strict"
angular.module ("myApp", 	[]);

angular.module ("myApp").factory('RandomNameService',function($q,$timeout){
	 
	var vm=this;
	var firstname=['prasanna','ronaldo','joseph'];
	var middlename=['dhanaji','guiz','rod'];
	var lastname=['andhalkar','gonzarlo','titus'];
	 
    return{
    	getname:function(nameType)
    	{
    		var defer=$q.defer();
    		var duration=Math.round(Math.random()*3000);
    		
    		$timeout(function(){
    			
    			var name='';
    			
    			switch(nameType){
    			
    			case 'first':
    				name=firstname[Math.floor(Math.random()*firstname.length)];
    			break;
    			
    			case 'middle':
    				name=middlename[Math.floor(Math.random()*middlename.length)];
    			break;
    			
    			case 'last':
    				name=lastname[Math.floor(Math.random()*lastname.length)];
    			break;
    			
    			}
    			
    			defer.resolve(name);
    			
    		},duration);
    		return defer.promise;	
    	}
    };
});




angular.module ("myApp").controller('MainController',['$q','RandomNameService',function($q,RandomNameService){
	 
	var vm=this;
    var firstnameService=RandomNameService.getname('first');
    var middlenameService=RandomNameService.getname('middle')
    var lastnameService=RandomNameService.getname('last')
 
/*    firstnameService.then(function(name){
    	
    	vm.firstname=name;
    });

    middlenameService.then(function(name){
    	
    	vm.middlename=name;
    });

    lastnameService.then(function(name){
    	
    	vm.lastname=name;
    });
    below we are implementing $q.all to display all the values simoltaniously
    
 
    */
 var complete=$q.all(['firstnameService','middlenameService','lastnameService']);
    complete.then(function(data){
    vm.firstname=data[0];
    vm.middlename=data[1];
    vm.lastname=data[2];})
}]);