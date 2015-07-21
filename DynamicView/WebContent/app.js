var mydynamicapp=angular.module('dynamicmodule',['ngRoute']);

mydynamicapp.config(function($routeProvider){
	$routeProvider
	.when('/stocks',{templateUrl:'stocks.html',controller:'stockscontroller'})
	.when('/graph',{templateUrl:'graph.html',controller:'graphcontroller'})
	.when('/order',{templateUrl:'order.html',controller:'ordercontroller'});
	
});


mydynamicapp.controller('dynamiccontroller',function($scope){
	$scope.message="test";
});


mydynamicapp.controller('stockscontroller',function($scope){

	$scope.message="I Am Stocks Controller";
	
});


mydynamicapp.controller('graphcontroller',function($scope){

	$scope.message="I Am Graphs Controller";
	
});

mydynamicapp.controller('ordercontroller',function($scope){

	$scope.message="I Am Orders Controller";
	
});