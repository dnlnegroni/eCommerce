package it.uniroma3.controller.action;

import it.uniroma3.model.Cliente;
import it.uniroma3.model.Ordine;

import javax.servlet.http.HttpServletRequest;

public class CreaOrdine implements Action {
	
	public String perform(HttpServletRequest request) {
		Ordine o = new Ordine();
		o.setCliente((Cliente) request.getSession().getAttribute("cliente"));
		request.getSession().setAttribute("ordine", o);
		request.getSession().setAttribute("prodottiNelCarrello", o.getRigheOrdine().size());
		return "/controller/product2.list";
	}
}