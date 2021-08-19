import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {MovimentosManuaisListComponent} from './movimentos-manuais-list/movimentos-manuais-list.component';
import {TableModule} from 'primeng/table';
import {BrowserModule} from '@angular/platform-browser';
import {FormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {MovimentosManuaisCreateComponent} from './movimentos-manuais-create/movimentos-manuais-create.component';
import {MovimentosManuaisFormComponent} from './movimentos-manuais-form/movimentos-manuais-form.component';

import {InputTextModule} from 'primeng/inputtext';
import {ButtonModule} from 'primeng/button';
import {CheckboxModule} from 'primeng/checkbox';
import {RadioButtonModule} from 'primeng/radiobutton';
import {DropdownModule} from 'primeng/dropdown';
import {InputTextareaModule} from 'primeng/inputtextarea';

@NgModule({
  declarations: [
    MovimentosManuaisListComponent,
    MovimentosManuaisCreateComponent,
    MovimentosManuaisFormComponent
  ],
  imports: [
    CommonModule,
    TableModule,
    BrowserModule,
    BrowserAnimationsModule,
    HttpClientModule,
    FormsModule,
    BrowserModule,
    BrowserAnimationsModule,
    InputTextModule,
    CheckboxModule,
    ButtonModule,
    RadioButtonModule,
    InputTextareaModule,
    DropdownModule,

  ], exports: [
    MovimentosManuaisListComponent,
    MovimentosManuaisFormComponent
  ]
})
export class MovimentosManuaisModule {
}
