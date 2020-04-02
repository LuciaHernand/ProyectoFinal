package MODELO1;

import java.util.Calendar;

import modelo.Artista;

public class Interprete extends Artista{
	int idInterprete;
	 int numComponentes;
	 Calendar fechaNacimineto;
	 String nomInterprete,rol;
	public Interprete() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Interprete(int numComponentes, Calendar fechaNacimineto, String nomInterprete, String rol) {
		super();
		this.numComponentes = numComponentes;
		this.fechaNacimineto = fechaNacimineto;
		this.nomInterprete = nomInterprete;
		this.rol = rol;
	}
	
	public Interprete(int idInterprete,String nomInterprete) {
		super();
		this.idInterprete=idInterprete;
		this.nomInterprete = nomInterprete;
	}
	public int getNumComponentes() {
		return numComponentes;
	}
	public void setNumComponentes(int numComponentes) {
		this.numComponentes = numComponentes;
	}
	public Calendar getFechaNacimineto() {
		return fechaNacimineto;
	}
	public void setFechaNacimineto(Calendar fechaNacimineto) {
		this.fechaNacimineto = fechaNacimineto;
	}
	public String getNomInterprete() {
		return nomInterprete;
	}
	public void setNomInterprete(String nomInterprete) {
		this.nomInterprete = nomInterprete;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	@Override
	public String toString() {
		return "Interprete [numComponentes=" + numComponentes + ", fechaNacimineto=" + fechaNacimineto
				+ ", nomInterprete=" + nomInterprete + ", rol=" + rol + "]";
	}
	 
	 
	 
	 
}
