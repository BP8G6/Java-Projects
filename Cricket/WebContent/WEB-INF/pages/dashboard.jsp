 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
    
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dashboard</title>

<link href="/Cricket/resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="/Cricket/resources/bootstrap/css/bootstrap-theme.min.css" rel="stylesheet">
<link href="/Cricket/resources/bootstrap/css/carousel.css" rel="stylesheet"/>
<script type="text/javascript" src="/Cricket/resources/jquery/jquery.min.js"></script>
<script type="text/javascript" src="/Cricket/resources/bootstrap/js/bootstrap.min.js"></script>
<!-- <script type="text/javascript" src="/Cricket/resources/js/canvasjs.min.js"></script>  -->
<script type="text/javascript" src="http://canvasjs.com/assets/script/canvasjs.min.js"></script>

<link rel="stylesheet" href="/Cricket/resources/bootstrap/css/bootstrap.css">

<link rel="stylesheet" href="/Cricket/resources/bootstrap/css/navbar.css">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script src="/Cricket/resources/js/navbar.js"></script>


<script type="text/javascript">
function myfun(){

	var chart = new CanvasJS.Chart("chartContainer1",
			{
				title:{
					text: "Players By Type",
					verticalAlign: 'top',
					horizontalAlign: 'left'
				},
		                animationEnabled: true,
				data: [
				{        
					type: "doughnut",
					startAngle:20,
					click:onTypeClick,
					toolTipContent: "{label}: {y} - <strong>#percent%</strong>",
					indexLabel: "{label} #percent%",
					dataPoints: ${getchartbytype}
						
				}
				]
			});
			chart.render();

var chart = new CanvasJS.Chart("chartContainer2",
    {
        animationEnabled: true,
        title: {
            text: "Players By State",
        },
        data: [
        {
            type: "pie",
            click:onStateClick,
            showInLegend: true,
            dataPoints:  ${getchartbystate}
                
        },
        ]
    });
chart.render();

function onTypeClick(e){
	window.location="/Cricket/playersbytype?type="+e.dataPoint.label;
	
	
}

function onStateClick(e){
	window.location="/Cricket/playersbystate?state="+e.dataPoint.label;
	
} 

}
</script>

<!-- <style type="text/css">
   body { background: #8FBC8F; }
   </style>
 -->
</head>
<body onload="myfun()">

<div class="container">

 



    <nav class="navbar navbar-inverse" style="background:#2856dd;">
		<div class="container">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
	      			<a class="navbar-brand1" href="/"><img alt="" src="/Cricket/resources/images/masthead-logo.jpg" height="35" width="40" align="bottom"></a>
			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					 <li><a class="navbar-brand" href="/Cricket/"><p style="color:#ffffff">Home</p></a></li>
					 <li><a class="navbar-brand" href="/Cricket/dashboard"><p style="color:#ffffff">DashBoard</p></a></li>
                     <li><a class="navbar-brand" href="/Cricket/addPlayer"><p style="color:#ffffff">Add Players</p></a> </li>
                     <li><a class="navbar-brand" href="/Cricket/addCommittee"><p style="color:#ffffff">Committee</p></a></li>
					 <li><a class="navbar-brand" href="#"><p style="color:#ffffff">FeedBack</p></a></li>
				</ul>
			
			
				

			</div><!-- /.navbar-collapse -->
		</div><!-- /.container-fluid -->
	</nav>
</div>

<div class="container">
<div class="row">
<div class="col-md-6">
<div id="chartContainer1" style="width: 400px; height: 300px;float:left;"></div> 
</div>
<div class="col-md-6">
<div id="chartContainer2" style="width: 400px; height: 300px;"></div></div>
</div>
</div>
<br><br>


<div class="container">
<div class="col-md-2"></div>
<div class="col-md-8">
<div class="row">

<form method="POST" action="/Cricket/search">

<div class="input-group">
      <input type="text" name="query" class="form-control" placeholder="Search for..." align="center"/>
      <span class="input-group-btn">
        <button class="btn btn-default" type="submit">Go!</button>
      </span>
    </div><!-- /input-group -->
   
   </form>
   
</div>
</div>

<br><br>
<div class="col-md-2"></div>
<br><br>


<div class="row">
<c:forEach items="${allplayers}" var="players">
  <div class="col-md-3">
    <div class="thumbnail">
      <img src="${players.imageurl}" alt="...">
      <div class="caption">
         <h3><a href="/Cricket/playerinfo?id=${players.id}"><h3>${players.lname}</h3></a></h3>      
      </div>
    </div>
  </div>
  </c:forEach>
  
</div>

</div>
</body>

</html>