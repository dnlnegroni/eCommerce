package it.uniroma3.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Prodotto {
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private Long id;
	private String codice;
	private String nome;
	private Double costo;
	private String descrizione;
	private Integer quantita;
	
	@ManyToMany(cascade={CascadeType.PERSIST, CascadeType.REMOVE})
	private List<Fornitore> fornitori;
	
	public Prodotto () {
	}
	
	public Prodotto (String codice, String nome, Double costo, String descrizione, Integer quantita) {
		this.codice = codice;
		this.nome = nome;
		this.costo = costo;
		this.descrizione = descrizione;
		this.quantita = quantita;
		this.fornitori = new ArrayList<Fornitore>();
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
	 * @return the codice
	 */
	public String getCodice() {
		return codice;
	}
	
	/**
	 * @param codice the codice to set
	 */
	public void setCodice(String codice) {
		this.codice = codice;
	}
	
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * @return the costo
	 */
	public Double getCosto() {
		return costo;
	}
	
	/**
	 * @param costo the costo to set
	 */
	public void setCosto(Double costo) {
		this.costo = costo;
	}
	
	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}
	
	/**
	 * @param descrizione the descrizione to set
	 */
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
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
	
	/**
	 * @return the fornitori
	 */
	public List<Fornitore> getFornitori() {
		return fornitori;
	}
	
	/**
	 * @param fornitori the fornitori to set
	 */
	public void setFornitori(List<Fornitore> fornitori) {
		this.fornitori = fornitori;
	}
	
}
