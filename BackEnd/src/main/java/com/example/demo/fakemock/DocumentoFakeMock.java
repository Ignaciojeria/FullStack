package com.example.demo.fakemock;



import java.util.GregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.demo.entity.Documento;
import com.example.demo.servicio.DocumentoService;

@Component
public class DocumentoFakeMock {
	
	@Autowired DocumentoService documentoService;

	public void setInitialData() {
		documentoService.save(new Documento(1,new GregorianCalendar(2015,10,10).getTime(),9878L,"Mr Robot",900000.0));
		documentoService.save(new Documento(2,new GregorianCalendar(1900,1,1).getTime(),9879L,"Teemo",10000.0));
		documentoService.save(new Documento(3,new GregorianCalendar(2000,8,10).getTime(),9880L,"Rick Sanchez",20000.0));
	}

}
