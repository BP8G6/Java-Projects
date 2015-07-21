<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- model Attribute is the object we used in the post method of that url -->

<form:form method="POST" action="/SpringMVC/form" modelAttribute="news"> 

<form:input path="headlines" placeholder="Enter HeadLines"/><br>
<form:input path="mainStory" placeholder="Enter MainStory"/><br>
<form:input path="newsType" placeholder="Enter NewsType"/>
<br>
<button type="submit">Submit</button>
</form:form>
</body>
</html>