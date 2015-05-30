/**
 * 
 */
package it.uniroma3.controller.helper;

import javax.servlet.http.HttpServletRequest;

/**
 * @author daniele
 *
 */
public class HelperCliente {
	
	public boolean isValid(HttpServletRequest request) {
		
		String nome = request.getParameter("nome");
		String cognome = request.getParameter("cognome");
		String indirizzo = request.getParameter("indirizzo");;
		String email = request.getParameter("email");;
		String password = request.getParameter("password");
		
		boolean errors = false;

		if ( nome == null || nome.equals("")) {
			request.setAttribute("nomeErr","Il nome è obbligatorio!");
			errors = true;
		}

		if ( cognome == null || cognome.equals("")) {
			request.setAttribute("cognomeErr","Il cognome è obbligatorio!");
			errors = true;
		}

		if ( indirizzo == null || indirizzo.equals("")) {
			request.setAttribute("indirizzoErr","L'indirizzo è obbligatorio!");
			errors = true;
		}
		
		if ( email == null || email.equals("")) {
			request.setAttribute("emailErr","L'email è obbligatorio!");
			errors = true;
		}
		
		if ( password == null || password.equals("")) {
			request.setAttribute("passwordErr","La password è obbligatorio!");
			errors = true;
		}
		
		return !errors;
	}
	
}
