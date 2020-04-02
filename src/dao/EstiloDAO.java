package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import modelo.Estilo;


public class EstiloDAO {
	public static void insertarUnEstilo(Estilo e) throws SQLException{
		EnlaceJDBC enlace=new EnlaceJDBC();
		
		String sqlInsert="INSERT INTO estilos (nombre_estilo) VALUES ('"+e.getNomEstilo()+"')";
		enlace.insertar(sqlInsert);
		System.out.println("Se ha insertado el estilo correctamente");
	}
	
	public static void insertarEstiloFichero(Set<String> listaEstilos) throws SQLException{
		EnlaceJDBC enlace;
		enlace=new EnlaceJDBC();
		for(String e: listaEstilos) {
		String sqlInsert="INSERT INTO estilos(nombre_estilo)  VALUES ('"+e+"')";
		enlace.insertar(sqlInsert);
		}
		}
	
	public static void borrarDB(int id) throws SQLException{
		EnlaceJDBC enlace=new EnlaceJDBC();
		
		String sqlInsert="DELETE FROM estilos WHERE id_estilo="+id;
		enlace.insertar(sqlInsert);
		System.out.println("Se ha borrado correctamente");
	}
	public static void actualizarId() throws SQLException{
		EnlaceJDBC enlace=new EnlaceJDBC();
		
		String sqlUpdate="UPDATE  estilos SET id_estilo=id_estilo-169 WHERE id_estilo>169";
		enlace.insertar(sqlUpdate);
		System.out.println("Se han actualizado los id correctamente");
	}
	
	
	public static List<Estilo> listadoEstilo(){
		List<Estilo> listaEstilos=new ArrayList<>();
		EnlaceJDBC enlace;
		String sqlQuery="SELECT *FROM estilos";
		ResultSet rs=null;
		try {
			enlace = new EnlaceJDBC();
			
			
			rs=enlace.seleccionRegistros(sqlQuery);
			while(rs.next()) {
			
				
				listaEstilos.add(new Estilo(rs.getInt(1),rs.getString("nombre_estilo")));
				
			}
			}catch(Exception e) {
				e.printStackTrace();
			}
		return listaEstilos;
		
	}
}
