package it.uniroma3.controller.action;

import javax.servlet.http.HttpServletRequest;

public class LogoutCliente implements Action {

	@Override
	public String perform(HttpServletRequest request) {
		request.getSession().removeAttribute("cliente");
		return "/index.jsp";
	}

}
