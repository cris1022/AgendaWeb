package TestControler;

import java.util.Date;

import Controlador.controlador;

public class TestContoler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		controlador controlador=new controlador();
		
		System.out.println(controlador.insertar("nombre", "aPELLIDO", "tELEFONO", "vINCULO", "iMAGEN", ""));
	}

}
