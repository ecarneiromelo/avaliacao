import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {MovimentosManuaisListComponent} from './movimentos-manuais-list/movimentos-manuais-list.component';
import {TableModule} from 'primeng/table';
import {BrowserModule} from '@angular/platform-browser';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {MovimentosManuaisFormComponent} from './movimentos-manuais-form/movimentos-manuais-form.component';

import {InputTextModule} from 'primeng/inputtext';
import {ButtonModule} from 'primeng/button';
import {CheckboxModule} from 'primeng/checkbox';
import {RadioButtonModule} from 'primeng/radiobutton';
import {DropdownModule} from 'primeng/dropdown';
import {InputTextareaModule} from 'primeng/inputtextarea';
import {ToolbarModule} from 'primeng/toolbar';
import {FieldsetModule} from 'primeng/fieldset';
import {InputMaskModule} from 'primeng/inputmask';
import {MessagesModule} from 'primeng/messages';
import {MessageModule} from 'primeng/message';
import { CurrencyMaskModule } from 'ng2-currency-mask';
import { MovimentosManuaisComponent } from './movimentos-manuais.component';

@NgModule({
  declarations: [
    MovimentosManuaisListComponent,
    MovimentosManuaisFormComponent,
    MovimentosManuaisComponent,
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
    BrowserModule,
    BrowserAnimationsModule,
    FormsModule,
    TableModule,
    HttpClientModule,
    InputTextModule,
    InputTextareaModule,
    RadioButtonModule,
    ButtonModule,
    ToolbarModule,
    FormsModule,
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    FieldsetModule,
    InputMaskModule,
    MessagesModule,
    MessageModule,
    CurrencyMaskModule,
    
  ], exports: [
    MovimentosManuaisListComponent,
    MovimentosManuaisFormComponent,
    MovimentosManuaisComponent,
  ]
})
export class MovimentosManuaisModule {
}
