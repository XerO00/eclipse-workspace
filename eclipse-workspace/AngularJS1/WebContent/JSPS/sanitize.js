"use strict"
angular.module ("myApp", 	['ngSanitize']);

angular.module ("myApp").controller('MainController',['$sce',function($sce){
	
	
	this.bindmsg='<strong>AngularJS</strong>'
	this.dangerousscript='<script>alert(\'Do Something\')</script>hello from the dangerous script';
	this.dangerouscss='<span class="some-class" style="color:red">hello from the dangerous css';
	this.trustedcss=$sce.trustAsHtml('<span class="some-class" style="color:red">hello from the trusted css');
	
}]);







/*  
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 

 	this.dangerouscss='<span class="some-class" style="color:red"></span>hello from the dangerous css';
	this.trustedcss=$sce.trusrAsHtml('<span class="some-class" style="color:red"></span>hello from the dangerous css');

 */