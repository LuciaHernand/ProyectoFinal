package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import modelo.Estilo;
import modelo.Interprete;

public class InterpreteDAO {
	public static void insertarUnInterprete(Interprete i) throws SQLException{
		EnlaceJDBC enlace=new EnlaceJDBC();
		
		String sqlInsert="INSERT INTO interpretes (nombre_interprete) VALUES ('"+i.getNomInterprete()+"')";
		enlace.insertar(sqlInsert);
		System.out.println("Se ha insetrado correctamente");
	}
	
	public static void insertarInterpretesFichero(Set<String> listaInterpretes) throws SQLException{
		EnlaceJDBC enlace;
		enlace=new EnlaceJDBC();
		for(String i: listaInterpretes) {
		String sqlInsert="INSERT INTO interpretes(nombre_interprete)  VALUES ('"+i+"')";
		enlace.insertar(sqlInsert);
		}
		}
	
	public static void borrarDB(int id) throws SQLException{
		EnlaceJDBC enlace=new EnlaceJDBC();
		
		String sqlInsert="DELETE FROM interpretes WHERE id_interprete="+id;
		enlace.insertar(sqlInsert);
		System.out.println("Se ha borrado correctamente");
	}
	
	
	public static List<Interprete> listadoInterpretes(){
		List<Interprete> listaInterpretes=new ArrayList<>();
		EnlaceJDBC enlace;
		String sqlQuery="SELECT *FROM interpretes";
		ResultSet rs=null;
		try {
			enlace = new EnlaceJDBC();
			
			
			rs=enlace.seleccionRegistros(sqlQuery);
			while(rs.next()) {
			
				
				listaInterpretes.add(new Interprete(rs.getInt(1),rs.getString("nombre_interprete")));
				
			}
			}catch(Exception e) {
				e.printStackTrace();
			}
		return listaInterpretes;
		
	}

}
