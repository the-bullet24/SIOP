package pe.bn.com.siop.presentacion.controlador;


import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import org.springframework.web.servlet.ModelAndView;

import pe.bn.com.siop.presentacion.controlador.operaciones.OperacionesAbrir;



@Controller
@Component
public class LoginController {

	private OperacionesAbrir operacionesAbrir;
	
    @RequestMapping("/")
    public String Index(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        return "index";
    }


    @RequestMapping("/principal")
    public String menuPage(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
        return "menu_principal";


    }

    @RequestMapping("/Operacion")
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
    	
    	operacionesAbrir = new OperacionesAbrir();
    	String opcion = request.getParameter("opcion");
    	int opcionInt = Integer.parseInt(opcion);
    	
		  if (opcion != null) {
			  			  			 
			  if (opcionInt ==1 ) {
				 System.out.println("entro a TOTAL_OPERACIONES_NIVEL_NACIONAL");
				 
				 operacionesAbrir.abrir(opcion);
				 
			  }else if (opcionInt == 2 ){
				  
				  System.out.println("entro a ...");
				  operacionesAbrir.cargarArchivos(opcion);
			  }else if (opcionInt == 3 ){
				  
				  System.out.println("entro a ...");
				  operacionesAbrir.cargarArchivos(opcion);
			  }
			  else if (opcionInt == 4 ){
				  
				  System.out.println("entro a ...");
				  operacionesAbrir.cargarArchivos(opcion);
			  }			  			  			  			  			  
		  } else {
			  System.out.println("no se pudo");
		  }
    	
    }
   

	
}
