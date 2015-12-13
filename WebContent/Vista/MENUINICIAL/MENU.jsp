<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MENU</title>

	<link  rel= "stylesheet" href="../../css/estilo.css"/>	
	<link  rel= "stylesheet" href="../../css/bootstrap-3.3.6-dist/css/bootstrap.min.css"/>
	
	<script src ="../../css/bootstrap-3.3.6-dist/js/bootstrap.min.js"></script>
</head>
<body>
<div class="dropdown">
  <button class="btn dropdown-toggle sr-only" type="button"
          id="dropdownMenu1" data-toggle="dropdown">
    Menú de la agenda
    <span class="caret"></span>
  </button>
 
 	<div class="btn-group-vertical" role="group" aria-label="Vertical button group">  		
		<button type="button" class="btn btn-default"><a role="menuitem" tabindex="-1" href="../Ingresar/Ingreso.jsp" >INGRESAR DATOS</a></button>
		<button type="button" class="btn btn-default"><a role="menuitem" tabindex="-1" href="../Borrar/BORRARCONTACTO.jsp">BORRAR CONTACTO</a></button>
		<button type="button" class="btn btn-default"><a role="menuitem" tabindex="-1" href="#">CONSULTAR CONTACTO</a></button>
		<button type="button" class="btn btn-default"><a role="menuitem" tabindex="-1" href="#">MODIFICARCONTACTO</a></button>
	</div>  
</div>

</body>
</html>