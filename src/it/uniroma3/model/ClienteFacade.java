/**
 * 
 */
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

/**
 * @author daniele
 *
 */
public class ClienteFacade {

	private EntityManager entityManager;
	private EntityManagerFactory emf;
	private MysqlDataSource datasource;
	Context context;

	public ClienteFacade()  {
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
	
	public Cliente createCliente(String nome, String cognome, String indirizzo, String email, String password, Date dataNascita, Date dataRegistrazione) {
		Cliente cliente = new Cliente(nome, cognome, indirizzo, email, password, dataNascita, dataRegistrazione);
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.persist(cliente);
		tx.commit();
		entityManager.close();
		emf.close();
		return cliente;
	}
	
	public Cliente getCliente(Long id) {
		Cliente cliente = entityManager.find(Cliente.class, id);
		entityManager.close();
		emf.close();
		return cliente;
	}

}
