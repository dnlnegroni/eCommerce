package it.uniroma3.controller.action;

import it.uniroma3.model.OrdiniFacade;
import it.uniroma3.model.RigaOrdine;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

public class GetOrdine implements Action{

	@Override
	public String perform(HttpServletRequest request) {
		Long id = Long.parseLong(request.getParameter("id"));
		
		OrdiniFacade facade = new OrdiniFacade();
		List<RigaOrdine> ro = facade.getRigherOrdine(id);
		request.setAttribute("righeOrdine", ro);
		return "/informazioniOrdine.jsp";
	}
	

}
