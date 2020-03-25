package modelo;

public class Tema {

	
	int idTema;
	String nombreTema, autorTema;
	
	
	public Tema() {
		super();
	
	}
	public Tema(int idTema, String nombreTema, String autorTema) {
		super();
		this.idTema = idTema;
		this.nombreTema = nombreTema;
		this.autorTema = autorTema;
	}
	public int getIdTema() {
		return idTema;
	}
	public void setIdTema(int idTema) {
		this.idTema = idTema;
	}
	public String getNombreTema() {
		return nombreTema;
	}
	public void setNombreTema(String nombreTema) {
		this.nombreTema = nombreTema;
	}
	public String getAutorTema() {
		return autorTema;
	}
	public void setAutorTema(String autorTema) {
		this.autorTema = autorTema;
	}
	@Override
	public String toString() {
		return "Tema [idTema=" + idTema + ", nombreTema=" + nombreTema + ", autorTema=" + autorTema + "]";
	}
	
	
	
}
