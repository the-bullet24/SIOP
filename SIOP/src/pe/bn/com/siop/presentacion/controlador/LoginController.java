package pe.bn.com.siop.presentacion.controlador;


import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import seguridad.service.AutenticaReg;





@Controller
@Component
public class LoginController 
{

	  
	/*@Override
	@RequestMapping(value="/.htm")
	public void onAuthenticationSuccess(HttpServletRequest request,
			HttpServletResponse response, Authentication authentication) throws IOException,
			ServletException {

    	UsefulWebApplication.redireccionar("/index.jsp");

		
	}
	*/
	
	
	
	

    @RequestMapping(value="/.htm")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        return new ModelAndView("index");
    }


    @RequestMapping(value = "/principal.htm")
    public ModelAndView menuPage(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        return new ModelAndView("menu_principal");
    }


    @RequestMapping(value = "/login.htm")
    public ModelAndView loginPage(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        return new ModelAndView("login");
    }

	
	
	
}
