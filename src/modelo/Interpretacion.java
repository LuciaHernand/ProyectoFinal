package modelo;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Interpretacion {
	 int idInterpretacion;
	 Calendar fechaInterpretacion;
	 private Tema temaInterpretacion;
	 private Estilo  estiloInterpretacion;
	 private List<Interprete> listaInterprete;
	 
	 
	 public Interpretacion() {
		 
		 
	 }
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
	public String obtenerDate() {
		return  this.fechaInterpretacion.get(Calendar.YEAR)+"-"+ (this.fechaInterpretacion.get(Calendar.MONTH)+1)+"-" +this.fechaInterpretacion.get(Calendar.DAY_OF_MONTH);
	}
	public void grabarCalendar(String s) {
		String[] dma=s.split("-");
		this.fechaInterpretacion= new GregorianCalendar(Integer.parseInt(dma[0]),Integer.parseInt(dma[1]),Integer.parseInt(dma[2]));
		
	}
	
	@Override
	public String toString() {
		return "Interpretacion [idInterpretacion=" + idInterpretacion + ",\n\t fechaInterpretacion=" + fechaInterpretacion.getTime()
				+ ",\n\t temaInterpretacion=" + temaInterpretacion + ",\n\t estiloInterpretacion=" + estiloInterpretacion
				+ ",\n\t listaInterprete=" + listaInterprete + "]";
	}
	 
	
	 
}
