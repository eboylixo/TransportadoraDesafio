package br.com.senai.transportadora.DTO;

import br.com.senai.transportadora.model.Entrega;
import br.com.senai.transportadora.model.Motorista;

public class EntregaDTO {

	Integer id;
	String descricao;
	Motorista motorista;

	public EntregaDTO(Entrega entrega) {
		this.id = entrega.getId();
		this.descricao = entrega.getDescricao();
		this.motorista = entrega.getMotorista();
	}

	public EntregaDTO() {
	}

	public EntregaDTO(Integer id, String descricao, Motorista motorista) {
		this.id = id;
		this.descricao = descricao;
		this.motorista = motorista;
	}

	public Motorista getMotorista() {
		return motorista;
	}

	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
