var myApp = angular.module('myApp',[]);//in some file
 
myApp.controller('AppController', ['$log', '$location', function($log, $location) {
    var self= this;
    self.name = 'BLA BLA';
    self.sayHello = function(){alert('say hello');}
    $log.log('I am starting');
    $log.log($location.path("/newpath"))
}]);