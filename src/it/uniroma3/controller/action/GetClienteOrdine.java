package it.uniroma3.controller.action;

import it.uniroma3.model.Cliente;
import it.uniroma3.model.Ordine;
import it.uniroma3.model.OrdiniFacade;

import javax.servlet.http.HttpServletRequest;

public class GetClienteOrdine implements Action {

	@Override
	public String perform(HttpServletRequest request) {
		OrdiniFacade of = new OrdiniFacade();
		Long id = Long.parseLong(request.getParameter("id"));
		Ordine o = of.getOrdine(id);
		Cliente c = o.getCliente();
		request.setAttribute("cliente", c);
		return "/cliente.jsp";
	}
	
	

}
