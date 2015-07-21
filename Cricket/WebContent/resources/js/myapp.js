(function() {
  var app = angular.module("getHubViewer", []);
  var MainController = function($scope, $http) {
	var cricketContents =[];  
	
    var promise = $http.get('http://api.nytimes.com/svc/search/v2/articlesearch.json?q=cricket+india&api-key=27cc37d1535723ed77b86d8b9f04ec20:6:72441273');    
    
    promise.then(
      function(payload) {
        $scope.cricketContents = payload.data;
      });
  };
  app.controller("MainController", ["$scope","$http",MainController]);
}());