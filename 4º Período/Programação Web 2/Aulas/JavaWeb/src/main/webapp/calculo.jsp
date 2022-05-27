<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	int numero1 = Integer.parseInt(request.getParameter("Valor1"));
	int numero2 = Integer.parseInt(request.getParameter("Valor2"));
	
	int result = numero1 + numero2;
	out.print("Resultado = " + result);
%>
</body>
</html>