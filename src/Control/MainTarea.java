package Control;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.Escritura;
import dao.LecturaF;
import dao.TemaDAO;
import modelo.Tema;
import vista.Lectura;

public class MainTarea {
	
	static List<Tema> listaTemas=new ArrayList<Tema>();
	
	public static void  generarListaTemas(){
		
		List<String> lineasFichero;
		lineasFichero=LecturaF.lecturaFichero("Ficheros/karafuncatalog.csv");
		lineasFichero.remove(0);
		for(String s:lineasFichero) {
			String [] filas=s.split(";");
			if(filas[1].contains("\"")) {
				filas[1]=filas[1].replace("\"","");
			
			
			}
			if(filas[1].contains("'")) {
				filas[1]=filas[1].replace("'","\'");
			
			}
			listaTemas.add(new Tema(0,filas[1],null));
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lectura in=new Lectura();
		try {
			//TemaDAO.insertarUnTema(in.leerTema());
		//	TemaDAO.insertarUnTemaSinAutoNumerico(in.leerTema());
			//TemaDAO.borrarDB(4);
			//generarListaTemas();
			//TemaDAO.insertarTemasFichero(listaTemas);
			//TemaDAO.listadoTemas();
			Escritura.mostrarPantalla(TemaDAO.listadoTemas());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

}
