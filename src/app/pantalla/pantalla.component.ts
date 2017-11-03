import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs/Observable';
import { Subscription } from 'rxjs/Subscription';
import { Http } from '@angular/http';

@Component({
  selector: 'app-pantalla',
  templateUrl: './pantalla.component.html',
  styleUrls: ['./pantalla.component.css']
})
export class PantallaComponent implements OnInit {

  title = 'app works!';
  event: Observable<number>;
  subscription: Subscription;
  constructor(
    private _http: Http
    ) {
  }
  ngOnInit() {
    this.subscription = this._http
      .get("http://localhost:8080/mono")
      .map(response => response.json())
      .subscribe(
        e => { 
          this.event = e;
          console.log(e);
        }
      );

  }
  ngOnDestroy() {
    this.subscription.unsubscribe();
  }

}
