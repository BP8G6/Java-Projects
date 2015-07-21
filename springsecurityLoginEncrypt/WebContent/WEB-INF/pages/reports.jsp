<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
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

<nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="/springsecurityLoginEncrypt">Spring Security</a>
        </div>
          <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
          
          <security:authorize access="!isAnonymous()">
          
          <security:authorize access="hasAnyRole('ROLE_USER','ROLE_ADMIN')">
            <li><a href="/springsecurityLoginEncrypt/reports">Reports</a></li>
            </security:authorize>
            <security:authorize access="hasAnyRole('ROLE_DASHBOARD','ROLE_ADMIN')">
            <li><a href="/springsecurityLoginEncrypt/dashboard">Dashboard</a></li>
            </security:authorize>
            <security:authorize access="hasRole('ROLE_ADMIN')">
            <li><a href="/springsecurityLoginEncrypt/admin">Admin</a></li>
            </security:authorize>
            
            
            
            </security:authorize>
            
            
          </ul>
       
          <security:authorize access="!isAnonymous()">
           <ul class="nav navbar-nav navbar-right">
            <li><a href="#">Welcome <security:authentication property="principal.username"/></a></li>
            <li><a href="/springsecurityLoginEncrypt/logout">Logout</a></li>
          </ul>
          </security:authorize>
          
          <security:authorize access="isAnonymous()">
          
          
          <form method="post" action="/springsecurityLoginEncrypt/login"  class="navbar-form navbar-right">
            <div class="form-group">
              <input type="text" name="username" placeholder=" Enter Username" class="form-control">
            </div>
            <div class="form-group">
              <input type="password" name="password" placeholder="Enter Password" class="form-control">
            </div>
            <button type="submit" class="btn btn-success">Sign in</button>
          </form>
          <ul class="nav navbar-nav navbar-right">
          <li><a href="/springsecurityLoginEncrypt/register">Register</a></li>
          </ul>
          </security:authorize>
          
        </div><!--/.navbar-collapse -->
      </div>
    </nav>


    
<div class="container">
<div class="jumbotron">
<h1>This is Reports Page</h1>
</div>

</div>
</body>
</html>