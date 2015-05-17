package it.uniroma3.controller.helper;

import javax.servlet.http.HttpServletRequest;

public class HelperProduct {

	public boolean isValid(HttpServletRequest request) {
		
		String name = request.getParameter("nome");
		String code = request.getParameter("codice");
		String price = request.getParameter("costo");
		boolean errors = false;

		if ( name == null || name.equals("")) {
			request.setAttribute("nameErr","Name is mandatory");
			errors = true;
		}

		if ( code == null || code.equals("")) {
			request.setAttribute("codeErr","Code is mandatory");
			errors = true;
		}

		if ( price == null || price.equals("")) {
			request.setAttribute("priceErr","Price is mandatory");
			errors = true;
		}
		else {
			try{
				Float.parseFloat(price);
			}
			catch (NumberFormatException e) {
				request.setAttribute("priceErr","Price is must be a number");
				errors = true;
			}
		}
		return !errors;
	}
}
