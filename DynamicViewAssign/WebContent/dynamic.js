var dynamicview=angular.module('dynamicmodule',['ngRoute']);

dynamicview.config(function($routeProvider){
	
	$routeProvider	
	.when('/weather',{templateUrl:'weather.html',controller:'weathercontroller'})
	.when('/food',{templateUrl:'food.html',controller:'foodcontroller'});
	
});



dynamicview.controller('dynamiccontroller',function($scope){
	$scope.message="Dynamic controller";
});

dynamicview.controller('weathercontroller',function($scope,$http){
	$scope.message="Weather controller";
	
	$scope.cities=[];
	$scope.onClick=function(){
		
		var url="https://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20weather.forecast%20where%20location="+$scope.pin+"&format=json&diagnostics=true&callback=";
		$http.get(url).success(function(data){
			
			$scope.cities.push(data);	
	
		
		});
	}
});


dynamicview.controller('foodcontroller',function($scope){
	$scope.message="Food controller";	
	
	$scope.students = [
	                   {name: 'Mark Waugh', city:'New York'},
	                   {name: 'Steve Jonathan', city:'London'},
	                   {name: 'John Marcus', city:'Paris'}
	               ];
	
	
	            
});