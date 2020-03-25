package modelo;

import java.util.Calendar;
import java.util.List;

public class Interpretacion {
	 int idInterpretacion;
	 Calendar fechaInterpretacion;
	 private Tema temaInterpretacion;
	 private Estilo  estiloInterpretacion;
	 private List<Interprete> listaInterprete;
	public Interpretacion(int idInterpretacion, Calendar fechaInterpretacion, Tema temaInterpretacion,
			Estilo estiloInterpretacion, List<Interprete> listaInterprete) {
		super();
		this.idInterpretacion = idInterpretacion;
		this.fechaInterpretacion = fechaInterpretacion;
		this.temaInterpretacion = temaInterpretacion;
		this.estiloInterpretacion = estiloInterpretacion;
		this.listaInterprete = listaInterprete;
	}
	public int getIdInterpretacion() {
		return idInterpretacion;
	}
	public void setIdInterpretacion(int idInterpretacion) {
		this.idInterpretacion = idInterpretacion;
	}
	public Calendar getFechaInterpretacion() {
		return fechaInterpretacion;
	}
	public void setFechaInterpretacion(Calendar fechaInterpretacion) {
		this.fechaInterpretacion = fechaInterpretacion;
	}
	public Tema getTemaInterpretacion() {
		return temaInterpretacion;
	}
	public void setTemaInterpretacion(Tema temaInterpretacion) {
		this.temaInterpretacion = temaInterpretacion;
	}
	public Estilo getEstiloInterpretacion() {
		return estiloInterpretacion;
	}
	public void setEstiloInterpretacion(Estilo estiloInterpretacion) {
		this.estiloInterpretacion = estiloInterpretacion;
	}
	public List<Interprete> getListaInterprete() {
		return listaInterprete;
	}
	public void setListaInterprete(List<Interprete> listaInterprete) {
		this.listaInterprete = listaInterprete;
	}
	@Override
	public String toString() {
		return "Interpretacion [idInterpretacion=" + idInterpretacion + ", fechaInterpretacion=" + fechaInterpretacion
				+ ", temaInterpretacion=" + temaInterpretacion + ", estiloInterpretacion=" + estiloInterpretacion
				+ ", listaInterprete=" + listaInterprete + "]";
	}
	 
	
	 
}
