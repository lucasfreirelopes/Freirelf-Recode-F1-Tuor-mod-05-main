package com.example.demo.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Hotel")
public class Hotel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "nome_Hotel", length = 15)
	private String nomeHotel;

	@Column(name = "nome")
	private String nome;
	
	@Column(name = "dataCheckin")
	private Date dataCheckin;

	@Column(name = "dataCheckout")
	private Date dataCheckout;
	
	@ManyToMany(cascade = {
			CascadeType.ALL
		})
		@JoinTable(name = "escolher_destino",
			joinColumns = {@JoinColumn(name="cliente_fk")},
			inverseJoinColumns = {@JoinColumn(name="pacote_fk")}
				)
	private List<pacotes> pacotes;

	@ManyToOne
	@JoinColumn(name = "voo_id")
	private Voo voo;

	
	

	public Hotel() {
		super();
	}

	public Hotel(Long id, String nomeHotel, String nome, Date dataCheckin, Date dataCheckout) {
		super();
		this.id = id;
		this.nomeHotel = nomeHotel;
		this.nome = nome;
		this.dataCheckin = dataCheckin;
		this.dataCheckout = dataCheckout;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeHotel() {
		return nomeHotel;
	}

	public void setNomeHotel(String cpf) {
		this.nomeHotel = nomeHotel;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String Nome) {
		this.nome = nome;
	}

	public Date getDataCheckin() {
		return dataCheckin;
	}

	public void setDataCheckin(Date DataCheckin) {
		this.dataCheckin = dataCheckin;
	}

	public Date getDataCheckout() {
		return dataCheckout;
	}

	public void setDataCheckout(Date dataCheckout) {
		this.dataCheckout = dataCheckout;
	}
	public Voo getVoo() {
		return voo;
	}

	public void setVoo(Voo voo) {
		this.voo = voo;
	}

}
