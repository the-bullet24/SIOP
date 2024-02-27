package pe.bn.com.siop.presentacion.controlador.operaciones;

import java.io.IOException;

import pe.bn.com.siop.transversal.util.constantes.Parametros;

public class OperacionesAbrir {

private Parametros parametros;	
	
public  void abrir(String opcion) throws IOException {
		
		String documento = parametros.TOTAL_OPERACIONES_NIVEL_NACIONAL;
		String documento2 = parametros.TOTAL_OPERACIONES_CAJEROS_MULTIRED;
		String documento3 = parametros.SERVICIOS_CORRESPONSALIA;
		String documento4 = parametros.OFICINAS_UOB;		
		
		int opcionInt = Integer.parseInt(opcion);
		
		if (opcionInt==1) {			
			Runtime.getRuntime().exec("cmd /c start " + documento);									
		} 
		else if (opcionInt==2){
			Runtime.getRuntime().exec("cmd /c start " + documento2);
		}
		else if (opcionInt==3){
			Runtime.getRuntime().exec("cmd /c start " + documento3);
		}
		else if (opcionInt==4){
			Runtime.getRuntime().exec("cmd /c start " + documento4);
		}
		
	}

	public void cargarArchivos(String opcion) throws IOException{
	
		abrir(opcion);
	}

    
    

}
