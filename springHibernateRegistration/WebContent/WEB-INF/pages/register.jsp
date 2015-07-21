<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registratin Page</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">


<!-- Google font -->
    <link href='http://fonts.googleapis.com/css?family=Lato:300,400,700' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Raleway:300,400,700,900' rel='stylesheet' type='text/css'>
    <!-- Css -->
    <link rel="stylesheet" type="text/css" href="http://companyinfoz.com/css/library/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="http://companyinfoz.com/css/library/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="http://companyinfoz.com/css/library/owl.carousel.css">
    <link rel="stylesheet" type="text/css" href="http://companyinfoz.com/css/md-font.css">
    <link rel="stylesheet" type="text/css" href="http://companyinfoz.com/css/style.css">
    <!-- Latest compiled and minified CSS -->



</head>
<body>


	
 <!-- SECTION 1 -->
     <section class="login-content" id="login-content">
        <div class="container">
            <div class="row" style="text-align:center;">
   				 <!-- FORM -->
   				
                <div class="col-xs-4 col-lg-12">
                    <div class="form-login" style="background-color:#012340;">
                    
                       <form:form method ="POST" action ="/springHibernateRegistration/registration" modelAttribute="FormData" >
                       <h2 class="text-uppercase">New  Registration</h2>
                             <p style="color:#37abf2;"></p>
                             
                             <div class="form-group">
                             <form:input type="text" path="firstName" name="fname" class="form-control"  placeholder="First Name"/>
                            </div>
                            <div class="form-group"> 
                             <form:input type="text" path="lastName" name="lname" class="form-control"  placeholder="Last Name"/>
                            </div>
                            
                            <div class="form-group"> 
                             <form:input type="text" path="citizenship" name="citizenship" class="form-control"  placeholder="Citizenship"/>
                            </div>
                            <div class="form-group"> 
                             <form:input type="text" path="clientName" name="clientName" class="form-control"  placeholder="clientName"/>
                            </div>
                            <div class="form-group"> 
                             <form:input type="text" path="clientAddress1" name="clientAddress1" class="form-control"  placeholder="clientAddress1"/>
                            </div>
                            <div class="form-group"> 
                             <form:input type="text" path="clientAddress2" name="clientAddress2" class="form-control"  placeholder="clientAddress2"/>
                            </div>
                             <div class="form-group"> 
                             <form:input type="text" path="clientZip" name="clientZip" class="form-control"  placeholder="clientZip"/>
                            </div>
                            
                            <div class="form-group"> 
                             <form:input type="text" path="clientCountry" name="clientCountry" class="form-control"  placeholder="clientCountry"/>
                            </div>
                            
                             <div class="form-email"> 
                             <form:input type="text" path="email" name="email" class="form-control"  placeholder="email"/>
                            </div>
                            
                             <div class="form-group"> 
                             <form:input type="text" path="primaryPhone" name="primaryPhone" class="form-control"  placeholder="primaryPhone"/>
                            </div>
                            
                             <div class="form-group"> 
                             <form:input type="text" path="secondaryPhone" name="secondaryPhone" class="form-control"  placeholder="secondaryPhone"/>
                            </div>
                            <div class="form-group"> 
                             <form:input type="text" path="address1" name="address1" class="form-control"  placeholder="address1"/>
                            </div>
                            
                            <div class="form-group"> 
                             <form:input type="text" path="address2" name="address2" class="form-control"  placeholder="address2"/>
                            </div>
                            
                            <div class="form-group"> 
                             <form:input type="text" path="zip" name="zip" class="form-control"  placeholder="zip"/>
                            </div>
                              <div class="form-group"> 
                             <form:input type="text" path="country" name="country" class="form-control"  placeholder="country"/>
                            </div>
                             <br>
                            <br>
                     	<div class="btn-group btn-group-justified" role="group" aria-label="...">
						  <div class="btn-group" role="group">
						    <button type="submit" class="btn btn-default">Submit</button>
						  </div>
						  <div class="btn-group" role="group">
						    <button type="reset" class="btn btn-default">Reset</button>
						  </div>
		
						</div>
                     </form:form>
                     </div>
                      
                     </div>
                 
                </div>
               
                <!-- END / FORM -->
               
                <!-- END / FORM -->
    
            </div>
    
  </section>        
    <!-- END / SECTION 1 -->


<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>



</body>
</html>