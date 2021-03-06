package Controlador;

import BASEDEDATOS.BaseDeDatos;
import Servicio.ServiceContacto;

public class controlador {
	BaseDeDatos controlador1;
	ServiceContacto servicio;
	
	public BaseDeDatos getControlador1() {
		return controlador1;
	}
	public void setControlador1(BaseDeDatos controlador1) {
		this.controlador1 = controlador1;
	}
	public ServiceContacto getServicio() {
		return servicio;
	}
	public void setServicio(ServiceContacto servicio) {
		this.servicio = servicio;
	}
	public controlador() {
		controlador1=new BaseDeDatos();
		servicio = new ServiceContacto(controlador1);
	}
	 public String insertar(String nOMBRE, String aPELLIDO, String tELEFONO, String vINCULO, String iMAGEN, String fNACIMIENTO){
		 
		 return servicio.insertar(nOMBRE, aPELLIDO, tELEFONO, vINCULO, iMAGEN, fNACIMIENTO);
	 }
	 public String Eliminar(String nOMBRE, String aPELLIDO, String tELEFONO, String vINCULO, String iMAGEN, String fNACIMIENTO, String iD){
		 return servicio.Eliminar(nOMBRE, aPELLIDO, tELEFONO, vINCULO, iMAGEN, fNACIMIENTO, iD);
	 }
	public String EliminarId( String iD){
			 return servicio.Eliminar(null, null, null, null, null, null, iD);	
			 
		 
	 }
	public String consultargeneral(String nOMBRE, String aPELLIDO, String tELEFONO, String vINCULO,String iD){
		 return servicio.selectContact(nOMBRE, aPELLIDO, tELEFONO, vINCULO,iD);
	}

	
	 public String Modificar(String nOMBRE, String aPELLIDO, String tELEFONO, String vINCULO, String iMAGEN, String fNACIMIENTO, String iD){ 
		 return servicio.Modificar(nOMBRE, aPELLIDO, tELEFONO, vINCULO, iMAGEN, fNACIMIENTO, iD);
	 }
	 public String ConsultarNombre(String nOMBRE){
		 return servicio.ConsultarNombre(nOMBRE);
	 }
	 
	 public String ConsultarApellido(String Apellido){ 
		 return servicio.ConsultarApellido(Apellido);
	 }
	 
	 public String ConsultarTelefono(String Telefono){ 
		 return servicio.ConsultarTelefono(Telefono);
	 }
	 
	 public String ConsultarVinculo(String Vinculo){
		 return servicio.ConsultarVinculo(Vinculo);
	 }
	 
	 public String selectBeforeDelete(String nOMBRE, String aPELLIDO, String tELEFONO, String vINCULO){
		 return servicio.selectBeforeDelete(nOMBRE, aPELLIDO, tELEFONO, vINCULO);
	 }
	 public String selectContact(String nOMBRE, String aPELLIDO, String tELEFONO, String vINCULO){
		 return servicio.selectBeforeDelete(nOMBRE, aPELLIDO, tELEFONO, vINCULO);
}
}
