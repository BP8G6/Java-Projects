<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome To NewsX</title>
<link href="/newsx/resources/bootstrap/bootstrap-3.3.5-dist/css/bootstrap.min.css" rel="stylesheet">
<link href="/newsx/resources/bootstrap/bootstrap-3.3.5-dist/css/bootstrap-theme.min.css" rel="stylesheet">
<link href="/newsx/resources/bootstrap/bootstrap-3.3.5-dist/css/carousel.css" rel="stylesheet"/>
<script type="text/javascript" src="/newsx/resources/jquery/jquery.min.js" rel="stylesheet"></script>
<script type="text/javascript" src="/newsx/resources/bootstrap/bootstrap-3.3.5-dist/js/bootstrap.min.js" rel="stylesheet"></script>
<script type="text/javascript" src="/newsx/resources/js/canvasjs.min.js" rel="stylesheet"></script>

<script type="text/javascript">
window.onload = function () {
	var chart = new CanvasJS.Chart("chartContainer",
	{
		title:{
			text: "News Categories",
			verticalAlign: 'top',
			horizontalAlign: 'left'
		},
                animationEnabled: true,
               
		data: [
		{        
			type: "doughnut",
			startAngle:20,
			 click:onClick,
			toolTipContent: "{label}: {y} - <strong>#percent%</strong>",
			indexLabel: "{label} #percent%",
			dataPoints:${chartdata}
				/* [
				{  y: 67, label: "Inbox" },
				{  y: 28, label: "Archives" },
				{  y: 10, label: "Labels" },
				{  y: 7,  label: "Drafts"},
				{  y: 4,  label: "Trash"}
			] */
		}
		]
	});
	chart.render();
	
	function onClick(e){
		window.location="/newsx/news/"+e.dataPoint.label;
		
	}
	
}
</script>


</head>
<body>
<nav class="navbar navbar-default">
  <div class="container">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">NewsX</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li><a href="addnews">Add News <span class="sr-only">(current)</span></a></li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->

<div class="col-md-6">
<div class="container">
<div class="row">

 <div id="myCarousel" class="carousel slide" data-ride="carousel">
      <!-- Indicators -->
      <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
      </ol>
      <div class="carousel-inner" role="listbox">
              
        
        <c:forEach items="${carouselnews}" var="n" varStatus="i"> 
        <c:choose>
        <c:when  test="${i.index==0 }">
        
        <div class="item active">
          <img class="third-slide" src="${n.imageURL}" alt="${n.headlines}">
          <div class="container">
            <div class="carousel-caption">
              <h1>${n.headlines}</h1>              
            </div>        
        </c:when>
        <c:otherwise>
         <div class="item">
          <img class="third-slide" src="${n.imageURL }" alt="Third Slide">
          <div class="container">
            <div class="carousel-caption">
              <h1>${n.headlines }</h1>              
            </div>    
        
        </c:otherwise>
        
        </c:choose>
        
        
          </div>
        </div>
        
        </c:forEach>
        
      </div>
      <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
      </a>
      <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
      </a>
    </div><!-- /.carousel -->
</div>

<div class="col-md-4">
<div id="chartContainer"></div>

</div>

<br>
<div class="row">
<div class="col-md-2"></div>
<div class="col-md-8">

<form method="POST" action="/newsx/search">

<div class="input-group">
      <input type="text" name="query" class="form-control" placeholder="Search for..."/>
      <span class="input-group-btn">
        <button class="btn btn-default" type="submit">Go!</button>
      </span>
    </div><!-- /input-group -->
    
    </form>
    
    
    
</div>
<div class="col-md-2"></div>
</div>
<br>
<div class="row">

<c:forEach items="${allnews}" var="news">

<div class="col-md-4">
    <div class="thumbnail">
      <img src="${news.imageURL}" alt="...">
      <div class="caption">
        <h3><a href="/newsx/news?id=${news.id}">${news.headlines}</a></h3>
      </div>
    </div>
  </div>

</c:forEach>

</div>



</nav>





</div>







</body>
</html>
