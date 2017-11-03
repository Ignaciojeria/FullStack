import { Documento } from "./Documento";


export class Detalle{
    constructor(public id:number,
                public documento:Documento,
                public unidadDeMedida:string,
                public precio:number,
                public cantidad:number,
                public subTotal:number,
                public descripcion:string){}
}