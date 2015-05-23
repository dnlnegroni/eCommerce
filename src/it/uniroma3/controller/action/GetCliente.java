package it.uniroma3.controller.action;

import it.uniroma3.model.Cliente;
import it.uniroma3.model.ClienteFacade;

import javax.servlet.http.HttpServletRequest;

public class GetCliente implements Action {
	
	public String perform(HttpServletRequest request) {
		Long id = Long.parseLong(request.getParameter("id"));
		ClienteFacade facade = new ClienteFacade ();
		Cliente c = facade.getCliente(id);
		request.setAttribute("cliente", c);
		return "/cliente.jsp";
	}
}
