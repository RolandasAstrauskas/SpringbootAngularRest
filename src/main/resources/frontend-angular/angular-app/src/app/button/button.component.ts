import { Component, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-button',
  templateUrl: 'button.html',
  styleUrls: ['button-style.css']
})
export class ButtonComponent {

inputData = '';
data = '';

@Output() event = new EventEmitter<string>()

  getEventHandler(){
   this.data = this.inputData;
    this.event.emit(this.data);
  }

  onClickUpdateTable(event){
     this.inputData = event.target.value;
  }
 }
