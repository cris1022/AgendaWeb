<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	 <% 
		 String ID = request.getParameter("ID");
		
		 String NOMBRE = request.getParameter("NOMBRE");
		 
		 String APELLIDO = request.getParameter("APELLIDO");
		
		 String TELEFONO = request.getParameter("TELEFONO");
		
		 String FNACIMIENTO = request.getParameter("FECHADENACIMIENTO");
		
		 String VINCULO = request.getParameter("VINCULO");
		 
		 String IMAGEN = request.getParameter("IMAGEN");
	 %>
 <jsp:useBean id="controlador" scope ="page" class="Contrelador.controlador">
 	
 	<% out.println(controlador.insertar( NOMBRE, APELLIDO, TELEFONO, VINCULO,IMAGEN ,FNACIMIENTO,ID)); %>

 </jsp:useBean>	
 	
</body>
</html>