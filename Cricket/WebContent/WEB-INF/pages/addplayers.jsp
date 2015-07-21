<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
       <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Players</title>
<link rel="stylesheet" href="/Cricket/resources/bootstrap/css/bootstrap.css">

<link rel="stylesheet" href="/Cricket/resources/bootstrap/css/navbar.css">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script src="/Cricket/resources/js/navbar.js"></script>  

	
</head>
<body >


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
	<h1>ADD PLAYERS</h1>
<form:form method="POST" modelAttribute="play" action="/Cricket/addPlayer"> 


<div class="input-group input-group-sm">
  <span class="input-group-addon" id="sizing-addon1">First Name:</span>
  <form:input type="text" path="fname" name="FirstName" class="form-control"/>
</div>
<br>
<div class="input-group input-group-sm">
  <span class="input-group-addon" id="sizing-addon1">Last Name:</span>
   <form:input type="text" path="lname" required="true" name="LastName" class="form-control"/>
</div>
	<br>
 <div class="input-group input-group-sm">
  <span class="input-group-addon" id="sizing-addon1">Date of Birth:</span>
   <form:input type="text" path="dob" required="true" name="DOB" class="form-control"/>
</div>
<br>
<div class="input-group input-group-sm">
  <span class="input-group-addon" id="sizing-addon1">Player Type:</span>
   <form:select  required="true" path="type" name="Type" class="form-control" >
						<c:forEach items="${playertypes}" var="p">
					<option value="${p}">${p}</option>
					</c:forEach>
					</form:select>
</div>

<br>
<div class="input-group input-group-sm">
  <span class="input-group-addon" id="sizing-addon1">State:</span>
<form:select  required="true" path="state" name="State" class="form-control" >
						<c:forEach items="${statetypes}" var="state">
					<option value="${state}">${state}</option>
					</c:forEach>
					</form:select>
</div>

<br>
<div class="input-group input-group-sm">
  <span class="input-group-addon" id="sizing-addon1">Height:</span>
<form:input type="text" path="height" name="Height" class="form-control"/>
</div>
<br>

<div class="input-group input-group-sm">
  <span class="input-group-addon" id="sizing-addon1">Image Url:</span>
<form:input type="text" path="imageurl" class="form-control"/>
</div>
<br>
<div class="input-group input-group-sm">
  <span class="input-group-addon" id="sizing-addon1">Date Of Joining:</span>
<form:input type="date" path="year_of_joining" class="form-control"/>
</div>
<br>
<div class="input-group input-group-sm">
  <span class="input-group-addon" id="sizing-addon1">Status:</span>
<form:input type="text" path="status" class="form-control"/>
</div>
<br>
<div class="input-group input-group-sm">
  <span class="input-group-addon" id="sizing-addon1">Description:</span>
<form:input type="text" path="description" name="Description" class="form-control"/>
</div>

<br>
<button type="submit" class="btn btn-danger">ADD</button>

 


</form:form> 

</div>


<div class="col-md-6">

<br><br><br><br>


 <div id="myCarousel" class="carousel slide" data-ride="carousel">
      <!-- Indicators -->
      <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
      </ol>
      <div class="carousel-inner" role="listbox">
              
        
        <c:forEach items="${allplayers}" var="n" varStatus="i"> 
        <c:choose>
        <c:when  test="${i.index==0 }">
        
        <div class="item active">
          <img class="third-slide" src="${n.imageurl}" alt="${n.fname}">
          <div class="container">
            <div class="carousel-caption">
              <h1>${n.fname}</h1>              
            </div>        
        </c:when>
        <c:otherwise>
         <div class="item">
          <img class="third-slide" src="${n.imageurl }" alt="Third Slide">
          <div class="container">
            <div class="carousel-caption">
              <h1>${n.fname}</h1>              
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



</body>
</html>