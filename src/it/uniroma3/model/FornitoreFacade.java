package it.uniroma3.model;

import java.util.Date;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class FornitoreFacade {
	
	private EntityManager entityManager;
	private EntityManagerFactory emf;
	private MysqlDataSource datasource;
	Context context;

	public FornitoreFacade()  {
		emf = Persistence.createEntityManagerFactory("ecommerce-unit");
		entityManager = emf.createEntityManager();
		try {
			context = new InitialContext();
			datasource = new MysqlDataSource();
			datasource.setUrl("java:/comp/env/localhost/ecommerce");
			datasource.setUser("root");
			datasource.setPassword("");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Fornitore createFornitore(String pIva, String indirizzo, String email, String telefono) {
		Fornitore f = new Fornitore(pIva, indirizzo, email, telefono);
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
//		entityManager.persist(f);
		tx.commit();
		entityManager.close();
		emf.close();
		return f;
	}
	
}
