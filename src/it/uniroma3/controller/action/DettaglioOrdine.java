package it.uniroma3.controller.action;

import it.uniroma3.model.Ordine;
import it.uniroma3.model.RigaOrdine;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

public class DettaglioOrdine implements Action {

	@Override
	public String perform(HttpServletRequest request) {
		Ordine o = (Ordine) request.getSession().getAttribute("ordine");
		List<RigaOrdine> righeOrdine = o.getRigheOrdine();
		request.setAttribute("righeOrdine", righeOrdine);
		return "/dettaglioOrdine.jsp";
	}

}
