package com.example.demo.servicio;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entity.Documento;
import com.example.demo.repository.DocumentoRepository;


@Service
public class DocumentoService {

	@Autowired
	private DocumentoRepository documentoRepository;
	
	public List<Documento> findAll(){
		List<Documento> documentos= documentoRepository.findAll();
		return documentos;
	}
	
	/*
	private void InentoDeOrdenarUnSet(List<Documento> documentos) {
		
		Comparator<Detalle> orderBySubtotalDetalleDocumento=((e1,e2)->Double.compare(e1.getSubTotal(),e2.getSubTotal()));
		
		for (int i = 0; i < documentos.size(); i++) {
			
			Set<Detalle> detalles=documentos.get(i).getDetalles()
			.stream()
			.sorted(orderBySubtotalDetalleDocumento)
			.collect(Collectors.toSet());
			
			documentos.get(i).setDetalles(detalles); 
		}
	}*/
	

	
	public void save(Documento documento) {
		documentoRepository.save(documento);
	}
	public void delete(long id) {
		Documento detalle=documentoRepository.findById(id);
		documentoRepository.delete(detalle);
	}
	
}
