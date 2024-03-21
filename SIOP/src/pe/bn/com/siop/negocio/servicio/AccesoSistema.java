/*package pe.bn.com.siop.negocio.servicio;

import java.io.IOException;

import javax.faces.context.FacesContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface AccesoSistema {
	*//**
	 * Metodo para loguear al usuario al aplicativo
	 * @param username nombre de usuario.
	 * @param password contraseña del usuario.
	 * @param request solicitud httpRequest.
	 * @param response respuesta httpResponse.
	 * @return Devuelve true si autentico al usuario, false en caso contrario.
	 *//*
	@Deprecated
	public boolean login(String username, String password, HttpServletRequest request, HttpServletResponse response);
	
	*//**
	 * Metodo no utilizado
	 * @param username
	 * @param password
	 * @param request
	 * @param response
	 *//*
	@Deprecated
	public void autenticacion(String username, String password, HttpServletRequest request, HttpServletResponse response);
	
	*//**
	 * Metodo para autenticar al usuario con spring security, ver configuracion {@link pe.bn.com.ssmc.configuracion.SeguridadConfiguracion}
	 * @param facesContext instancia actual del FacesContext (FacesContext.getCurrentInstance()).
	 * @throws ServletException Excepcion del servlet.
	 * @throws IOException Excepcion en caso no haya el archivo pagina xhtml.
	 *//*
	public void autenticacion(FacesContext facesContext) throws ServletException, IOException;
	
}
*/