package br.com.senai.transportadora.DTO;

import java.util.List;

import br.com.senai.transportadora.model.Motorista;
import br.com.senai.transportadora.model.Transportadora;

public class TransportadoraDTO {

	Integer id;
	String nome;
	List<Motorista> listaMotorista;

	public TransportadoraDTO(Transportadora transportadora) {
		this.id = transportadora.getId();
		this.nome = transportadora.getNome();
		this.listaMotorista = transportadora.getListaMotorista();
	}

	public TransportadoraDTO() {
	}

	public TransportadoraDTO(Integer id, String nome, List<Motorista> listaMotorista) {
		this.id = id;
		this.nome = nome;
		this.listaMotorista = listaMotorista;
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

	public List<Motorista> getListaMotorista() {
		return listaMotorista;
	}

	public void setListaMotorista(List<Motorista> listaMotorista) {
		this.listaMotorista = listaMotorista;
	}

}
