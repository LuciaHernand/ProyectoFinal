package vista;

import java.util.ArrayList;
import java.util.List;

import Control.EscrituraF;
import modelo.Tema;

public class ManejoFichero {
	public static void top10(List<Tema> listaTemas) {
		List<String> contenidoFichero=new ArrayList<>();
		
		contenidoFichero.add("\t\t\tLISTADO DE LOS 10 PRIMEROS TEMAS");
		contenidoFichero.add("-------------------------------------------\n\n\n");
      int contador=1;
		while(contador<=10) {
			
			contenidoFichero.add(contador+" : "+listaTemas.get(contador).getNombreTema());
			contador++;
		
		}
		EscrituraF.escribirFichero("Ficheros/top10.txt", contenidoFichero);
		
		
	}

}
