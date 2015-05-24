package it.uniroma3.controller.helper;

import javax.servlet.http.HttpServletRequest;

public class HelperProduct {

	public boolean isValid(HttpServletRequest request) {
		String price = request.getParameter("costo");
		boolean errors = false;
		try{
			Float.parseFloat(price);
		}
		catch (NumberFormatException e) {
			request.setAttribute("priceErr","Il prezzo deve essere un numero intero o decimale (separato da un punto) !");
			errors = true;
		}
		return !errors;
	}
}
