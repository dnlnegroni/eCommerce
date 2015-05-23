package it.uniroma3.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Ordine {
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private Long id;
	
	@Temporal(TemporalType.DATE)
	Date dataApertura;
	
	@Temporal(TemporalType.DATE)
	private Date dataChiusura;
	
	@Temporal(TemporalType.DATE)
	private Date dataEvasione;
	
	@OneToMany(cascade={CascadeType.PERSIST, CascadeType.REMOVE})
	@JoinColumn(name="idOrdine")
	private List<RigaOrdine> righeOrdine;
	
	@ManyToOne
	private Cliente cliente;
	
	public Ordine (){
		this.dataApertura= new Date();
		this.righeOrdine= new ArrayList<RigaOrdine>();
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
	 * @return the dataApertura
	 */
	public Date getDataApertura() {
		return dataApertura;
	}

	/**
	 * @param dataApertura the dataApertura to set
	 */
	public void setDataApertura(Date dataApertura) {
		this.dataApertura = dataApertura;
	}

	/**
	 * @return the dataChiusura
	 */
	public Date getDataChiusura() {
		return dataChiusura;
	}

	/**
	 * @param dataChiusura the dataChiusura to set
	 */
	public void setDataChiusura(Date dataChiusura) {
		this.dataChiusura = dataChiusura;
	}

	/**
	 * @return the dataEvasione
	 */
	public Date getDataEvasione() {
		return dataEvasione;
	}

	/**
	 * @param dataEvasione the dataEvasione to set
	 */
	public void setDataEvasione(Date dataEvasione) {
		this.dataEvasione = dataEvasione;
	}

	/**
	 * @return the righeOrdine
	 */
	public List<RigaOrdine> getRigheOrdine() {
		return righeOrdine;
	}

	/**
	 * @param righeOrdine the righeOrdine to set
	 */
	public void setRigheOrdine(List<RigaOrdine> righeOrdine) {
		this.righeOrdine = righeOrdine;
	}

	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
