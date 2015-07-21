<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>

<div class="container">

<nav class="navbar navbar-default">
  <div class="container-fluid">   
         
         
      <a class="navbar-brand" href="#">Login Security</a>   
    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
      
      <security:authorize access="!isAnonymous()">
      
      <security:authorize access="hasAnyRole('ROLE_USER','ROLE_ADMIN')">
        <li ><a href="/LoginSecurity/report">Reports</a></li>
        </security:authorize>
        <security:authorize access="hasAnyRole('ROLE_ADMIN')">
        <li><a href="/LoginSecurity/dashboard">Dashboard</a></li>
        </security:authorize>
       </security:authorize>
      </ul>
      
      <security:authorize access="!isAnonymous()">
           <ul class="nav navbar-nav navbar-right">
            <%-- <li><a href="#">Welcome <security:authentication property="principal.username"/></a></li> --%>
            <li><a href="/LoginSecurity/logout">Logout</a></li>
          </ul>
          </security:authorize>
      
      
      <security:authorize access="isAnonymous()">
      
      <ul class="nav navbar-nav navbar-right">
        <li><a href="/LoginSecurity/signin">login</a></li>
        <li><a href="/LoginSecurity/register">SignUP</a></li>
        
      </ul>
      </security:authorize>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>


</div>

<div class="container">
<h3>This is Home Page</h3>
</div>

</body>
</html>