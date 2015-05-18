package it.uniroma3.controller.action;

import it.uniroma3.controller.helper.HelperProduct;
import it.uniroma3.model.Prodotto;
import it.uniroma3.model.ProductFacade;

import javax.ejb.EJB;
import javax.servlet.http.HttpServletRequest;

public class CreateProduct implements Action {

    @EJB
    private ProductFacade facade;
	
	public String perform(HttpServletRequest request) {
		
		HelperProduct helper = new HelperProduct();
		
		if (helper.isValid(request)) {
			String name = request.getParameter("nome");
			String code = request.getParameter("costo");
			Double price = Double.parseDouble(request.getParameter("costo"));
			String description = request.getParameter("descrizione");
			Integer quantity = Integer.parseInt(request.getParameter("quantita"));
			
			ProductFacade facade = new ProductFacade();
			Prodotto product = facade.createProduct(code, name, price, description, quantity);
			request.setAttribute("product", product);
			
			return "/product.jsp";
		} else
			return "/newProduct.jsp";
	}
}
