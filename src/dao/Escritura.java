package dao;

import java.util.List;

import modelo.Tema;

public class Escritura {
	public static void mostrarPantalla(List<Tema> listaT){
		for(Tema t: listaT) {
			
			System.out.println(t.toString());
		}
	}
}
