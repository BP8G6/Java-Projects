<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/Cricket/resources/bootstrap/css/bootstrap.css">

<link rel="stylesheet" href="/Cricket/resources/bootstrap/css/navbar.css">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script src="/Cricket/resources/js/navbar.js"></script>

<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.16/angular.min.js"></script>
	
	<script src="http://code.angularjs.org/snapshot/angular.js"></script>

	<script type="text/javascript" src="/Cricket/resources/js/myapp.js"></script>


</head>
</body>


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


<div class="container" ng-app="getHubViewer" ng-controller="MainController">
<div class="col-md-12">
 <%-- <div id="myCarousel" class="carousel slide" data-ride="carousel">
      <!-- Indicators -->
      <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
        <li data-target="#myCarousel" data-slide-to="3"></li>
      </ol>
      <div class="carousel-inner" role="listbox">        
        <c:forEach items="${carouselnews}" var="n" varStatus="i">
        <c:choose>
        <c:when test="${i.index ==0}">
         <div class="item active">
          <img class="third-slide" src="${n.imageurl}">
          <div class="container">
            
          </div>
        </div>
        </c:when>
        <c:otherwise>
         <div class="item">
          <img class="third-slide" src="${n.imageurl}" >
          <div class="container">
           
          </div>
        </div>
        </c:otherwise>
        </c:choose>
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
</div> --%>




		
	<div class="row">
  		<div class="col-md-12" ng-repeat="content in cricketContents">
  			<div class="row">
  			<div class="col-md-6 col-sm-4" ng-repeat="doc in content.docs | limitTo:15" >
  			
  				<div class="panel panel-primary" >
  					<div class="panel-heading"><p>{{doc.headline.main}}</p></div>
  					<div class="panel-body">
  						<a href="#myModal" data-toggle="modal">{{doc.lead_paragraph}}</a>
  							<div id="myModal" class="modal fade container col-md-8">
        						<div class="modal-dialog">
            						<div class="modal-content">
               							 <div class="modal-header">
                   			 				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                   		 					<h4 class="modal-title">{{doc.headline.main}}</h4>
                						</div>
               							<div class="modal-body">
                    						<p>{{doc.lead_paragraph}}</p>
                   						 	<p>Source :  {{doc.source}}</p>
                   						 	<p>Link : <a href="{{doc.web_url}}"> {{doc.web_url}} </a></p>
                						</div>
                						<div class="modal-footer">
                    						<button type="button" class="btn btn-primary" data-dismiss="modal">Close</button>                    			
                						</div>
            					</div>
        					</div>
    					</div>	
  					</div>					
  			 </div>
  		</div>
 	</div>
	</div>
</div>
 </div>
 
</body>
</html>