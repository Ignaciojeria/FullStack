import { Injectable } from '@angular/core';
import {Http,Response,Headers,RequestOptions} from '@angular/http';
import {Observable} from 'rxjs/Observable';

import 'rxjs/add/operator/map';
import 'rxjs/add/operator/first';
import 'rxjs/add/operator/catch';
import { Detalle } from '../model/Detalle';


@Injectable()
export class DetalleService {

   private url='http://localhost:8080/detalle';
   private headers= new Headers({'Content-type':'application/json'});
      constructor(private http:Http) { }



        getAll():Observable<Detalle[]>{
        let url= `${this.url}`
        return this.http.get(url).map(r=> r.json());}

        delete(detalle:Detalle){
          let url= `${this.url}`+"/"+detalle.id;
          return this.http.delete(url);
          }

}
