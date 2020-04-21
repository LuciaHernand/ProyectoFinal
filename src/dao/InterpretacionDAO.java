package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.Estilo;
import modelo.Interpretacion;
import modelo.Interprete;
import modelo.Tema;

public class InterpretacionDAO {
	public static void insertarUnaInterpretacion(Interpretacion y) throws SQLException{
		EnlaceJDBC enlace=new EnlaceJDBC();
		
		String sqlInsert="INSERT INTO interpretaciones (id_interpretacion,fecha_interpretacion,id_tema,id_estilo)"
				+ " VALUES ("+y.getIdInterpretacion()+",'"+
		y.obtenerDate()+"',"+y.getTemaInterpretacion().getIdTema()+","+ y.getEstiloInterpretacion().getIdEstilo()+")";
		
		if(enlace.insertar(sqlInsert)) {
			System.out.println("Se ha insertado la interpretacion correctamente.");
			
		}
		for(Interprete interprete: y.getListaInterprete()) {
		sqlInsert="INSERT INTO interpretaciones_interprete VALUES ("+interprete.getIdInterprete()+","+y.getIdInterpretacion()+")";}
	if(enlace.insertar(sqlInsert)) {
		System.out.println("Se ha insertado la relacion interpretacion_interprete correctamente.");
	}
	}
	
	public static void insertarUnaInterpretacionAN(Interpretacion y) throws SQLException{
		EnlaceJDBC enlace=new EnlaceJDBC();
		
		String sqlInsert="INSERT INTO interpretaciones (fecha_interpretacion,id_tema,id_estilo)"
				+ " VALUES ('"+
		y.obtenerDate()+"',"+y.getTemaInterpretacion().getIdTema()+","+ y.getEstiloInterpretacion().getIdEstilo()+")";
		
		if(enlace.insertar(sqlInsert)) {
			System.out.println("Se ha insertado la interpretacion correctamente.");
			
		}
		y.setIdInterpretacion(idIncluidoInterpretacion());
		for(Interprete interprete: y.getListaInterprete()) {
			sqlInsert = "INSERT INTO interpretaciones_interprete VALUES (" + interprete.getIdInterprete() + ","
					+ y.getIdInterpretacion() + ")";}
	if(enlace.insertar(sqlInsert)) {
		System.out.println("Se ha insertado la relacion interpretaciones_interprete correctamente.");
	}
	}
	
	public static int idIncluidoInterpretacion() {
		int id = 0;
		String sqlQuery = "SELECT MAX(id_interpretacion) FROM interpretaciones";

		EnlaceJDBC enlace;
		ResultSet rs = null;

		try {
			enlace = new EnlaceJDBC();
			rs = enlace.seleccionRegistros(sqlQuery);
			rs.next();
			id = rs.getInt(1);

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return id;
	}

	public static List<Interpretacion> listadoInterpretaciones(){
		List<Interpretacion> listaInterpretaciones=new ArrayList<>();
		List<Interprete>  listaInterprete=null;
		EnlaceJDBC enlace;
		String sqlQuery="SELECT interpretaciones.id_interpretacion, interpretaciones.fecha_interpretacion, temas.id_tema,temas.nombre_tema,estilos.id_estilo,estilos.nombre_estilo "
				+ "FROM interpretaciones "
				+ "INNER JOIN temas ON interpretaciones.id_tema=temas.id_tema  "
				+ "INNER JOIN estilos ON interpretaciones.id_estilo=estilos.id_estilo";
		String sqlQueryI=null;
		ResultSet rs=null;
		ResultSet rsI=null;
		Interpretacion varI=null;
		Interprete interprete=null;
		try {
			enlace = new EnlaceJDBC();
			
			
			rs=enlace.seleccionRegistros(sqlQuery);
			while(rs.next()) {
			varI=new Interpretacion();
		varI.setIdInterpretacion(rs.getInt(1));
			varI.grabarCalendar(rs.getDate(2).toString());
			varI.setTemaInterpretacion(new Tema(rs.getInt(3),rs.getString(4),null));
			varI.setEstiloInterpretacion(new Estilo(rs.getInt(5),rs.getString(6)));
			
			//Buscar los interpretes de una interpretacion
			sqlQueryI="SELECT interpretes.id_interprete, interpretes.nombre_interprete FROM interpretaciones_interprete"
					+ "INNER JOIN unterpretes ON interpretaciones_interprete.id_interprete=interpretes.id_interprete"
					+ "WHERE interpretaciones_interprete.id_interpretacion="+varI.getIdInterpretacion();
			
			rsI=enlace.seleccionRegistros(sqlQuery);
			listaInterprete=new ArrayList<>();
			while(rsI.next()) {
			
			
			listaInterprete.add(new Interprete(rsI.getInt(1),rs.getString(4)));
			}
			varI.setListaInterprete(listaInterprete);
			listaInterpretaciones.add(varI);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

		
		return listaInterpretaciones;
		}
	public static void modificarIdInterpretacion() {

		String updateQuery = "UPDATE interpretaciones SET id_interpretacion=4 WHERE id_interpretacion=4000";

		EnlaceJDBC enlace;
		

		try {enlace = new EnlaceJDBC();
			if(enlace.insertar(updateQuery)) {
				System.out.println("Se ha actualizado correctamente.");
			}
			
			
		
			

		} catch (SQLException e) {

			e.printStackTrace();
		}

		
	}

}
