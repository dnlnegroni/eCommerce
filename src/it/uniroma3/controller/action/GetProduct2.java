package it.uniroma3.controller.action;

import it.uniroma3.controller.helper.HelperProductId;
import it.uniroma3.model.Prodotto;
import it.uniroma3.model.ProductFacade;

import javax.servlet.http.HttpServletRequest;

public class GetProduct2 implements Action {

	public String perform(HttpServletRequest request) {
		
		HelperProductId helper = new HelperProductId();
		
		if (helper.isValid(request)) {
			Long id = Long.parseLong(request.getParameter("id"));
			
			ProductFacade facade = new ProductFacade();
			Prodotto product = facade.getProduct(id);
			request.setAttribute("product", product);
			request.getSession().setAttribute("product", product);
			request.getSession().setAttribute("prezzoUnitario", product.getCosto());
			request.getSession().setAttribute("nomeProdotto", product.getNome());
			
			return "/addRiga.jsp";
		} else
			return "/invalid.jsp";
	}
}
