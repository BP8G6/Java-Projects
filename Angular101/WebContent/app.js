var myapp=angular.module('mymovieapp',[]);

myapp.controller('xyzcontroller',function($scope,$http){
	
	
	$scope.movies=[];
	
	$scope.addMovie=function(){
		
		var url ="http://www.omdbapi.com/?t="+ $scope.moviename+"&y=&plot=short&r=json";
		
		$http.get(url).success(function(data){
			$scope.movies.push(data);
			$scope.moviename="";
			
		});
		
	};
	
	
});