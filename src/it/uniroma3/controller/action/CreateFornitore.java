package it.uniroma3.controller.action;

import it.uniroma3.controller.helper.HelperFornitore;
import it.uniroma3.model.Fornitore;
import it.uniroma3.model.FornitoreFacade;
import it.uniroma3.model.Prodotto;

import javax.servlet.http.HttpServletRequest;

public class CreateFornitore implements Action {

	@Override
	public String perform(HttpServletRequest request) {
		
		HelperFornitore hf = new HelperFornitore();
		
		if(hf.isValid(request)) {
			String telefono = request.getParameter("telefono");
			String pIva = request.getParameter("partitaIva");
			String indirizzo = request.getParameter("indirizzo");
			String email = request.getParameter("email");
			
			FornitoreFacade facade = new FornitoreFacade();
			Fornitore f = facade.createFornitore(pIva, indirizzo, email, telefono);
			request.setAttribute("fornitore", f);
			
			Prodotto p = (Prodotto) request.getSession().getAttribute("prodotto");
			p.getFornitori().add(f);
			request.getSession().setAttribute("prodotto", p);
			
			return "/newFornitore.jsp";
		} else {
			return "/newFornitore.jsp";
		}
	}
	
}
