/**
 * 
 */
package it.uniroma3.controller.action;

import it.uniroma3.bean.Amministratore;
import it.uniroma3.bean.LogInFacade;
import it.uniroma3.bean.Prodotto;
import it.uniroma3.bean.ProductFacade;

import java.util.List;

import javax.ejb.EJB;
import javax.servlet.http.HttpServletRequest;

/**
 * @author daniele
 *
 */
public class LogInAmministratore implements Action{
	
	@EJB
    private LogInFacade facade;
	
	public String perform(HttpServletRequest request) {
		String email = request.getParameter("email");
		String pwd = request.getParameter("password");
		LogInFacade f = new LogInFacade();
		Amministratore amministratore = f.getAmministratore(email);
		request.setAttribute("amministratore", amministratore);
		if (!(amministratore.getPassword().equals(pwd))) {
			/*TODO:
			 * Aggiungere gestione della password sbagliata
			 */
			return "/test.jsp";
		} else {
			return "/indexAmministratore.jsp";
		}
	}
	
}
