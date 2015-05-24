package it.uniroma3.controller.helper;

import it.uniroma3.model.Amministratore;
import it.uniroma3.model.LogInFacade;

import javax.servlet.http.HttpServletRequest;

public class HelperLoginAmministratore {
	
	public boolean isValid(HttpServletRequest request) {
		LogInFacade lf = new LogInFacade();
		String email = request.getParameter("email");;
		String password = request.getParameter("password");
		boolean errors = false;
		if	(!email.equals("") && !password.equals("")) {
			Amministratore a = lf.getAmministratore(email,password);
			if(a == null) {
				request.setAttribute("loginFail", "Non è stato trovato alcun amministratore con i dati inseriti !");
				errors = true;
			}
		}
		
		return !errors;
	}
}
