package it.uniroma3.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Cliente {
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private Long id;
	
	private String nome;
	
	private String cognome;
	
	@Temporal(TemporalType.DATE)
	private Date dataNascita;
	
	@Temporal(TemporalType.DATE)
	private Date dataRegistrazione;
	
	private String indirizzo;
	
	private String email;
	
	private String password;
		
	@OneToMany(mappedBy="cliente")
	private List<Ordine> listaOrdini;
	
	public Cliente(){
	}
	
	public Cliente(String nome, String cognome, String indirizzo, String email, String password, Date dataNascita, Date dataRegistrazione) {
		this.nome = nome;
		this.cognome = cognome;
		this.indirizzo = indirizzo;
		this.email = email;
		this.password = password;
		this.dataNascita = dataNascita;
		this.dataRegistrazione = dataRegistrazione;
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
	 * @return the cognome
	 */
	public String getCognome() {
		return cognome;
	}

	/**
	 * @param cognome the cognome to set
	 */
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	/**
	 * @return the dataNascita
	 */
	public Date getDataNascita() {
		return dataNascita;
	}

	/**
	 * @param dataNascita the dataNascita to set
	 */
	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}

	/**
	 * @return the dataRegistrazione
	 */
	public Date getDataRegistrazione() {
		return dataRegistrazione;
	}

	/**
	 * @param dataRegistrazione the dataRegistrazione to set
	 */
	public void setDataRegistrazione(Date dataRegistrazione) {
		this.dataRegistrazione = dataRegistrazione;
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
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the listaOrdini
	 */
	public List<Ordine> getListaOrdini() {
		return listaOrdini;
	}

	/**
	 * @param listaOrdini the listaOrdini to set
	 */
	public void setListaOrdini(List<Ordine> listaOrdini) {
		this.listaOrdini = listaOrdini;
	}
	
}
