package modelo;

public class Ejemplar extends Soporte{

	int idEjemplar;
	float precioVenta;
	public Ejemplar() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ejemplar(int idEjemplar, float precioVenta) {
		super();
		this.idEjemplar = idEjemplar;
		this.precioVenta = precioVenta;
	}
	public int getIdEjemplar() {
		return idEjemplar;
	}
	public void setIdEjemplar(int idEjemplar) {
		this.idEjemplar = idEjemplar;
	}
	public float getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}
	@Override
	public String toString() {
		return "Ejemplar [idEjemplar=" + idEjemplar + ", precioVenta=" + precioVenta + "]";
	}
	
	
}
