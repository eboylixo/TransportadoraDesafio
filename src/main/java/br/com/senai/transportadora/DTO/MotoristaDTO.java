package br.com.senai.transportadora.DTO;

import br.com.senai.transportadora.model.Motorista;
import br.com.senai.transportadora.model.Transportadora;

public class MotoristaDTO {

	Integer id;
	String nome;
	String cnh;
	Transportadora transportadora;

	public MotoristaDTO(Motorista motorista) {
		this.id = motorista.getId();
		this.nome = motorista.getNome();
		this.cnh = motorista.getCnh();
		this.transportadora = motorista.getTransportadora();
	}

	public MotoristaDTO() {
	}

	public MotoristaDTO(Integer id, String nome, String cnh, Transportadora transportadora) {
		this.id = id;
		this.nome = nome;
		this.cnh = cnh;
		this.transportadora= transportadora;
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

	public Transportadora getTransportadora() {
		return transportadora;
	}

	public void setTransportadora(Transportadora transportadora) {
		this.transportadora = transportadora;
	}



}
