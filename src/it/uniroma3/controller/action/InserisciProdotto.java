package it.uniroma3.controller.action;

import it.uniroma3.model.Prodotto;
import it.uniroma3.model.ProductFacade;

import javax.servlet.http.HttpServletRequest;

public class InserisciProdotto implements Action {
	
	@Override
	public String perform(HttpServletRequest request) {
		ProductFacade pf = new ProductFacade();
		Prodotto p = (Prodotto) request.getSession().getAttribute("prodotto");
		pf.persisteProduct(p);
		return "/indexAmministratore.jsp";
		
	}
	
	

}
