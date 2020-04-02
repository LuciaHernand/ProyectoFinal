package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.Tema;

public class TemaDAO {
	public static void insertarUnTema(Tema t) throws SQLException{
		EnlaceJDBC enlace=new EnlaceJDBC();
		
		String sqlInsert="INSERT INTO temas (nombre_tema,autor_tema) VALUES ('"+t.getNombreTema()+"','"+
		t.getAutorTema()+"')";
		enlace.insertar(sqlInsert);
	}
	public static void insertarUnTemaNombre(Tema t) throws SQLException{
		EnlaceJDBC enlace=new EnlaceJDBC();
		
		String sqlInsert="INSERT INTO temas (nombre_tema) VALUES ('"+t.getNombreTema()+
		"')";
		enlace.insertar(sqlInsert);
	}
	public static void insertarUnTemaSinAutoNumerico(Tema t) throws SQLException{
		EnlaceJDBC enlace=new EnlaceJDBC();
		
		String sqlInsert="INSERT INTO temas (id_tema,nombre_tema,autor_tema) VALUES (1,'"+t.getNombreTema()+"','"+
		t.getAutorTema()+"')";
		enlace.insertar(sqlInsert);
	}
	public static void borrarDB(int id) throws SQLException{
		EnlaceJDBC enlace=new EnlaceJDBC();
		
		String sqlInsert="DELETE FROM temas WHERE id_tema="+id;
		enlace.insertar(sqlInsert);
	}
	public static void actualizarId() throws SQLException{
		EnlaceJDBC enlace=new EnlaceJDBC();
		
		String sqlUpdate="UPDATE  temas SET id_tema=id_tema-60549 WHERE id_tema>60549";
		enlace.insertar(sqlUpdate);
		System.out.println("Se han actualizado los id correctamente");
	}
	
	public static void insertarTemasFichero(List<Tema> listaTemas) throws SQLException{
		EnlaceJDBC enlace=new EnlaceJDBC();
		for(Tema t: listaTemas) {
		String sqlInsert="INSERT INTO temas  VALUES ('"+t.getIdTema()+"','"+t.getNombreTema()+"','"+t.getAutorTema()+"')";
		enlace.insertar(sqlInsert);}
	}
	public static List<Tema> listadoTemas(){
	List<Tema> listaTemas=new ArrayList<>();
	EnlaceJDBC enlace;
	String sqlQuery="SELECT id_tema,nombre_tema,autor_tema FROM temas";
	ResultSet rs=null;
	try {
		enlace = new EnlaceJDBC();
		
		
		rs=enlace.seleccionRegistros(sqlQuery);
		while(rs.next()) {
		
			
			listaTemas.add(new Tema(rs.getInt(1),rs.getString("nombre_tema"),rs.getString("autor_tema")));
			
		}
	} catch (SQLException e) {
		
		e.printStackTrace();
	}

	
	return listaTemas;
	}
	

}
