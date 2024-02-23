package pe.bn.com.siop.presentacion.controlador.operaciones;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pe.bn.com.siop.transversal.util.constantes.Parametros;

public class OperacionesController {

	private Parametros parametros;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {

		  String opcion = request.getParameter("opcion");

		  if (opcion != null) {
			  
			  int opcionInt = Integer.parseInt(opcion);
			  
			  if (opcionInt >=1 ) {
				  cargarArchivos(opcion);
			  }else {
				  System.out.println("no se pudo");
			  }
			  
			  
			  
		  } else {
			  System.out.println("no se pudo");
		  }
		   	
		  
		}
	
		
	public void cargarArchivos(String opcion){
				
		abrir(opcion);
	}

	private void abrir(String opcion) {
		
		String documento = null;
		
		switch (opcion) {
		
		case "1 ": documento = parametros.TOTAL_OPERACIONES_NIVEL_NACIONAL ;break;

		case "2 ": documento = parametros.TOTAL_OPERACIONES_NIVEL_NACIONAL ;break;
		
		case "3 ": documento = parametros.TOTAL_OPERACIONES_NIVEL_NACIONAL ;break;
		
			
		}
	 
	 try {
		Runtime.getRuntime().exec("cmd /c start " + documento);
	} catch (Exception e) {
		e.printStackTrace();
	}
	 
	}
	
	
}
