/**
 * 
 */
package it.uniroma3.controller.action;

import it.uniroma3.controller.helper.HelperLoginCliente;
import it.uniroma3.model.Cliente;
import it.uniroma3.model.LogInFacade;

import javax.ejb.EJB;
import javax.servlet.http.HttpServletRequest;

/**
 * @author daniele
 *
 */
public class LogInCliente implements Action{
	
	@EJB
    private LogInFacade facade;
	
	public String perform(HttpServletRequest request) {
		HelperLoginCliente helper = new HelperLoginCliente();
		if(helper.isValid(request)) {
			LogInFacade lf = new LogInFacade();		
			String email = request.getParameter("email");
			String pwd = request.getParameter("password");
			Cliente cliente = lf.getCliente(email,pwd);
			request.setAttribute("cliente", cliente);
			request.getSession().setAttribute("cliente", cliente);
			return "/indexCliente.jsp";
		} else {
			return "/loginCliente.jsp";
		}
	}
	
}
