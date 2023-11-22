package br.com.senai.transportadora.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.senai.transportadora.DTO.EntregaDTO;
import br.com.senai.transportadora.model.Entrega;
import br.com.senai.transportadora.repository.EntregaRepository;

@Service
public class EntregaService {

	@Autowired
	private EntregaRepository entregaRepository;

	public Entrega salvaEntrega(EntregaDTO entregaDTO) {
		Entrega entrega = new Entrega(entregaDTO);
		return entregaRepository.save(entrega);
	}

	public List<Entrega> listaEntrega() {
		return entregaRepository.findAll();
	}

	public void excluirEntrega(Integer id) {
		entregaRepository.deleteById(id);
	}

}
