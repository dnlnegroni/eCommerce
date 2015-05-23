package it.uniroma3.controller.action;

import it.uniroma3.model.Ordine;
import it.uniroma3.model.OrdiniFacade;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

public class ListaOrdini implements Action {
	
	public String perform(HttpServletRequest request) {
		OrdiniFacade facade = new OrdiniFacade();
		List<Ordine> ordini = facade.getAllOrders();
		request.setAttribute("ordini", ordini);	
		return "/listOrdini.jsp";
	}
	
}
