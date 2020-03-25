package Control;

import java.sql.SQLException;

import dao.TemaDAO;
import vista.Lectura;

public class MainTarea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lectura in=new Lectura();
		try {
			TemaDAO.insertarUnTema(in.leerTema());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

}
