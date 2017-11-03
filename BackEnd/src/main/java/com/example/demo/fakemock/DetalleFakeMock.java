package com.example.demo.fakemock;

import java.util.GregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Detalle;
import com.example.demo.entity.Documento;
import com.example.demo.servicio.DetalleService;

@Component
public class DetalleFakeMock {
	@Autowired
	private DetalleService detalleService;

	public void setInitialData() {
		
		detalleService.save(new Detalle(1L,new Documento(1,new GregorianCalendar(2015,10,10).getTime(),9878L,"Mr Robot",900000.0),"Pesos",100000,3,300000," Lavadora"));
		detalleService.save(new Detalle(2L,new Documento(1,new GregorianCalendar(2015,10,10).getTime(),9878L,"Mr Robot",900000.0),"Pesos",300000,1,600000," Cama"));
		detalleService.save(new Detalle(3L,new Documento(1,new GregorianCalendar(2015,10,10).getTime(),9878L,"Mr Robot",900000.0),"Pesos",300000,1,900000,"Smart Tv"));
	}
}
