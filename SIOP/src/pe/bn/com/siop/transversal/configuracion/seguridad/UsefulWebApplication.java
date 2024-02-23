package pe.bn.com.siop.transversal.configuracion.seguridad;


import org.springframework.security.core.context.SecurityContextHolder;



public class UsefulWebApplication {


	
	public static Usuario obtenerUsuario() {
		if (SecurityContextHolder.getContext().getAuthentication().isAuthenticated()) {
			return (Usuario) SecurityContextHolder.getContext().getAuthentication().getDetails();
		} else {
			return null;
		}
	}
	
	
	

}