import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Client } from './client/client';
import { Observable } from "rxjs";


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{

constructor(private http : HttpClient) { }

 data = "";
  receiveData($event){
  this.data = $event
  this.getUsers();
   console.log(this.data);
  }

  dataId = "";
    receiveDataId($even){
    this.dataId = $even
    this.getUsers();
     console.log(this.dataId);
    }

 ngOnInit(){
 }

     getUsers(): Observable<Client[]>
     { return this.http.get<Client[]>("http://localhost:8080/client/%7BdateOfBirth%7D?dateOfBirth=" + this.data);
     }

      getUsersId(): Observable<Client[]>
          { return this.http.get<Client[]>("http://localhost:8080/client/id/%7BclientId%7D?clientId=" + this.dataId);
          }
}
