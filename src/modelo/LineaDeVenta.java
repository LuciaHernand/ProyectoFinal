package modelo;

public class LineaDeVenta {

	
	int idLinea;
	int cantidad;
	float precioIndividual,precioLinea;
	public LineaDeVenta() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LineaDeVenta(int idLinea, int cantidad, float precioIndividual, float precioLinea) {
		super();
		this.idLinea = idLinea;
		this.cantidad = cantidad;
		this.precioIndividual = precioIndividual;
		this.precioLinea = precioLinea;
	}
	public int getIdLinea() {
		return idLinea;
	}
	public void setIdLinea(int idLinea) {
		this.idLinea = idLinea;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public float getPrecioIndividual() {
		return precioIndividual;
	}
	public void setPrecioIndividual(float precioIndividual) {
		this.precioIndividual = precioIndividual;
	}
	public float getPrecioLinea() {
		return precioLinea;
	}
	public void setPrecioLinea(float precioLinea) {
		this.precioLinea = precioLinea;
	}
	@Override
	public String toString() {
		return "LineaDeVenta [idLinea=" + idLinea + ", cantidad=" + cantidad + ", precioIndividual=" + precioIndividual
				+ ", precioLinea=" + precioLinea + "]";
	}
	
	
}
