import {ModuleWithProviders} from '@angular/core';
import {Routes,RouterModule} from '@angular/router';
import{AppComponent} from './app.component';
import { HistorialComponent } from './historial/historial.component';
import { ImpresionComponent } from './impresion/impresion.component';
import { PantallaComponent } from './pantalla/pantalla.component';



export const ROUTER: Routes= [{path:'', redirectTo:'historial', pathMatch:'full'},
{path:'historial', component:HistorialComponent},
{path:'impresion', component:ImpresionComponent},
{path:'pantalla', component:PantallaComponent}
]

export const ROUTES:ModuleWithProviders=RouterModule.forRoot(ROUTER);