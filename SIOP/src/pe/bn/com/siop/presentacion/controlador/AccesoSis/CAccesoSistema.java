/*package pe.bn.com.siop.presentacion.controlador.AccesoSis;



import java.io.IOException;
import java.io.Serializable;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;

import pe.bn.com.siop.negocio.servicio.AccesoSistema;
import pe.bn.com.siop.presentacion.modelo.MAccesoSistema;
import pe.bn.com.siop.transversal.util.constantes.ParametrosSeguridad;





@Controller("cAccesoSistema")
@Scope("view")
public class CAccesoSistema implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private ParametrosSeguridad seguridad;
	
	private String idUsuario = seguridad.LOGIN_USERNAME;
	
	private String idPassword = seguridad.LOGIN_PASSWORD;
	
	private String idRol = seguridad.LOGIN_ROL;
	
	private MAccesoSistema mAccesoSistema;
	
	
	@Autowired
	private AccesoSistema sAccesoSistema;
	
	
	
	
	
	
	int contador=0;
	
	@PostConstruct
	public void init(){
		mAccesoSistema = new MAccesoSistema();
		contador++;
		 
		HttpServletRequest request = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();

		
		HttpSession  session=request.getSession(true);
	    Enumeration keys = session.getAttributeNames();     
	    HashMap<String,Object> hm=new HashMap<String,Object>();  
	    while (keys.hasMoreElements())
	    {
	      String key = (String)keys.nextElement();
	       
	      hm.put(key,session.getValue(key));
	      session.removeAttribute(key);      
	    }
	    session.invalidate();
	    session=request.getSession(true);
	    for(Map.Entry m:hm.entrySet())
	    {
	      session.setAttribute((String)m.getKey(),m.getValue());  
	      hm.remove(m);
	    }
		
	}
	
	
	*//**
	 * Verifica los usuarios y contraseñas
	 * @return Devuelve el menu para acceso al sistema
	 *//*
	public boolean estaLogeado() {

		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if ((!(auth instanceof AnonymousAuthenticationToken))) {
			
			return true;
		}
		return false;
	}

	public String doLogin() throws ServletException, IOException{
		
		System.out.println(" Login -------------------------------- ");
		try{
			
			sAccesoSistema.autenticacion(FacesContext.getCurrentInstance());
			
			System.out.println("INGRESO LA AUTENTICACION");
			return null;
		}catch(Exception e){
			System.out.println("No se pudo conectar");;
		}
		return null;	
	}


	public ParametrosSeguridad getSeguridad() {
		return seguridad;
	}


	public void setSeguridad(ParametrosSeguridad seguridad) {
		this.seguridad = seguridad;
	}


	public String getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}


	public String getIdPassword() {
		return idPassword;
	}


	public void setIdPassword(String idPassword) {
		this.idPassword = idPassword;
	}


	public String getIdRol() {
		return idRol;
	}


	public void setIdRol(String idRol) {
		this.idRol = idRol;
	}


	public MAccesoSistema getmAccesoSistema() {
		return mAccesoSistema;
	}


	public void setmAccesoSistema(MAccesoSistema mAccesoSistema) {
		this.mAccesoSistema = mAccesoSistema;
	}


	public AccesoSistema getsAccesoSistema() {
		return sAccesoSistema;
	}


	public void setsAccesoSistema(AccesoSistema sAccesoSistema) {
		this.sAccesoSistema = sAccesoSistema;
	}
	
	
	
	
	
}
*/