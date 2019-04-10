"use strict"
angular.module ('myApp',[ ]);

angular.module ('myApp').directive('tstSimpleDirective',function() {
 
	return
	{
	    template:'<p>My Simple Sirective</p>'
		
    };
});
/*

		replace:true,
		template:'<p>My Simple Sirective</p>'

*/
