<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<% 		
		 String NOMBRE = request.getParameter("NOMBRE");
		 
		 String APELLIDO = request.getParameter("APELLIDO");
		
		 String TELEFONO = request.getParameter("TELEFONO");
		
		 String VINCULO = request.getParameter("VINCULO");
		 
		
	 %>
 	
 	 <jsp:useBean id="controlador" scope ="page" class="Controlador.controlador">
 <div id="wrap">	
	<form ACTION= "ConsultaRegistro.jsp" name="formConsulta">	
 	<div class="form-group">
			<label for="exampleInputFile">PERSONA</label>
			<select class="form-control" id="ID" name="ID" placeholder="escoja la persona que desea consultar">
				<% out.println(controlador.selectContact(nOMBRE, aPELLIDO, tELEFONO, vINCULO,iD));%>			
			</select>
	  	</div>	  
		<button type="submit" class="btn btn-default">Consulta</button>
	</form>
	</div>
 </jsp:useBean>	
<body>

</body>
</html>