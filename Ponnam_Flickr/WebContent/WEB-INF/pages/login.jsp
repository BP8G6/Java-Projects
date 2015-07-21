<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>


<div class="container">

<div class="col-md-4"></div>

<div class="col-md-6">

<form:form method="post" action="/Ponnam_Flickr/login/" modelAttribute="logindata">
            <div class="form-group">
              <form:input type="text" path="email" placeholder="E-Mail" class="form-control"/>
            </div>
            <div class="form-group">
              <form:input type="password" path="password" placeholder="Password" class="form-control"/>
            </div>
            <button type="submit" class="btn btn-success pull-right">Sign in</button>
          </form:form>

</div>

</div>
</body>
</html>