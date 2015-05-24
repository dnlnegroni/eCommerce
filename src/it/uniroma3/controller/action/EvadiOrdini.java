package it.uniroma3.controller.action;

import it.uniroma3.model.Ordine;
import it.uniroma3.model.OrdiniFacade;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

public class EvadiOrdini implements Action {

	@Override
	public String perform(HttpServletRequest request) {
		OrdiniFacade facade = new OrdiniFacade();
		List<Ordine> ordini = facade.getAllOrders();
		request.setAttribute("ordini", ordini);	
		return "/evadiOrdini.jsp";
	}

}
