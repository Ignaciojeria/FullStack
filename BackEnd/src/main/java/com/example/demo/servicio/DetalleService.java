package com.example.demo.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Detalle;
import com.example.demo.repository.DetalleRepository;


@Service
public class DetalleService {

	@Autowired
	private DetalleRepository detalleRepository;
	
	public List<Detalle> findAll(){
		return detalleRepository.findAll();
	}
	
	public void save(Detalle detalle) {
		detalleRepository.save(detalle);
	}
	
	public void delete(long id) {
		Detalle detalle=detalleRepository.findById(id);
		detalleRepository.delete(detalle);
	}
	

	
}
