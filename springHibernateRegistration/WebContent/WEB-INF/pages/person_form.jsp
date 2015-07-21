<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
       <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">

<title>Person Registration</title>
</head>
<body>

<div class="container">

<br>
<br>

<div class="col-md-4">
</div>

<div class="col-md-4">

<form:form method ="POST" action ="/springHibernateRegistration/personreg/" modelAttribute="perdata" >

 <div class="form-group">
<form:input path="firstName" class="form-control" name="FirstName" placeholder="First Name"/>
</div>

<div class="form-group">
<form:input path="lastName" class="form-control" name="LastName" placeholder="Enter Last Name"/>
</div>

<div class="form-group">
<form:input path="citizenship" class="form-control" name="citizenship" placeholder="Enter Citizenship"/>
</div>

 <button type="submit" class="btn btn-danger">ADD</button> 

<!-- <a class="btn btn-primary pull-right" href="/springHibernateRegistration/emphistreg">Next</a> -->

</form:form>


</div>

<div class="col-md-4">
</div>

</div>
</body>
</html>