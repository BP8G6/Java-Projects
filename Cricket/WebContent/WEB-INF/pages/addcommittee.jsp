<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Committee</title>
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
<div class="row">

<div class="col-md-6">
    <a href="#" class="thumbnail">
      <img src="http://www.topnews.in/sports/files/Team-India.jpg" alt="...">
    </a>
  </div>


<div class="col-md-6">

<div class="row">
  <div class="col-sm-6 col-md-6">
    <div class="thumbnail">    
      <div class="caption">
        <h3>Add Committee</h3>
        </div>
    </div>
  </div>
</div>


		
 
	<form:form method="POST" modelAttribute="committee"	action="/Cricket/addCommittee">
	
	<div class="input-group input-group-sm">
  <span class="input-group-addon" id="sizing-addon1">First Name:</span>
  <form:input type="text" required="true" path="cfname"
						name="FirstName" class="form-control" ></form:input>
</div>
<br>

<div class="input-group input-group-sm">
  <span class="input-group-addon" id="sizing-addon1">Last Name:</span>
 <form:input type="text" required="true" path="clname"
						name="LastName" class="form-control" ></form:input>
</div>
<br>	
	
	
	<div class="input-group input-group-sm">
  <span class="input-group-addon" id="sizing-addon1">Designation:</span>
 <form:select  required="true"
						path="cdesignation" name="Designation" class="form-control" >
						<c:forEach items="${degtypes}" var="d">
					<option value="${d}">${d}</option>
					</c:forEach>
					</form:select>
</div>
<br>
	
		<div class="input-group input-group-sm">
  <span class="input-group-addon" id="sizing-addon1">DOJ:</span>
 <form:input type="date" required="true" path="cdoj"
						class="form-control" ></form:input>
</div>
<br>

	<div class="input-group input-group-sm">
  <span class="input-group-addon" id="sizing-addon1">Description:</span>
 <form:input type="text" required="true" path="cdescription"
						name="Description" class="form-control" ></form:input>
						
</div>


				<br>
<button type="submit" class="btn btn-danger pull-right">ADD</button>
		
		

	 </form:form> 

</div>
</div>
</div>	
</body>
</html>