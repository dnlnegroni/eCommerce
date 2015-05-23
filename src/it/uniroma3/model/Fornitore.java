package it.uniroma3.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Fornitore {
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private Long id;
	private String partitaIva;
	private String indirizzo;
	private String email;
	private String telefono;
	@ManyToMany(mappedBy="fornitori")
	private List<Prodotto> prodotti;
	
	public Fornitore(){
		
	}
	
	public Fornitore(String pIva, String ind, String mail, String tel){
		this.partitaIva = pIva;
		this.indirizzo = ind;
		this.email = mail;
		this.telefono = tel;
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
	 * @return the partitaIva
	 */
	public String getPartitaIva() {
		return partitaIva;
	}
	/**
	 * @param partitaIva the partitaIva to set
	 */
	public void setPartitaIva(String partitaIva) {
		this.partitaIva = partitaIva;
	}
	/**
	 * @return the indirizzo
	 */
	public String getIndirizzo() {
		return indirizzo;
	}
	/**
	 * @param indirizzo the indirizzo to set
	 */
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}
	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	/**
	 * @return the listaProdotti
	 */
	public List<Prodotto> getProdotti() {
		return prodotti;
	}
	/**
	 * @param listaProdotti the listaProdotti to set
	 */
	public void setProdotti(List<Prodotto> prodotti) {
		this.prodotti = prodotti;
	}
	
}
