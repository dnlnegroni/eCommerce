package it.uniroma3.controller.helper;

import it.uniroma3.model.Cliente;
import it.uniroma3.model.LogInFacade;

import javax.servlet.http.HttpServletRequest;

public class HelperLoginCliente {
	
	public boolean isValid(HttpServletRequest request) {
		LogInFacade lf = new LogInFacade();
		String email = request.getParameter("email");;
		String password = request.getParameter("password");
		boolean errors = false;
		if	(!email.equals("") && !password.equals("")) {
			Cliente cliente = lf.getCliente(email,password);
			if(cliente == null) {
				request.setAttribute("loginFail", "Non è stato trovato alcun cliente con i dati inseriti !");
				errors = true;
			}
		}
		
		return !errors;
	}
	
}
