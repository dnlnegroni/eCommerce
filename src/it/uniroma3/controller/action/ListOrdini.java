package it.uniroma3.controller.action;

import it.uniroma3.model.Cliente;
import it.uniroma3.model.ClienteFacade;
import it.uniroma3.model.Ordine;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

public class ListOrdini  implements Action{
				
	@Override
	public String perform(HttpServletRequest request) {
		ClienteFacade facade = new ClienteFacade();
		Cliente cliente = (Cliente) request.getSession().getAttribute("cliente");
		List<Ordine> ordini = facade.getOrders(cliente.getId());
		request.setAttribute("ordini", ordini);	
		return "/orders.jsp";
	}

}
