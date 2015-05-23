package it.uniroma3.controller.action;

import java.util.List;

import it.uniroma3.model.Prodotto;
import it.uniroma3.model.ProductFacade;

import javax.servlet.http.HttpServletRequest;

public class ListProduct2 implements Action {

	public String perform(HttpServletRequest request) {
		
		ProductFacade facade = new ProductFacade();
		List<Prodotto> products = facade.getAllProducts();
		request.setAttribute("products", products);
		return "/catalogoIns.jsp";
	}
}
