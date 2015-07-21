<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employment History Form</title>
</head>
<body>



<div class="container">

<br>
<br>

<div class="col-md-4">
</div>

<div class="col-md-4">

<form:form method ="POST" action ="/springHibernateRegistration/emphistreg" modelAttribute="emphistdata" >

 <div class="form-group">
<form:input path="clientName" class="form-control" name="ClientName" placeholder="Client Name"/>
</div>

<div class="form-group">
<form:input path="clientAddress1" class="form-control" name="ClientAddress1" placeholder="Client Address1"/>
</div>

<div class="form-group">
<form:input path="clientAddress2" class="form-control" name="ClientAddress2" placeholder="Client Address2"/>
</div>

<div class="form-group">
<form:input path="clientZip" class="form-control" name="clientZip" placeholder="client Zip"/>
</div>

<div class="form-group">
<form:input path="clientCountry" class="form-control" name="clientCountry" placeholder="client Country"/>
</div>


<!-- <a class="btn btn-primary pull-right" href="/springHibernateRegistration/addressregis">Next</a> -->
 <button type="submit" class="btn btn-danger">ADD</button> 

</form:form>
</div>


<div class="col-md-4">
</div>

</div>

</body>
</html>