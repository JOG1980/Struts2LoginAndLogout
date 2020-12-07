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
  
<s:form action="loginprocess">  
<s:textfield name="username" label="Name"></s:textfield>  
<s:password name="userpass" label="Password"></s:password>  
<s:submit value="login"></s:submit>  
</s:form>  

</body>
</html>