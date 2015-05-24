/**
 * 
 */
package it.uniroma3.controller.action;

import it.uniroma3.controller.helper.HelperLoginAmministratore;
import it.uniroma3.controller.helper.HelperLoginCliente;
import it.uniroma3.model.Amministratore;
import it.uniroma3.model.Cliente;
import it.uniroma3.model.LogInFacade;

import javax.ejb.EJB;
import javax.servlet.http.HttpServletRequest;

/**
 * @author daniele
 *
 */
public class LogInAmministratore implements Action{
	
	public String perform(HttpServletRequest request) {
		HelperLoginAmministratore helper = new HelperLoginAmministratore();
		if(helper.isValid(request)) {
			String email = request.getParameter("email");
			String pwd = request.getParameter("password");
			LogInFacade f = new LogInFacade();
			Amministratore amministratore = f.getAmministratore(email,pwd);
			request.setAttribute("amministratore", amministratore);
			request.getSession().setAttribute("amministratore", amministratore);
			return "/indexAmministratore.jsp";
		} else {
			return "/loginAmministratore.jsp";
		}
	}
	
}
