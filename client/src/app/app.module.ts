import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AccordionModule } from 'primeng/accordion';
import { MovimentosManuaisModule } from './movimentos-manuais/movimentos-manuais.module';


@NgModule({
  declarations: [
    AppComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    AccordionModule,
    MovimentosManuaisModule,

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
