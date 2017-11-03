import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { PdfComponent } from './pdf/pdf.component';
import { DocumentoService } from './service/documento.service';
import { DetalleService } from './service/detalle.service';
import { HistorialComponent } from './historial/historial.component';
import { PantallaComponent } from './pantalla/pantalla.component';
import { ImpresionComponent } from './impresion/impresion.component';
import { ROUTES } from './app.router';
import {HttpModule} from '@angular/http';

@NgModule({
  declarations: [
    AppComponent,
    PdfComponent,
    HistorialComponent,
    PantallaComponent,
    ImpresionComponent,

  ],
  imports: [
    BrowserModule,
    ROUTES,
    HttpModule
  ],
  providers: [DocumentoService,
              DetalleService],
  bootstrap: [AppComponent]
})
export class AppModule { }
