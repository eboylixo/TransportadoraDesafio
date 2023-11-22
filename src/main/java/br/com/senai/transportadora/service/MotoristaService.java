package br.com.senai.transportadora.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.senai.transportadora.DTO.MotoristaDTO;
import br.com.senai.transportadora.model.Motorista;
import br.com.senai.transportadora.repository.MotoristaRepository;

@Service
public class MotoristaService {

	@Autowired
	private MotoristaRepository motoristaRepository;

	public Motorista salvaMotorista(MotoristaDTO motoristaDTO) {
		Motorista motorista = new Motorista(motoristaDTO);
		return motoristaRepository.save(motorista);
	}

	public List<Motorista> listaMotorista() {
		return motoristaRepository.findAll();
	}

	public void excluirMotorista(Integer id) {
		motoristaRepository.deleteById(id);
	}
}
