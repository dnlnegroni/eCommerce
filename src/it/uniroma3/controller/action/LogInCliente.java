/**
 * 
 */
package it.uniroma3.controller.action;

import it.uniroma3.controller.action.Action;
import it.uniroma3.model.Amministratore;
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
		String email = request.getParameter("email");
		String pwd = request.getParameter("password");
		LogInFacade f = new LogInFacade();
		Cliente cliente = f.getCliente(email);
		request.setAttribute("cliente", cliente);
		request.getSession().setAttribute("cliente", cliente);
		if (!(cliente.getPassword().equals(pwd))) {
			/*TODO:
			 * Aggiungere gestione della password sbagliata
			 */
			return "/test.jsp";
		} else {
			return "/indexCliente.jsp";
		}
	}
	
}
