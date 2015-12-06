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
	<div id="wrap">	
	<form ACTION= "IngresoDatos.jsp" name="formIngreso">		
  	
	  	<div class="form-group">	   
		    <label for="NOMBRE">NOMBRE</label>		   
		    <input type="TEXT" class="form-control" id="NOMBRE" name="NOMBRE" placeholder="DIGITE NOMBRE">	  	
	  	</div>
	  	
	  	<div class="form-group">	    
		    <label for="APELLIDO">APELLIDO</label>		   
		    <input type="TEXT" class="form-control" id="APELLIDO" name="APELLIDO" placeholder="DIGITE APELLIDO">	  	
	  	</div>
	  	
	  	<div class="form-group">	  
		    <label for="TELEFONO">TELEFONO </label>		    
		    <input type="TEXT" class="form-control" id="TELEFONO" name="TELEFONO" placeholder="DIGITE EL TELEFONO">	  	
	  	</div>
	  	
	  	<div class="form-group">	   
	    	<label for="FECHA DE NACIMIENTO"> FNACIMIENTO </label>	    
	    	<input type="TEXT" class="form-control" id="FECHADENACIMIENTO" name="FECHADENACIMIENTO" placeholder="DIA/MES/AÑO">	 	
	 	</div>
	 	
	 	<div class="form-group">
		    <label for="exampleInputFile">IMAGEN</label>
		    <input type="file" id="IMAGEN" name= "IMAGEN">
		    <p class="help-block">Adjunte el archivo.</p>
	  	</div>
	  	
	  	<div class="form-group">
			<label for="exampleInputFile">VINCULO</label>
			<select class="form-control" id="VINCULO" name="VINCULO" placeholder="escoja el vinculo">
				<option>PAPA</option>
				<option>MAMA</option>
				<option>HERMANO(A)</option>
				<option>TIO(A)</option>
				<option>PRIMO(A)</option>
				<option>ABUELO(A)</option>
				<option>AMIGO(A)</option>
				<option>COMPAÑERO(A)</option>
				<option>PROFESOR(A)</option>
			</select>
	  	</div>
	  
	  	<button type="GUARDAR" class="btn btn-default">GUARDAR</button>
	</form>
	</div>
</body>
</html>