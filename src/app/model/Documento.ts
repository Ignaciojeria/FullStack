import { Detalle } from "./Detalle";

export class Documento{
   
    constructor(public detalles:Detalle[],
                public id:number,
                public fecha:Date,
                public folio:number,
                public nombre_contacto:string,
                public total:number){}
}