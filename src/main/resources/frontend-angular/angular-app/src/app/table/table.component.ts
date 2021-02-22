import { Component, OnInit, Input, OnChanges  } from '@angular/core';
import { AppComponent } from '../app.component';
import { Client } from '../client/client';

@Component({
  selector:'app-table',
  templateUrl: 'table.html',
  styleUrls: ['table-style.css'],
})
export class TableComponent implements OnChanges{

  @Input()  data;
  @Input() dataId;
  clients: Client[] = [];

  constructor(private rs: AppComponent){}

  columns = ["ID.", "Name, lastname", "Date of Birth", "Gender"];
  index = ["clientId","firstLastname", "dateOfBirth", "gender"];

   ngOnChanges(){
   if(this.dataId.length == 11){
   this.refreshId()}
   else{this.refresh()}
         }

  refresh() {
  this.rs.getUsers().subscribe(
  (response) => {this.clients = response;}
 )}

   refreshId() {
   this.rs.getUsersId().subscribe(
   (response) => {this.clients = response;}
  )}

}
