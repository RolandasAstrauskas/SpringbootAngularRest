import { Component, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-buttonId',
  templateUrl: 'buttonId.html',
  styleUrls: ['buttonId-style.css']
})
export class ButtonIdComponent {

inputData = '';
dataId = '';

@Output() event = new EventEmitter<string>()

  getEventHandler(){
   this.dataId = this.inputData;
    this.event.emit(this.dataId);
  }

  onClickUpdateTable(event){
     this.inputData = event.target.value;
  }
 }
