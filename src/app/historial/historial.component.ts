import { Component, OnInit } from '@angular/core';
import { DetalleService } from '../service/detalle.service';
import { Documento } from '../model/Documento';
import { Detalle } from '../model/Detalle';

import * as jsPDF from 'jspdf';
import { DocumentoService } from '../service/documento.service';
import { DateStringConverter } from '../StringToDateConverter';

@Component({
  selector: 'app-historial',
  templateUrl: './historial.component.html',
  styleUrls: ['./historial.component.css']
})
export class HistorialComponent implements OnInit {

  documentos:Documento[];

  numeros:number;

  constructor(private documentoService:DocumentoService) {}

  public downloadPdf(documento:Documento):void{

    console.log();
    
    console.log(documento.nombre_contacto);
    var doc = new jsPDF()
    doc.text(10,15,"Factura: "+documento.folio);
    doc.text(120,15,"Total: "+documento.total+"$");
    doc.line(10, 20, 200, 20);
    doc.setLineWidth(2);
    doc.text(10,27,"Fecha: "+documento.fecha+"");
    doc.line(10, 30, 200, 30);
    doc.text(10,40,"Sr(Sra): "+ documento.nombre_contacto);
    doc.setLineWidth(0.01);
    doc.line(10, 43, 200, 43);
    doc.text(91,50,"Detalles");
    doc.line(10, 54, 200, 54); 
    doc.text(10,62,"Cantidad");
    doc.text(60,62,"Producto");
    doc.text(120,62,"Precio");
    doc.text(160,62,"Sub Total");
    doc.line(10, 65, 200, 65);

    let altura:number=74;
    let alturaDeLinea:number=78;
/*
    doc.text(10,altura,documento.detalles[0].cantidad+""); //sumale 12 al valor de enmedio en cada iteracion (Cantidad)
    doc.text(60,altura,documento.detalles[0].descripcion+""); //Producto
    doc.text(120,altura,documento.detalles[0].precio+"$");
    doc.text(160,altura,documento.detalles[0].subTotal+"$");
    doc.line(10, alturaDeLinea, 200, alturaDeLinea); */

    for (var index = 0; index < documento.detalles.length; index++) {
      doc.text(10,altura,documento.detalles[index].cantidad+""); //sumale 12 al valor de enmedio en cada iteracion (Cantidad)
      doc.text(60,altura,documento.detalles[index].descripcion+""); //Producto
      doc.text(120,altura,documento.detalles[index].precio+"$");
      doc.text(160,altura,documento.detalles[index].subTotal+"$");
      doc.line(10, alturaDeLinea, 200, alturaDeLinea); 
    altura+=12;
    alturaDeLinea+=12;
    }


  //  doc.autoPrint();
  //  doc.output("dataurlnewwindow");
 // doc.autoPrint();
  window.open(doc.output('bloburl'), '_blank');

  }

  public delete(documento:Documento){
    this.documentoService.delete(documento).
    subscribe(ret=>{console.log(ret);  
      this.remove(documento); },
                    er=> console.log(er));
  }

  private remove(detalle:Documento){
    for (var i =0; i < this.documentos.length; i++)
    if (this.documentos[i] == detalle) {
       this.documentos.splice(i,1);
       break;
    }
  }

  ngOnInit() {
      this.documentoService.getAll().subscribe(rs=>{this.documentos=rs;
      console.log(this.documentos)},err=>console.log(err));
      
  }

}
