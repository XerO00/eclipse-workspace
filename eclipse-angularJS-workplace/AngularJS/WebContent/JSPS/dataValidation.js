 "use strict"
angular.module ("myApp", 	[]);

angular.module ("myApp").controller('MainController',[function(){

this.data=[1,2,3,4];
this.results=[];

var  isDefined ='isDefined' + angular.isDefined(this.data);
var  isUndefined ='isUndefined' +  angular.isUndefined(this.data);
var  isFunction = 'isFunction' + angular.isFunction(this.data);
var  isString = 'isString' +  angular.isString(this.data);
var  isNumber = 'isNumber' + angular.isNumber(this.data);
var  isObject ='isObject' +  angular.isObject(this.data);
var  isArray = 'isArray' + angular.isArray(this.data);

    this.results.push(isDefined,isUndefined,isFunction,isString,isNumber,isObject,isArray);
    }]);