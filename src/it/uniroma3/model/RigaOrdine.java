package it.uniroma3.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class RigaOrdine {
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private Long id;
	
	@OneToOne
	private Prodotto prodotto;
	private String nomeProdotto;
	private Integer quantita;
	private Double prezzoUnitario;
	
	

	public RigaOrdine(Prodotto p, Integer q){
		this.prodotto=p;
		this.quantita=q;
		this.nomeProdotto=p.getNome();
		this.prezzoUnitario=p.getCosto();
	}
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	
	/**
	 * @return the prodotto
	 */
	public Prodotto getProdotto() {
		return prodotto;
	}
	
	/**
	 * @param prodotto the prodotto to set
	 */
	public void setProdotto(Prodotto prodotto) {
		this.prodotto = prodotto;
	}
	
	/**
	 * @return the quantita
	 */
	public Integer getQuantita() {
		return quantita;
	}
	
	/**
	 * @param quantita the quantita to set
	 */
	public void setQuantita(Integer quantita) {
		this.quantita = quantita;
	}
	
	public String getNomeProdotto() {
		return nomeProdotto;
	}

	public void setNomeProdotto(String nomeProdotto) {
		this.nomeProdotto = nomeProdotto;
	}

	public Double getPrezzoUnitario() {
		return prezzoUnitario;
	}

	public void setPrezzoUnitario(Double double1) {
		this.prezzoUnitario = double1;
	}

}
