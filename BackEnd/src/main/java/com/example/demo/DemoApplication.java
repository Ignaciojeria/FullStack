package com.example.demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Detalle;
import com.example.demo.entity.Documento;
import com.example.demo.fakemock.DetalleFakeMock;
import com.example.demo.fakemock.DocumentoFakeMock;
import com.example.demo.servicio.DetalleService;

@SpringBootApplication
public class DemoApplication {
	
	@Autowired private DetalleFakeMock detalleFakeMock;
	@Autowired private DocumentoFakeMock documentoFackeMock;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Autowired DetalleService detalleService;
	
	@PostConstruct
	void init() {
		documentoFackeMock.setInitialData();
		detalleFakeMock.setInitialData();
	//	detalleService.delete(new Detalle(1L,new Documento(1,null,9878L,"Mr Robot",4.8),"US",9000,3,10.5," Servicios secretos"));
	}


}
