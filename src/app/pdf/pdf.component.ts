import { Component, OnInit } from '@angular/core';
import * as jsPDF from 'jspdf';
@Component({
  selector: 'app-pdf',
  templateUrl: './pdf.component.html',
  styleUrls: ['./pdf.component.css']
})
export class PdfComponent implements OnInit {

  constructor() { }

  downloadPdf(){
    const doc=new jsPDF();
    doc.text(10,10,'Algo de texto');
    doc.save('test.pdf');
  }

  ngOnInit() {
  }

}
