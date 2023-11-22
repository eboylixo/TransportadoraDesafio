package br.com.senai.transportadora.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.transportadora.DTO.MotoristaDTO;
import br.com.senai.transportadora.model.Motorista;
import br.com.senai.transportadora.service.MotoristaService;

@RestController


@RequestMapping("/motorista")
public class MotoristaController {

	@Autowired
	private MotoristaService motoristaService;

	@PostMapping
	public ResponseEntity<MotoristaDTO> criaMotorista(@RequestBody MotoristaDTO motoristaDTO) {
		Motorista motorista = motoristaService.salvaMotorista(motoristaDTO);
		return ResponseEntity.ok(new MotoristaDTO(motorista));
	}

	@GetMapping
	public ResponseEntity<List<MotoristaDTO>> listaMotorista() {
		List<Motorista> motorista = motoristaService.listaMotorista();
		List<MotoristaDTO> motoristaDTOs = motorista.stream().map(MotoristaDTO::new).toList();
		return ResponseEntity.ok(motoristaDTOs);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> excluirTransportadora(@PathVariable Integer id) {
		motoristaService.excluirMotorista(id);
		return ResponseEntity.status(HttpStatus.OK).build();
	}

	@PutMapping
	public ResponseEntity<MotoristaDTO> atualizaJogo(@RequestBody MotoristaDTO motoristaDTO) {
		Motorista motoristaAtualizado = motoristaService.salvaMotorista(motoristaDTO);
		return ResponseEntity.ok(new MotoristaDTO(motoristaAtualizado));
	}

}
