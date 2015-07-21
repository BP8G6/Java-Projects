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
<title>Contact Info Form</title>
</head>
<body>


<div class="container">

<br>
<br>

<div class="col-md-4">
</div>

<div class="col-md-4">

<form:form method ="POST" action ="/springHibernateRegistration/contactregis" modelAttribute="contactdata" >

 <div class="form-group">
<form:input path="email" class="form-control" name="E-Mail" placeholder="E-Mail"/>
</div>

<div class="form-group">
<form:input path="primaryPhone" class="form-control" name="Primary Phone" placeholder="Primary Phone"/>
</div>

<div class="form-group">
<form:input path="secondaryPhone" class="form-control" name="secondary Phone" placeholder="Secondary Phone"/>
</div>


<%-- <div class="form-group">
<form:input path="country" class="form-control" name="country" placeholder="Enter country"/>
</div> --%>


<!-- <a class="btn btn-primary pull-right" href="/springHibernateRegistration/addressregis">Submit</a> -->

 <button type="submit" class="btn btn-danger">ADD</button> 

</form:form>


</div>

<div class="col-md-4">
</div>

</div>


</body>
</html>