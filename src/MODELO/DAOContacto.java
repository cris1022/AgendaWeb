package MODELO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import BASEDEDATOS.BaseDeDatos;

public class DAOContacto {
	
	private EntityContacto entityContacto;
	
	private BaseDeDatos baseDeDatos;
	
	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	
	public DAOContacto() {
		
		super();
	}
	
	public DAOContacto(EntityContacto entityContacto, BaseDeDatos baseDeDatos) {
	
		this.entityContacto = entityContacto;
		
		this.baseDeDatos = baseDeDatos;
	}
	
	public String selectTelefono(){
		String sql="select * from contacto where telefono like '%"+entityContacto.getTELEFONO()+"%'";
		return baseDeDatos.getTablaHTML(sql);
	}
	
	public String selectNOMBRE(){
		String sql="select * from contacto where NOMBRE like '%"+entityContacto.getNOMBRE()+"%'";
		return baseDeDatos.getTablaHTML(sql);
	
	}
	
	public String selectAPELLIDO(){
		String sql="select * from contacto where APELLIDO like '%"+entityContacto.getAPELLIDO()+"%'";
		return baseDeDatos.getTablaHTML(sql);
	}
	
	public String selectVINCULO(){
		String sql="select * from contacto where VINCULO like '%"+entityContacto.getVINCULO()+"%'";
		return baseDeDatos.getTablaHTML(sql);
}
	public String InsertarContaCTO(){
		this.entityContacto.setID(baseDeDatos.getConsecutivo("contacto", "ID"));
		String sql="INSERT INTO contacto (NOMBRE, APELLIDO, TELEFONO, FNACIMIENTO, VINCULO, IMAGEN, ID) "
				+ "VALUES ('"+entityContacto.getNOMBRE()+"', '"+entityContacto.getAPELLIDO()+"', '"
				+entityContacto.getTELEFONO()+"', '"+format.format(entityContacto.getFNACIMIENTO())+"', '"+entityContacto.getVINCULO()+
				"', '"+entityContacto.getIMAGEN()+"', "+entityContacto.getID()+")";
		
		 if(baseDeDatos.ejecutarActualizacionSQL(sql))
			 return "Si pudo insertar";
	     else
	         return "No pudo insertar";

	}
	
	public String EliminarContacto(){
		String sql="DELETE FROM contacto WHERE ID="+entityContacto.getID();
		
		System.out.println(sql);
		
		 if(baseDeDatos.ejecutarActualizacionSQL(sql))
			 return "Si pudo ELIMINAR";
	     else
	         return "No pudo ELIMINAR";

	}
	public String ConsultarContacto(){
		String sql="SELECT * FROM contacto WHERE ID="+entityContacto.getID();
		
		System.out.println(sql);
		
		 return (baseDeDatos.getTablaHTML(sql));
		

	}
	
	public String ModificarContacto(){
		
		String sql = "UPDATE contacto SET NOMBRE ='"+entityContacto.getNOMBRE()+"', APELLIDO ='"+entityContacto.getAPELLIDO()+"', TELEFONO='"+entityContacto.getTELEFONO()+"', FNACIMIENTO='"+format.format(entityContacto.getFNACIMIENTO())+
				"' WHERE  ID="+entityContacto.getID();
		 if(baseDeDatos.ejecutarActualizacionSQL(sql))
			 return "Si pudo MODEFICAR";
	     else
	         return "No pudo MODIFICAR";
		
	}

	public String selectContact(){
		String sql="select * from contacto where "; 
		String condicional="";

		if(!entityContacto.getTELEFONO().isEmpty()){			
			sql+=condicional+" TELEFONO like '%"+entityContacto.getTELEFONO()+"%' ";
			if(condicional.isEmpty())
				condicional=" or ";
		}
		if(!entityContacto.getNOMBRE().isEmpty()){			
			sql+=condicional+" NOMBRE like '%"+entityContacto.getNOMBRE()+"%'";
			if(condicional.isEmpty())
				condicional=" or ";
		}if(!entityContacto.getAPELLIDO().isEmpty()){			
			sql+=condicional+" APELLIDO='%"+entityContacto.getAPELLIDO()+"%' ";
			if(condicional.isEmpty())
				condicional=" or ";
		}if(!entityContacto.getVINCULO().isEmpty()){			
			sql+=condicional+" VINCULO='"+entityContacto.getVINCULO()+"' ";
			if(condicional.isEmpty())
				condicional=" or ";
		}
		
		System.out.println(sql);
		
		return baseDeDatos.getTablaHTML(sql);
	}
	
	public EntityContacto cargarContacto(){
		String sql="SELECT * FROM contacto WHERE ID="+entityContacto.getID();
		
		ResultSet response=baseDeDatos.ejecutarSQL(sql);
		
		try {
			if(response.next()){
				entityContacto.setAPELLIDO(response.getString("APELLIDO"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return entityContacto;
	}
	public ArrayList<String> selectBeforeDelete(){
		String sql="select * from contacto where "; 
		String condicional="";

		if(!entityContacto.getTELEFONO().isEmpty()){			
			sql+=condicional+" TELEFONO like '%"+entityContacto.getTELEFONO()+"%' ";
			if(condicional.isEmpty())
				condicional=" or ";
		}
		if(!entityContacto.getNOMBRE().isEmpty()){			
			sql+=condicional+" NOMBRE like '%"+entityContacto.getNOMBRE()+"%'";
			if(condicional.isEmpty())
				condicional=" or ";
		}if(!entityContacto.getAPELLIDO().isEmpty()){			
			sql+=condicional+" APELLIDO='%"+entityContacto.getAPELLIDO()+"%' ";
			if(condicional.isEmpty())
				condicional=" or ";
		}if(!entityContacto.getVINCULO().isEmpty()){			
			sql+=condicional+" VINCULO='"+entityContacto.getVINCULO()+"' ";
			if(condicional.isEmpty())
				condicional=" or ";
		}
		
		System.out.println(sql);
		
		return baseDeDatos.getConsultaSQL(sql);
	
}
	}

