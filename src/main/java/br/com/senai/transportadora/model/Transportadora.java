package br.com.senai.transportadora.model;

import java.util.List;

import br.com.senai.transportadora.DTO.TransportadoraDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Transportadora {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	String nome;
	@OneToMany(mappedBy = "transportadora")
	List<Motorista> listaMotorista;

	public Transportadora(TransportadoraDTO transportadora) {
		this.id = transportadora.getId();
		this.nome = transportadora.getNome();
		this.listaMotorista = transportadora.getListaMotorista();
	}

	public Transportadora() {
	}

	public Transportadora(Integer id, String nome, List<Motorista> listaMotorista) {
		this.id = id;
		this.nome = nome;
		this.listaMotorista = listaMotorista;
	}

	public List<Motorista> getListaMotorista() {
		return listaMotorista;
	}

	public void setListaMotorista(List<Motorista> listaMotorista) {
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

}
