package it.uniroma3.controller.action;


import it.uniroma3.controller.action.Action;
import it.uniroma3.model.*;

import javax.ejb.EJB;
import javax.servlet.http.HttpServletRequest;

public class ConcludiOrdine implements Action {

    @EJB
    private OrdiniFacade facade;
	
	public String perform(HttpServletRequest request) {
			
		Ordine o  = (Ordine) request.getSession().getAttribute("ordine");
		
		OrdiniFacade facade = new OrdiniFacade();
		facade.persistOrdine(o);
		
		return "/indexCliente.jsp";
		

	}
}