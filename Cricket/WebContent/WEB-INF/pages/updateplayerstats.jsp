<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Players</title>
<link rel="stylesheet" href="/Cricket/resources/bootstrap/css/bootstrap.css">

<link rel="stylesheet" href="/Cricket/resources/bootstrap/css/navbar.css">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script src="/Cricket/resources/js/navbar.js"></script> 

</head>
<body>


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
<div class="jumbotron">
<div class="container">
  <h4>${updateplayerinfo.fname} ${updateplayerinfo.lname}</h4>
  </div>
</div>


<div class="container">
<div class="col-md-6">
  
 <form:form method="POST" modelAttribute="playstats" action="/Cricket/updateStats?id=${updateplayerinfo.id}"> 
 
<div class="input-group input-group-sm">
  <span class="input-group-addon" id="sizing-addon1">Matches</span>
  <form:input type="text" required="true" path="no_mathches"  class="form-control" placeholder="Matches" aria-describedby="sizing-addon3"/>
</div>
<br>
<div class="input-group input-group-sm">
  <span class="input-group-addon" id="sizing-addon2">Runs</span>
  <form:input type="text" class="form-control" required="true" path="no_runs" placeholder="runs" aria-describedby="sizing-addon3"/>
</div>
<br>
<div class="input-group input-group-sm">
  <span class="input-group-addon" id="sizing-addon3">Wickets</span>
  <form:input type="text" class="form-control" required="true" path="no_wickets" placeholder="wickets" aria-describedby="sizing-addon3"/>
</div>
<br>
<div class="input-group input-group-sm">
  <span class="input-group-addon" id="sizing-addon4">Economy</span>
  <form:input type="text" class="form-control" required="true" path="ecomnomy" placeholder="economy" aria-describedby="sizing-addon3"/>
</div>
<br>
<div class="input-group input-group-sm">
  <span class="input-group-addon" id="sizing-addon4">Average</span>
  <form:input type="text" class="form-control" required="true" path="average" placeholder="average" aria-describedby="sizing-addon3"/>
</div>
<br>
<div class="input-group input-group-sm">
  <span class="input-group-addon" id="sizing-addon5">StrikeRate</span>
  <form:input type="text" class="form-control" required="true" path="strikerate" placeholder="strikerate" aria-describedby="sizing-addon3"/>
</div>
<br><%-- href="/Cricket/updateStats?id=${updateplayerinfo.id}"  --%>
<form:button type="submit" class="btn btn-danger pull-right">Save</form:button>

</form:form>
</div>
<div class="col-md-6">
    <a href="#" class="thumbnail">
      <img src="${updateplayerinfo.imageurl}" alt="...">
    </a>
  </div>
</div>
</div>
</body>
</html>