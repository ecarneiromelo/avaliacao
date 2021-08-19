import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-movimentos-manuais-form',
  templateUrl: './movimentos-manuais-form.component.html',
  styleUrls: ['./movimentos-manuais-form.component.css']
})
export class MovimentosManuaisFormComponent implements OnInit {

  constructor() { }
  selectedState: any = null;

  states: any[] = [
      {name: 'Arizona', code: 'Arizona'},
      {name: 'California', value: 'California'},
      {name: 'Florida', code: 'Florida'},
      {name: 'Ohio', code: 'Ohio'},
      {name: 'Washington', code: 'Washington'}
  ];

  cities1: any[] = [];
  
  cities2: any[] = [];
  
  city1:any = null;

  city2:any = null;

  ngOnInit(): void {
  }

}
