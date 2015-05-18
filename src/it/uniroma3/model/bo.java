package it.uniroma3.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class bo {
	public static void main(String[] args ){	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ecommerce-unit");
		EntityManager em = emf.createEntityManager();
		
		Prodotto product = new Prodotto();
		product.setCodice("000000");
		product.setCosto(10.50);
		product.setDescrizione("A wonderful bla bla");
		
		List<Prodotto> prodottiF1 = new ArrayList<Prodotto>();
		
		Fornitore f1 = new Fornitore();
		f1.setPartitaIva("PIVA F1");
		f1.setIndirizzo("via 1");
		f1.setProdotti(prodottiF1);
		
		List<Fornitore> listaFornitori = new ArrayList<Fornitore>();
		listaFornitori.add(f1);
		product.setFornitori(listaFornitori);
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(product);
		tx.commit();
	
		em.close();
		emf.close();
	}
}
