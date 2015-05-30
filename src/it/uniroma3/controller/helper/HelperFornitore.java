package it.uniroma3.controller.helper;

import javax.servlet.http.HttpServletRequest;

public class HelperFornitore {
	public boolean isValid(HttpServletRequest request) {
		String tel = request.getParameter("telefono");
		boolean errors = false;
		try{
			Integer.parseInt(tel);
		}
		catch (NumberFormatException e) {
			request.setAttribute("telErr","Il telefono deve essere una serie di cifre!");
			errors = true;
		}
		return !errors;
	}
}
