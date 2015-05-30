package it.uniroma3.controller.action;

import it.uniroma3.model.Ordine;
import it.uniroma3.model.OrdiniFacade;
import it.uniroma3.model.RigaOrdine;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

public class EvadiOrdine implements Action {

	@Override
	public String perform(HttpServletRequest request) {
		OrdiniFacade of = new OrdiniFacade();
		Long idOrdine = Long.parseLong(request.getParameter("id"));
		boolean isOk = of.evadiOrdine(idOrdine);
		if (isOk)
			return "/controller/ordini.evadi";
		else
			return "/quantitaNonDisponibile.jsp";
	}
	
}
