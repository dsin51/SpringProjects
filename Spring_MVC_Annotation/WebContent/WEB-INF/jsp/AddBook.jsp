<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>


<title>Insert title here</title>
</head>
<body>

<form:form method="Post" action="bookEntry.htm" >
	
	<label>Book Number</label>
	<form:input path="bookNumber"/>
	
	<label>Book Name</label>
	<form:input path="bookName"/>
	
	<input type="submit" value="Add" />
	
</form:form>




</body>
</html>