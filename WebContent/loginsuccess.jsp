<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="index.jsp"></jsp:include>  
<hr/>  
<%@ taglib uri="/struts-tags" prefix="s" %>  
  
<br/>Welcome, <s:property value="username"/>  

</body>
</html>