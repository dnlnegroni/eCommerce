/**
 * 
 */
package it.uniroma3.controller.action;

import it.uniroma3.bean.Amministratore;
import it.uniroma3.bean.Cliente;
import it.uniroma3.bean.LogInFacade;

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