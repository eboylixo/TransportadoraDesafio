package br.com.senai.transportadora.model;

import br.com.senai.transportadora.DTO.MotoristaDTO;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Motorista {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	String nome;
	String cnh;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Transportadora_idtransportadora")
	Transportadora transportadora;

	public Motorista(MotoristaDTO motorista) {
		this.id = motorista.getId();
		this.nome = motorista.getNome();
		this.cnh = motorista.getCnh();
		this.transportadora = motorista.getTransportadora();
	}

	public Motorista() {
	}

	public Motorista(Integer id, String nome, String cnh, Transportadora transportadora) {
		this.id = id;
		this.nome = nome;
		this.cnh = cnh;
		this.transportadora = transportadora;
	}

	public Transportadora getTransportadora() {
		return transportadora;
	}

	public void setTransportadora(Transportadora transportadora) {
		this.transportadora = transportadora;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

}
