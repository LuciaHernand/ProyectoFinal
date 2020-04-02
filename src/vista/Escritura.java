package vista;

import java.util.List;
import java.util.Set;

import modelo.Estilo;
import modelo.Interpretacion;
import modelo.Interprete;
import modelo.Tema;

public class Escritura {
	public static void mostrarPantalla(List<Tema> listaT){
		for(Tema t: listaT) {
			
			System.out.println(t.toString());
		}
		
	}
	public static void mostrarEstilos(List<Estilo> lista){
		for(Estilo e: lista) {
			
			System.out.println(e.toString());
		}
		}
		public static void mostrarInterprete(List<Interprete> lista){
			for(Interprete  i: lista) {
				
				System.out.println(i.toString());
			}
		
	}
	public static void mostrarTemas(List<Tema> listaT){
			for(Tema t: listaT) {
				
				System.out.println(t.getIdTema()+":"+t.getNombreTema());
			}
			
	}
	public static void mostrarInterpretacion(List<Interpretacion> listaI){
		for(Interpretacion t: listaI) {
			
			System.out.println(t.toString());
		}
		
}
	
	public static void mostrarString(Set<String> lista){
		for(String s: lista) {
			
			System.out.println(s);
		}
		
}
}
