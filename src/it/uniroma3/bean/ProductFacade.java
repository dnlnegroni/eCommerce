package it.uniroma3.bean;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.sql.DataSource;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class ProductFacade {
	
    private EntityManager entityManager;
    private EntityManagerFactory emf;
    private MysqlDataSource datasource;
    Context context;

	public ProductFacade()  {
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

	public Prodotto createProduct(String codice, String nome, Double costo, String descrizione, Integer quantita) {
		Prodotto product = new Prodotto(codice, nome, costo, descrizione, quantita);
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.persist(product);
		tx.commit();
		entityManager.close();
		emf.close();
		return product;
	}
	
	public Prodotto getProduct(Long id) {
		Prodotto product = entityManager.find(Prodotto.class, id);
		entityManager.close();
		emf.close();
		return product;
	}
	
	public List<Prodotto> getAllProducts() {
        CriteriaQuery<Prodotto> cq = entityManager.getCriteriaBuilder().createQuery(Prodotto.class);
        cq.select(cq.from(Prodotto.class));
        List<Prodotto> products = entityManager.createQuery(cq).getResultList();
		entityManager.close();
		emf.close();
		return products;
	}

	public void updateProduct(Prodotto product) {
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
        entityManager.merge(product);
		tx.commit();
		entityManager.close();
		emf.close();	}
	
    private void deleteProduct(Prodotto product) {
        entityManager.remove(product);
    }

	public void deleteProduct(Long id) {
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		Prodotto product = entityManager.find(Prodotto.class, id);
        deleteProduct(product);
		tx.commit();
		entityManager.close();
		emf.close();	}
}
