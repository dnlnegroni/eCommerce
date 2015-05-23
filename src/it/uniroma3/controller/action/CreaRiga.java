package it.uniroma3.controller.action;

import it.uniroma3.controller.action.Action;
import it.uniroma3.model.Ordine;
import it.uniroma3.model.Prodotto;
import it.uniroma3.model.RigaOrdine;

import javax.servlet.http.HttpServletRequest;

public class CreaRiga implements Action {

//    @EJB
//    private OrdiniFacade facade;
	
	public String perform(HttpServletRequest request) {
		
			Prodotto prodotto =(Prodotto) request.getSession().getAttribute("product");
			Integer q = Integer.parseInt( request.getParameter("quantita"));
			RigaOrdine r = new RigaOrdine(prodotto, q);
			r.setNomeProdotto((String) request.getSession().getAttribute("nomeProdotto"));
//			r.setPrezzoUnitario(((Double) request.getSession().getAttribute("prezzoUnitario")));
			r.setPrezzoUnitario((Double) request.getSession().getAttribute("prezzoUnitario"));
//			r.setNomeProdotto(prodotto.getNome());
//			r.setPrezzoUnitario(prodotto.getCosto());
			Ordine o = (Ordine) request.getSession().getAttribute("ordine");
			o.getRigheOrdine().add(r);
			request.getSession().setAttribute("ordine", o);
			Integer prodottiNelCarrello = (Integer) request.getSession().getAttribute("prodottiNelCarrello");
			prodottiNelCarrello+=q;
			request.getSession().setAttribute("prodottiNelCarrello", prodottiNelCarrello);
			return "/controller/product2.list";

	}
}