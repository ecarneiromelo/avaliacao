import { Component, OnInit } from '@angular/core';
import { MovimentosManuaisService } from 'src/app/service/movimentos-manuais.service';
import {MovimentoManual} from "../../model/movimento-manual";

@Component({
  selector: 'app-movimentos-manuais-list',
  templateUrl: './movimentos-manuais-list.component.html',
  styleUrls: ['./movimentos-manuais-list.component.css']
})
export class MovimentosManuaisListComponent implements OnInit {

  lstMovimentoManual:MovimentoManual[]=[];
  products=[];

  constructor(private movimentoManuaisService: MovimentosManuaisService) { }

  ngOnInit(): void {
    this.movimentoManuaisService.findAll().subscribe(res =>{ this.lstMovimentoManual = res});
  }

}
