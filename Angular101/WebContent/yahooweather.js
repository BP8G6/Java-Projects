var weatherapp=angular.module('weatherappmodule',[]);
weatherapp.controller('weatherappcontroller',function($scope,$http){
	
	$scope.cities=[];
	$scope.onClick=function(){
		
		var url="https://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20weather.forecast%20where%20location="+$scope.pin+"&format=json&diagnostics=true&callback=";
		$http.get(url).success(function(data){
			
			$scope.cities.push(data);	
			
			
			
		});
	}	
	
});