package br.com.senai.transportadora.model;

import br.com.senai.transportadora.DTO.EntregaDTO;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Entrega {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	String descricao;

	@JoinColumn(name = "motorista_idMotorista")
	@ManyToOne(cascade = CascadeType.ALL)
	Motorista motorista;

	public Entrega(EntregaDTO entrega) {
		this.id = entrega.getId();
		this.descricao = entrega.getDescricao();
		this.motorista = entrega.getMotorista();
	}

	public Entrega() {
	}

	public Entrega(Integer id, String descricao, Motorista motorista) {
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
