package pe.bn.com.siop.presentacion.modelo;

import java.io.Serializable;

public class MAccesoSistema implements Serializable {


	private static final long serialVersionUID = 1L;


	private String usuario;
	private String clave;
	private String rol;
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}

	
	
}
