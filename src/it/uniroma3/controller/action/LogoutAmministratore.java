package it.uniroma3.controller.action;

import javax.servlet.http.HttpServletRequest;

public class LogoutAmministratore implements Action {
	
	@Override
	public String perform(HttpServletRequest request) {
		request.getSession().removeAttribute("amministratore");
		return "/index.jsp";
	}
	
}
