package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Detalle;
import com.example.demo.entity.Documento;
import com.example.demo.servicio.DocumentoService;

@RestController
@CrossOrigin(origins = "*")
public class DocumentoController {

	@Autowired DocumentoService documentoService;
	
	@GetMapping(value="documento")
	public List<Documento> getAll(){
		return documentoService.findAll();
	}
	
	@PostMapping(value="documento")
	public ResponseEntity<Documento> persist(@RequestBody Documento documento) {
		documentoService.save(documento);
		return new ResponseEntity<Documento>(documento,HttpStatus.OK);
	}
	
	@DeleteMapping(value="documento/{id}")
	public ResponseEntity<Documento> delete( @PathVariable(value="id") long id){
		documentoService.delete(id);
		return new ResponseEntity<Documento>(HttpStatus.OK);
	}
	
	
}
