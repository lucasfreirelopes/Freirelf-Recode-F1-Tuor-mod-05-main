package com.example.demo.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "voo")
public class Voo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "companhia_aerea")
	private String CompanhiaA;
	
	@Column(name = "poltrona")
	private Double poltrona;

	@JsonIgnore
	@OneToMany(mappedBy = "voo")
	private List<Clientes> clientes;

	
	public Voo() {
		super();

	}
	public Voo(long id, String companhiaA, Double poltrona) {
		super();
		this.id = id;
		CompanhiaA = companhiaA;
		this.poltrona = poltrona;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCompanhiaA() {
		return CompanhiaA;
	}
	public void setCompanhiaA(String companhiaA) {
		CompanhiaA = companhiaA;
	}
	public Double getPoltrona() {
		return poltrona;
	}
	public void setPreco(Double poltrona) {
		this.poltrona = poltrona;
	}

	
}
