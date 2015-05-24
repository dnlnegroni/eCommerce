package it.uniroma3.controller.action;

import it.uniroma3.controller.helper.HelperCliente;
import it.uniroma3.model.Cliente;
import it.uniroma3.model.ClienteFacade;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

public class AddCliente implements Action {
	
	@Override
	public String perform(HttpServletRequest request) {
		HelperCliente helper = new HelperCliente();
		
		if (helper.isValid(request)) {
			String nome = request.getParameter("nome");
			String cognome = request.getParameter("cognome");
			Date dataRegistrazione = new Date();
			String indirizzo = request.getParameter("indirizzo");;
			String email = request.getParameter("email");;
			String password = request.getParameter("password");
			String dataNascitaString = request.getParameter("dataNascita");
			Date dataNascita = null;
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyy");
			try {
				dataNascita = format.parse(dataNascitaString);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			ClienteFacade facade = new ClienteFacade();
			Cliente cliente = facade.createCliente(nome, cognome, indirizzo, email, password, dataNascita, dataRegistrazione);
			request.setAttribute("cliente", cliente);
			return "/indexAmministratore.jsp";
		} else {
			return "/addCliente.jsp";
		}
	}
	
}
