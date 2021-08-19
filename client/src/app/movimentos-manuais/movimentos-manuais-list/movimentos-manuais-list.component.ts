import { Component, OnInit } from '@angular/core';
import {MovimentoManual} from "../../model/movimento-manual";

@Component({
  selector: 'app-movimentos-manuais-list',
  templateUrl: './movimentos-manuais-list.component.html',
  styleUrls: ['./movimentos-manuais-list.component.css']
})
export class MovimentosManuaisListComponent implements OnInit {

  products:MovimentoManual[]=[];

  constructor() { }

  ngOnInit(): void {
  }

}
