package it.uniroma3.controller.action;

import it.uniroma3.controller.action.Action;
import it.uniroma3.model.Cliente;
import it.uniroma3.model.Ordine;
import it.uniroma3.model.OrdiniFacade;

import javax.ejb.EJB;
import javax.servlet.http.HttpServletRequest;

public class CreaOrdine implements Action {

    @EJB
    private OrdiniFacade facade;
	
	public String perform(HttpServletRequest request) {
			
		OrdiniFacade facade= new OrdiniFacade();

		Ordine o = new Ordine();
		o.setCliente((Cliente) request.getSession().getAttribute("cliente"));
		request.getSession().setAttribute("ordine", o);
		request.getSession().setAttribute("prodottiNelCarrello", o.getRigheOrdine().size());
		return "/controller/product2.list";

	}
}