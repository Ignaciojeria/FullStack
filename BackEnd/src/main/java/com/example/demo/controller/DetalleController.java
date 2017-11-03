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
import com.example.demo.repository.DetalleRepository;
import com.example.demo.servicio.DetalleService;

@RestController
@CrossOrigin(origins = "*")
public class DetalleController {

	@Autowired DetalleService detalleService;
	
	@GetMapping(value="detalle")
	public List<Detalle> getAll(){
		return detalleService.findAll();
	}


	@DeleteMapping(value="detalle/{id}")
	public ResponseEntity<Detalle> delete( @PathVariable(value="id") long id){
		detalleService.delete(id);
		return new ResponseEntity<Detalle>(HttpStatus.OK);
	}
	
}
