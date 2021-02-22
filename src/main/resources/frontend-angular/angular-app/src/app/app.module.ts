import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { MatTableModule } from '@angular/material/table';
import { HttpClientModule } from '@angular/common/http';

import { TableComponent } from './table/table.component';
import { ButtonComponent } from './button/button.component';
import { ButtonIdComponent } from './buttonId/buttonId.component';
import { AppComponent } from './app.component';


@NgModule({
  declarations: [
    AppComponent,
    TableComponent,
     ButtonComponent,
     ButtonIdComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    MatTableModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
