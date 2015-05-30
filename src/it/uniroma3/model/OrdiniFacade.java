package it.uniroma3.model;

import java.util.Date;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

//import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class OrdiniFacade {
	
    private EntityManager entityManager;
    private EntityManagerFactory emf;
    private MysqlDataSource datasource;
    Context context;

	public OrdiniFacade()  {
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
	
	public Ordine persistOrdine(Ordine o) {
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		o.setDataChiusura(new Date());
		entityManager.persist(o);
		tx.commit();
		entityManager.close();
		emf.close();
		return o;
	}
	
	public Ordine getOrdine(Long id) {		
		Ordine o = entityManager.find(Ordine.class, id);
		entityManager.close();
		emf.close();
		return o;
	}
	
//	public Ordine getOrdine(Long id) {
//		Query q = this.entityManager.createQuery("Select o FROM Ordine o WHERE o.id = :id");
//		q.setParameter("id", id);
//		List<Ordine> l = q.getResultList();
//		Ordine o = l.get(0);
//		entityManager.close();
//		emf.close();
//		return o;
//	}
	
	@SuppressWarnings("unchecked")
	public List<RigaOrdine> getRigherOrdine(Long id) {
		Query q = this.entityManager.createQuery("Select o FROM Ordine o WHERE o.id = :id");
		q.setParameter("id", id);
		List<Ordine> l = q.getResultList();
		Ordine o = l.get(0);
		List<RigaOrdine> ro = o.getRigheOrdine();
		entityManager.close();
		emf.close();
		return ro;
	}
	
	public List<Ordine> getAllOrders() {
		CriteriaQuery<Ordine> cq = entityManager.getCriteriaBuilder().createQuery(Ordine.class);
        cq.select(cq.from(Ordine.class));
        List<Ordine> ordini = entityManager.createQuery(cq).getResultList();
		entityManager.close();
		emf.close();
		return ordini;
	}
	
	public List<Ordine> getAllClosedOrders() {
		Query q = this.entityManager.createQuery("Select o FROM Ordine o WHERE o.dataChiusura is not null");
		List<Ordine> l = q.getResultList();
		entityManager.close();
		emf.close();
		return l;
	}
	
	public boolean evadiOrdine(Long id) {
//		emf = Persistence.createEntityManagerFactory("ecommerce-unit");
//		entityManager = emf.createEntityManager();
		Query q = this.entityManager.createQuery("Select o FROM Ordine o WHERE o.id = :id");
		q.setParameter("id", id);
		List<Ordine> l = q.getResultList();
		Ordine o = l.get(0);
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		for(RigaOrdine r : o.getRigheOrdine()) {
			Prodotto p = r.getProdotto();
			if(p.getQuantita() < r.getQuantita()) 
				return false;
			p.setQuantita(p.getQuantita()-r.getQuantita());
			entityManager.merge(p);
		}
		entityManager.merge(o);
		tx.commit();
		entityManager.close();
		emf.close();
		return true;
	}

}
