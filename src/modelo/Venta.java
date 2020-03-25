package modelo;

import java.util.Calendar;

public class Venta {

	int idVenta;
	Calendar fechaVenta;
	float preioBase,iva,precioTotal;
	public Venta() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Venta(int idVenta, Calendar fechaVenta, float preioBase, float iva, float precioTotal) {
		super();
		this.idVenta = idVenta;
		this.fechaVenta = fechaVenta;
		this.preioBase = preioBase;
		this.iva = iva;
		this.precioTotal = precioTotal;
	}
	public int getIdVenta() {
		return idVenta;
	}
	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}
	public Calendar getFechaVenta() {
		return fechaVenta;
	}
	public void setFechaVenta(Calendar fechaVenta) {
		this.fechaVenta = fechaVenta;
	}
	public float getPreioBase() {
		return preioBase;
	}
	public void setPreioBase(float preioBase) {
		this.preioBase = preioBase;
	}
	public float getIva() {
		return iva;
	}
	public void setIva(float iva) {
		this.iva = iva;
	}
	public float getPrecioTotal() {
		return precioTotal;
	}
	public void setPrecioTotal(float precioTotal) {
		this.precioTotal = precioTotal;
	}
	@Override
	public String toString() {
		return "Venta [idVenta=" + idVenta + ", fechaVenta=" + fechaVenta + ", preioBase=" + preioBase + ", iva=" + iva
				+ ", precioTotal=" + precioTotal + "]";
	}
	
	
}
