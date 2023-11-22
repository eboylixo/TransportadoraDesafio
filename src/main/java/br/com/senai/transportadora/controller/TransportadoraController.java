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

import br.com.senai.transportadora.DTO.TransportadoraDTO;
import br.com.senai.transportadora.model.Transportadora;
import br.com.senai.transportadora.service.TransportadoraService;

@RestController

@RequestMapping("/transportadora")
public class TransportadoraController {

	@Autowired
	private TransportadoraService transportadoraService;

	@PostMapping
	public ResponseEntity<TransportadoraDTO> criaTransportadora(@RequestBody TransportadoraDTO transportadoraDTO) {
		Transportadora transportadora = transportadoraService.salvaTransportadora(transportadoraDTO);
		return ResponseEntity.ok(new TransportadoraDTO(transportadora));
	}

	@GetMapping
	public ResponseEntity<List<TransportadoraDTO>> listaTransportadora() {
		List<Transportadora> transportadora = transportadoraService.listaTransportadora();
		List<TransportadoraDTO> transportadoraDTOs = transportadora.stream().map(TransportadoraDTO::new).toList();
		return ResponseEntity.ok(transportadoraDTOs);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> excluirTransportadora(@PathVariable Integer id) {
		transportadoraService.excluirTransportadora(id);
		return ResponseEntity.status(HttpStatus.OK).build();
	}

	@PutMapping
	public ResponseEntity<TransportadoraDTO> atualizaJogo(@RequestBody TransportadoraDTO transportadoraDTO) {
		Transportadora transportadoraAtualizada = transportadoraService.salvaTransportadora(transportadoraDTO);
		return ResponseEntity.ok(new TransportadoraDTO(transportadoraAtualizada));
	}

}
