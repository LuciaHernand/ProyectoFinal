package modelo;

import java.util.Calendar;

public class Interprete extends Artista{
	int idInterprete;
	
	 String nomInterprete;
	public Interprete() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Interprete(int idInterprete,String nomInterprete) {
		super();
		this.idInterprete=idInterprete;
		this.nomInterprete = nomInterprete;
	}
	
	
	public String getNomInterprete() {
		return nomInterprete;
	}
	public void setNomInterprete(String nomInterprete) {
		this.nomInterprete = nomInterprete;
	}

	public int getIdInterprete() {
		return idInterprete;
	}

	public void setIdInterprete(int idInterprete) {
		this.idInterprete = idInterprete;
	}

	@Override
	public String toString() {
		return "Interprete [idInterprete=" + idInterprete + ", nomInterprete=" + nomInterprete + "]";
	}
	
	
	 
	 
	 
}
