package vista;

import java.util.Scanner;

import modelo.Tema;

public class Lectura {
	
	static Scanner scan=new Scanner(System.in);
	public static Tema leerTema() {
		Scanner scan=new Scanner(System.in);
		Tema t=new Tema();
	System.out.println("Dime un titulo de tema");	
		
	t.setNombreTema(scan.nextLine());
System.out.println("Dime un autor del tema");
t.setAutorTema(scan.nextLine());
	scan.close();
	return t;
		
	}
	
	public static int leerTemaI() {
		
		System.out.println("Seleccione un tema de todos los anteriores,(id):");
		return scan.nextInt();
	}
public static int leerEstiloI() {
		
		System.out.println("Seleccione un estilo de todos los anteriores,(id):");
		return scan.nextInt();
	}

public static int[] leerInterpretesI() {
	
	System.out.println("Seleccione un interprete de todos los anteriores,(id,id,id,id....):");
	String s=scan.next();
	
	String [] interpretes=s.split(",");
	int[] intrprts=new int [interpretes.length];
	int contador=0;
	
	for(String i: interpretes) {
		intrprts[contador++]=Integer.parseInt(i);
		}
	return intrprts;
}
}
