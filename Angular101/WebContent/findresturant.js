var resturant=angular.module('resturantmodule',[]);
resturant.controller('resturantcontroller',function($scope,$http){
	
	$scope.resturants=[];
	$scope.onResturantClick=function(){
		
		var url="https://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20local.search%20where%20zip='"+$scope.pin +"'and%20query='"+$scope.order +"'&format=json&diagnostics=false&callback=";
		
		$http.get(url).success(function(data){
		$scope.resturants.push(data);
			
		
		if(data){
			
            var len = data.query.results.Result.length;           
            var txt = "";
            if(len > 0){            	 
                for(var i=0;i<len;i++){
                	
                    if(true){                    
                        txt += "<tr><td>"+data.query.results.Result[i].Title+"</td>&nbsp<td>"+data.query.results.Result[i].Address
                        +"</td>&nbsp&nbsp&nbsp<td>"+data.query.results.Result[i].City+"</td>&nbsp&nbsp&nbsp<td>"+data.query.results.Result[i].State
                        +"</td>&nbsp&nbsp&nbsp<td>"+data.query.results.Result[i].Phone+"</td><td>"+data.query.results.Result[i].Rating.TotalRatings+"</td></tr>";                      
                        
                    }
                }               
                if(txt != ""){                        	
                	
                	var tbody = document.querySelector("#list tbody");    
                	
                	 //document.getElementById("tbody").innerHTML = txt;
                	//$scope.resturants.push(txt);
                	tbody.appendChild(tbody.innerHTML=txt);
                   // tbody.innerHTML=txt;
                    //alert(txt);
                    //tr.innerHTML = txt;
                   // tbody.appendChild(tbody)
                    
                	
                }
            }
		}
					
		});
	}
	
});

