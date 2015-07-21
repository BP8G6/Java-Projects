<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="security" uri="http://www.springframework.org/security/tags" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="/springsecurity">Brand</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li><a href="/springsecurity">Home</a></li>
        
      
        
        <security:authorize  ifNotGranted="ROLE_ANONYMOUS">
        
        <security:authorize ifAnyGranted="ROLE_USER,ROLE_ADMIN">
        <li><a href="/springsecurity/reports">Reports</a></li>
        </security:authorize>
       
        <security:authorize ifAnyGranted="ROLE_DASHBOARD,ROLE_ADMIN">
        <li><a href="/springsecurity/dashboard">Dashboard</a></li>
        </security:authorize>
        
        <security:authorize ifAnyGranted="ROLE_ADMIN">
        <li><a href="/springsecurity/admin">Admin</a></li>
        </security:authorize>
        
        </security:authorize>
      </ul>
      <ul class="nav navbar-nav navbar-right">
      <security:authorize ifAnyGranted="ROLE_ANONYMOUS">
        <li><a href="/springsecurity/login">login</a></li>
        </security:authorize>
        
        <security:authorize  ifNotGranted="ROLE_ANONYMOUS">
        <li><a href="#">Welcome <security:authentication property="principal.username"/></a></li>
        <li><a href="/springsecurity/j_spring_security_logout">logout</a></li>
        </security:authorize>
        
        
        
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>


<div class="jumbotron">
<h1>Login</h1>
</div>
<form method="POST" action="/springsecurity/j_spring_security_check">
<div class="container">
<div class="col-md-6">
<div class="input-group">
  <span class="input-group-addon" id="basic-addon1">User Name</span>
  <input type="text" name="j_username" class="form-control" placeholder="Username" aria-describedby="basic-addon1">
</div>
<br>

<div class="input-group">
  <span class="input-group-addon" id="basic-addon1">Password</span>
  <input type="password" name="j_password" class="form-control" placeholder="password" aria-describedby="basic-addon1">
</div>
<br>


<button type="submit" class="pull-right">Login</button>

</div>




</div>
</form>
</body>
</html>