import {Class, Component, Inject, Injectable, NgZone} from "@angular/core";
import {Http,Response,Headers,RequestOptions,HttpModule} from '@angular/http';
import { Documento } from '../model/Documento';
import {Observable} from 'rxjs/Observable';

import 'rxjs/add/operator/map';
import 'rxjs/add/operator/first';
import 'rxjs/add/operator/catch';

@Injectable()
export class DocumentoService {
  
    private url='http://192.168.0.21:8080/documento';
    private headers= new Headers({'Content-type':'application/json'});
       constructor(private http:Http,private zone: NgZone) { }
 
         getAll():Observable<Documento[]>{
         let url= `${this.url}`
         return this.http.get(url).map(r=> r.json());}
 
         delete(documento:Documento){
           let url= `${this.url}`+"/"+documento.id;
           return this.http.delete(url);
           }


}
