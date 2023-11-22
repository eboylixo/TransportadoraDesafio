package br.com.senai.transportadora.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.transportadora.DTO.TransportadoraDTO;
import br.com.senai.transportadora.model.Transportadora;
import br.com.senai.transportadora.repository.TransportadoraRepository;

@Service
public class TransportadoraService {

	@Autowired
	private TransportadoraRepository transportadoraRepository;

	public Transportadora salvaTransportadora(TransportadoraDTO transportadoraDTO) {
		Transportadora transportadora = new Transportadora(transportadoraDTO);
		return transportadoraRepository.save(transportadora);
	}

	public List<Transportadora> listaTransportadora() {
		return transportadoraRepository.findAll();
	}

	public void excluirTransportadora(Integer id) {
		transportadoraRepository.deleteById(id);
	}

}
