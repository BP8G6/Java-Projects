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
<title>Address Form</title>
</head>
<body>


<div class="container">

<br>
<br>

<div class="col-md-4">
</div>

<div class="col-md-4">

<form:form method ="POST" action ="/springHibernateRegistration/addressregis" modelAttribute="addrdata" >

 <div class="form-group">
<form:input path="address1" class="form-control" name="Address1" placeholder="Address1"/>
</div>

<div class="form-group">
<form:input path="address2" class="form-control" name="Address2" placeholder="Address2"/>
</div>

<div class="form-group">
<form:input path="zip" class="form-control" name="zip" placeholder="Enter Zip"/>
</div>


<div class="form-group">
<form:input path="country" class="form-control" name="country" placeholder="Enter country"/>
</div>


<!-- <a class="btn btn-primary pull-right" href="/springHibernateRegistration/contactregis">Next</a> -->
 <button type="submit" class="btn btn-danger">ADD</button> 

</form:form>


</div>

<div class="col-md-4">
</div>

</div>

</body>
</html>