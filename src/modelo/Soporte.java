package modelo;

public class Soporte {

	
		int idSoporte;
		String nomSoporte;
		public Soporte() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Soporte(int idSoporte, String nomSoporte) {
			super();
			this.idSoporte = idSoporte;
			this.nomSoporte = nomSoporte;
		}
		public int getIdSoporte() {
			return idSoporte;
		}
		public void setIdSoporte(int idSoporte) {
			this.idSoporte = idSoporte;
		}
		public String getNomSoporte() {
			return nomSoporte;
		}
		public void setNomSoporte(String nomSoporte) {
			this.nomSoporte = nomSoporte;
		}
		@Override
		public String toString() {
			return "Soporte [idSoporte=" + idSoporte + ", nomSoporte=" + nomSoporte + "]";
		}
		
		
		
}