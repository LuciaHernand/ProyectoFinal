package Control;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import dao.EstiloDAO;
import dao.InterpreteDAO;

import dao.TemaDAO;
import modelo.Estilo;
import modelo.Interpretacion;
import modelo.Interprete;
import modelo.Tema;
import vista.Escritura;
import vista.Lectura;
import vista.ManejoFichero;

public class MainTarea {
	
	static List<Tema> listaTemas=new ArrayList<Tema>();
	static Set<String>  listaEstilos=new HashSet<>();
	static Set<String>  listaInterpretes=new HashSet<>();
	public static   void generarListaTemas(){
		
		List<String> lineasFichero;
		lineasFichero=LecturaF.lecturaFichero("Ficheros/temas.csv");
		lineasFichero.remove(0);
		
		for(String s:lineasFichero) {
			String [] filas=s.split(";");
			if(filas[1].contains("\"")) {
				filas[1]=filas[1].replace("\"","");}
			
			if(filas[2].contains("\"")) {
				filas[2]=filas[2].replace("\"","");}
			
			if(filas[1].contains("'")) {
				filas[1]=filas[1].replace("'","\\'");}
			
			if(filas [2].contains("'")) {
				filas[2]=filas[2].replace("'", "\\'");}
			
			
			listaTemas.add(new Tema(0,filas[1],filas[2]));
		
		}
		
	}
public static   void generarListaTemasEstilo(){
		
		List<String> lineasFichero;
		lineasFichero=LecturaF.lecturaFichero("Ficheros/temas.csv");
		lineasFichero.remove(0);
		
		for(String s:lineasFichero) {
			//Separacion por lineas
			String [] filas=s.split(";");
			//Remplazar caracteres titulo y autor
			if(filas[1].contains("\"")) {
				filas[1]=filas[1].replace("\"","");}
			
			if(filas[2].contains("\"")) {
				filas[2]=filas[2].replace("\"","");}
			
			if(filas[1].contains("'")) {
				filas[1]=filas[1].replace("'","\\'");}
			
			if(filas [2].contains("'")) {
				filas[2]=filas[2].replace("'", "\\'");}
			
			
			listaTemas.add(new Tema(Integer.parseInt(filas[0]),filas[1],filas[2]));
		
			//Tratamiento de estilos
			String [] estilosFila=filas[7].split(",");
			for(String estilo: estilosFila) {
				if(estilo.contains("\"")) {
					estilo=estilo.replace("\"","");}

				if(estilo.contains("'")) {
					estilo=estilo.replace("'","\\'");}
				
				listaEstilos.add(estilo);
			
				
			}
			
		}
	//	Escritura.mostrarString(listaEstilos);
	
	}
public static   void generarListaTemasEstiloInterpretes(){
	
	List<String> lineasFichero;
	lineasFichero=LecturaF.lecturaFichero("Ficheros/temas.csv");
	lineasFichero.remove(0);
	
	for(String s:lineasFichero) {
		//Separacion por lineas
		String [] filas=s.split(";");
		//Remplazar caracteres titulo y autor
		if(filas[1].contains("\"")) {
			filas[1]=filas[1].replace("\"","");}
		
		
		
		if(filas[1].contains("'")) {
			filas[1]=filas[1].replace("'","\\'");}
		
		
		listaTemas.add(new Tema(Integer.parseInt(filas[0]),filas[1],filas[2]));
	
		//Tratamiento de estilos
		String [] estilosFila=filas[7].split(",");
		for(String estilo: estilosFila) {
			if(estilo.contains("\"")) {
				estilo=estilo.replace("\"","");}

			if(estilo.contains("'")) {
				estilo=estilo.replace("'","\\'");}
			
			listaEstilos.add(estilo);
		
			
		}
		//Insercion de Interpretes
		if(filas[2].contains("\"")) {
			filas[2]=filas[2].replace("\"","");
		}
		if(filas[2].contains("'")) {
			filas[2]=filas[2].replace("'","\\'");}
	listaInterpretes.add(filas[2]);
	
	
	}
	
//	Escritura.mostrarString(listaEstilos);

}

	public static void main(String[] args) {
	

		//Lectura in=new Lectura();
		try {
			
			//---------------TEMAS:INSERCION,BORRADO DE FICHERO,LISTADO----------------
			//TemaDAO.insertarUnTema(in.leerTema());
		//	TemaDAO.insertarUnTemaSinAutoNumerico(in.leerTema());
			//TemaDAO.borrarDB(4);
			
			//generarListaTemas();
		//System.out.println(listaTemas.toString());
		//	TemaDAO.insertarTemasFichero(listaTemas);
			//TemaDAO.listadoTemas();
		//Escritura.mostrarTemas(TemaDAO.listadoTemas());
			//List<Tema> listaTemas=TemaDAO.listadoTemas();
			//ManejoFichero.top10(listaTemas);
			
			//TemaDAO.actualizarId();
			//----------------ESTILOS:INSERCION,BORRADO DE FICHERO,LISTADO----------
			
			//generarListaTemasEstilo();
			//EstiloDAO.borrarDB(2);
			//EstiloDAO.borrarDB(1);
			//EstiloDAO.insertarUnEstilo(new Estilo(1,"Rock"));
			//EstiloDAO.insertarEstiloFichero(listaEstilos);
		//Escritura.mostrarEstilos(EstiloDAO.listadoEstilo());
		
			
			//------------Interpretes:insercion,borrado, de fichero, listado-------------
			//generarListaTemasEstiloInterpretes();
			//InterpreteDAO.insertarInterpretesFichero(listaInterpretes);
			//Escritura.mostrarInterprete(InterpreteDAO.listadoInterpretes());
		
			
		//-----------INTERPRETACION: insercion de una interpretacion-------------
			//List<Interprete> listaInterprete=new ArrayList< Interprete>();
			//listaInterprete.add(new Interprete(4,""));
			//listaInterprete.add(new Interprete(100,""));
		//Interpretacion vaI=new Interpretacion(4,Calendar.getInstance(),new Tema(10,"J'irai où tu iras",null),new Estilo(3,""),listaInterprete);	
			//System.out.println(vaI.toString());
			
			//InterpretacionDAO.insertarUnaInterpretacion(vaI);
			
		//	EstiloDAO.actualizarId();
			
			
	//------------INTERPRETACION: insercion de una interpretacion
			
			
		   	//  Interpretacion varInterpretacion=new Interpretacion();
		     // varInterpretacion.setIdInterpretacion(5);
			 // varInterpretacion.setFechaInterpretacion(Calendar.getInstance());
			 // Escritura.mostrarTemas(TemaDAO.listadoTemas());
			 // varInterpretacion.setTemaInterpretacion(new
			 // Tema(Lectura.leerTemaI(),null,null));
			 // Esc1ritura.mostrarEstilos(EstiloDAO.listadoEstilo());
			 // varInterpretacion.setEstiloInterpretacion(new
			 // Estilo(Lectura.leerEstiloI(),null));
			 // Escritura.mostrarInterprete(InterpreteDAO.listadoInterpretes());
			 // List<Interprete> listaInterprete=new ArrayList<>(); for(int
			 // i:Lectura.leerInterpretesI()) { listaInterprete.add(new Interprete(i,null));
			 // } varInterpretacion.setListaInterprete(listaInterprete);
			//  InterpretacionDAO.insertarUnaInterpretacion(varInterpretacion);
		    //  System.out.println(varInterpretacion.toString());
			//	InterpretacionDAO.insertarUnaInterpretacionAN(varInterpretacion);
			//  Escritura.mostrarInterpretacion(InterpretacionDAO.listadoInterpretaciones());
				InterpretacionDAO.modificarIdInterpretacion();
		} catch (Exception e) {
		
			e.printStackTrace();
		}
	
		
	}

}
