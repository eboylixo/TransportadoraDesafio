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

import br.com.senai.transportadora.DTO.EntregaDTO;
import br.com.senai.transportadora.model.Entrega;
import br.com.senai.transportadora.service.EntregaService;

@RestController

@RequestMapping("/entrega")
public class EntregaController {

	@Autowired
	private EntregaService entregaService;

	@PostMapping
	public ResponseEntity<EntregaDTO> criaEndereco(@RequestBody EntregaDTO entregaDTO) {
		Entrega entrega = entregaService.salvaEntrega(entregaDTO);
		return ResponseEntity.ok(new EntregaDTO(entrega));
	}

	@GetMapping
	public ResponseEntity<List<EntregaDTO>> listaEndereco() {
		List<Entrega> entrega = entregaService.listaEntrega();
		List<EntregaDTO> entregaDTOs = entrega.stream().map(EntregaDTO::new).toList();
		return ResponseEntity.ok(entregaDTOs);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> excluirEndereco(@PathVariable Integer id) {
		entregaService.excluirEntrega(id);
		return ResponseEntity.status(HttpStatus.OK).build();
	}

	@PutMapping
	public ResponseEntity<EntregaDTO> atualizaEndereco(@RequestBody EntregaDTO entregaDTO) {
		Entrega enderecoAtualizado = entregaService.salvaEntrega(entregaDTO);
		return ResponseEntity.ok(new EntregaDTO(enderecoAtualizado));
	}

}
