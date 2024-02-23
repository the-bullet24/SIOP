package pe.bn.com.siop.presentacion.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



import seguridad.service.AutenticaReg;
import seguridad.service.AutenticaRegService;
import seguridad.service.AutenticaRegServiceLocator;

/**
 * Servlet implementation class LoginServlet
 */

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @return 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	    
		
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 String username = request.getParameter("username");
	     String password = request.getParameter("password");

	        try {
	        	// Crea una instancia del servicio web SOAP
	            AutenticaRegServiceLocator service = new AutenticaRegServiceLocator();

	            // Obtiene una instancia del puerto AutenticaReg
	            AutenticaReg port = service.getAutenticaReg();

	            // Llama al método de autenticación del servicio web
	            String result = port.claveHost(username  + password + "SIOP" + 00);

	            if (result.equals("OK")) {
	                // La autenticación fue exitosa, redirige al usuario a la página de menú
	                response.sendRedirect("menu_principal");
	            } else {
	                // La autenticación falló, muestra un mensaje de error
	                request.setAttribute("error", "Nombre de usuario o contraseña incorrectos");
	                request.getRequestDispatcher("index.jsp").forward(request, response);
	            }
	        } catch (Exception e) {
	            // Maneja cualquier excepción que pueda ocurrir
	            e.printStackTrace();
	            request.setAttribute("error", "Error al autenticar: " + e.getMessage());
	            request.getRequestDispatcher("index.jsp").forward(request, response);
	        }
	        
	        
	        
	}
}
