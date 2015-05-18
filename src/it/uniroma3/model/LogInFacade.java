/**
 * 
 */
package it.uniroma3.model;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

/**
 * @author daniele
 *
 */
public class LogInFacade {
	
	private EntityManager entityManager;
    private EntityManagerFactory emf;
    private MysqlDataSource datasource;
    Context context;

	public LogInFacade()  {
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
	
	public Amministratore getAmministratore(String email) {
		Query query = entityManager.createQuery("SELECT a FROM Amministratore a WHERE a.email=" + "'" + email + "'");
        List<Amministratore> listaAmministratore = query.getResultList();
        Amministratore amministratore = listaAmministratore.get(0);
		entityManager.close();
		emf.close();
		return amministratore;
	}
	
	public Cliente getCliente(String email) {
		Query query = entityManager.createQuery("SELECT c FROM Cliente c WHERE c.email=" + "'" + email + "'");
        List<Cliente> listaClienti = query.getResultList();
        Cliente cliente = listaClienti.get(0);
		entityManager.close();
		emf.close();
		return cliente;
	}
	
}
