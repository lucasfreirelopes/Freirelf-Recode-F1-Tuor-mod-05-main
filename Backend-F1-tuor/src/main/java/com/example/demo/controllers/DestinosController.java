package com.example.demo.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ResourceNotFoundException;
import com.example.demo.entities.pacotes;
import com.example.demo.entities.Promocao;
import com.example.demo.repositories.DestinosRepository;
import com.example.demo.repositories.PromocaoRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class DestinosController {

	@Autowired
	private DestinosRepository destinosRepository;
	
	@Autowired
	private PromocaoRepository promocaoRepository;
	
	//GET ALL
	@GetMapping("/destinos")
	public List<pacotes> getAllDestinos(){
		return destinosRepository.findAll();
	}
	
	//GET
	@GetMapping("/destino/{id}")
	public ResponseEntity<pacotes> getDestinoById(@PathVariable Long id){
		pacotes destino = destinosRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("destino inexistente"));
		return ResponseEntity.ok(destino);
	}
	
	//POST CREATE
	@PostMapping("/destino")
	public pacotes createDestino(@RequestBody pacotes destino) {
		return destinosRepository.save(destino);
	}
	
	//PUT
	@PutMapping("/destnio/{id}")
	public ResponseEntity<pacotes> updateDestino(@PathVariable Long id, @RequestBody pacotes destDetails){
		pacotes destino = destinosRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("destino inexistente"));
		Promocao promo = promocaoRepository.findById(destDetails.getPromocao().getId()).get();
		
		destino.setCidade(destDetails.getCidade());
		destino.setEstado(destDetails.getEstado());
		destino.setObraR(destDetails.getObraR());
		destino.setPromocao(promo);
		
		pacotes newDestino = destinosRepository.save(destino);
		return ResponseEntity.ok(newDestino);
	}
	
	//DETELE
	@DeleteMapping("/destino/{id}")
	public ResponseEntity<Map<String,Boolean>> deleteDestino(@PathVariable Long id){
		pacotes destino = destinosRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("destino inexistente"));
		
		destinosRepository.delete(destino);
		Map<String,Boolean> response = new HashMap<>();
		return ResponseEntity.ok(response);
	}
}
