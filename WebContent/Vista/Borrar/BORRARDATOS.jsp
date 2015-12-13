<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
	<link  rel= "stylesheet" href="../../css/estilo.css"/>
	<link  rel= "stylesheet" href="../../css/bootstrap-3.3.6-dist/css/bootstrap.min.css"/>
	
	<script src ="../../css/bootstrap-3.3.6-dist/js/bootstrap.min.js"></script>
</head>
<body>
<% 		
		 String NOMBRE = request.getParameter("NOMBRE");
		 
		 String APELLIDO = request.getParameter("APELLIDO");
		
		 String TELEFONO = request.getParameter("TELEFONO");
		
		 String VINCULO = request.getParameter("VINCULO");
	 %>
 <jsp:useBean id="controlador" scope ="page" class="Controlador.controlador">
 <div id="wrap">	
	<form ACTION= "BORRARREGISTRO.jsp" name="formBorrar">	
 	<div class="form-group">
			<label for="exampleInputFile">PERSONA</label>
			<select class="form-control" id="ID" name="ID" placeholder="escoja la persna a eliminar">
				<% out.println(controlador.selectBeforeDelete(NOMBRE, APELLIDO, TELEFONO, VINCULO)); %>				
			</select>
	  	</div>	  
		<button type="submit" class="btn btn-default">ELIMINAR</button>
	</form>
	</div>
 </jsp:useBean>	

</body>
</html>