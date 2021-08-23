
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, ValidationErrors, Validators } from '@angular/forms';
import { Message, MessageService, SelectItem } from 'primeng/api';
import { MovimentoManual } from 'src/app/model/movimento-manual';
import { CosifService } from 'src/app/service/cosif.service';
import { MovimentosManuaisService } from 'src/app/service/movimentos-manuais.service';
import { ProdutoService } from 'src/app/service/produto.service';

@Component({
  selector: 'app-movimentos-manuais-form',
  templateUrl: './movimentos-manuais-form.component.html',
  styleUrls: ['./movimentos-manuais-form.component.css']
})
export class MovimentosManuaisFormComponent implements OnInit {

  // cosifService:CosifService;
  // produtoService: ProdutoService;
  // movimentoManualService: MovimentosManuaisService;
  resourceForm: FormGroup;
  selectedProduto: SelectItem[];
  selectedCosif: SelectItem[];
  listMessage: Message[] = [];
  

  constructor(
            private cosifService:CosifService,
            private produtoService: ProdutoService,
            private movimentoManualService: MovimentosManuaisService,
            private formBuilder: FormBuilder,
            private messageService: MessageService) { 
        this.cosifService = cosifService;
        this.produtoService = produtoService;
        this.movimentoManualService = movimentoManualService;
      }


  ngOnInit(): void {
    this.loadSelectItens();
    this.createMovimentoManualForm();
    this.onChangeValues();
  
  }

  async loadSelectItens(){
    await this.produtoService.findAll()
          .then(value =>{
            this.selectedProduto = this.toSelectItem('value',(item) => item['label'], value);
          });
  }

  private onChangeValues() {
    this.resourceForm.get('idProduto').valueChanges.subscribe(async produto => {
      if(produto){
        this.buscarCosif(produto);
      }
      this.resourceForm.get('idCosif').setValue(null);
    });
  }

  private createMovimentoManualForm() {
    this.resourceForm = this.formBuilder.group({
      id: [null],
      mes: [null,[Validators.required, Validators.max(12),Validators.min(1)]],
      ano: [null,[Validators.required, Validators.max(9999),Validators.min(1)]],
      idCosif:[null,[Validators.required]],
      descricao:[null,[Validators.required]],
      valor:[null,[Validators.required]],
      idProduto: [null,[Validators.required]],
    });
  }

  async buscarCosif(produto: string){
    this.cosifService.findAll(produto)
      .then(value => this.selectedCosif = this.toSelectItem('value',(item) => item['label'], value));
  }

  toSelectItem(valueProp: string, getLabel: (item: any) => string, array: any[]) {
    return array.map(a => {
        return {
            value: a[valueProp],
            label: getLabel(a)
        };
    });
  }

  

  private async salvarConteudo() {

    await this.movimentoManualService.save(this.getConteudoDTO()).toPromise();
  }

  private getConteudoDTO(): MovimentoManual {
    const movimentoManualForm = this.resourceForm.getRawValue() as MovimentoManual ;
    return {
      mes: movimentoManualForm.mes,
      ano: movimentoManualForm.ano,
      idProduto: movimentoManualForm.idProduto,
      idCosif: movimentoManualForm.idCosif,
      descricao:movimentoManualForm.descricao,
      valor:movimentoManualForm.valor
    };
  }

  private addMessageError(message :string): Message {
    return { severity:'error', summary:'Campo Obrigatório !', detail: message} ;
  }

  getFormValidationErrors() {
    Object.keys(this.resourceForm.controls).forEach(key => {
      const controlErrors: ValidationErrors = this.resourceForm.get(key).errors;
      if (controlErrors != null) {
          Object.keys(controlErrors).forEach(keyError => {
            if('required' === keyError){
              this.addMessageError('É obrigatório o preenchimendo do campo.');
            }else {
              this.addMessageError('O campo está obrigatório o preenchimendo do campo.');
            }
            console.log('Key control: ' + key + ', keyError: ' + keyError + ', err value: ', controlErrors[keyError]);
          });
        }
      });
    }


  async salvar() {
    if (this.resourceForm.invalid) {
      this.messageService.add(this.addMessageError('Campo inválido !'));
      this.getFormValidationErrors();
    } else {
      this.salvarConteudo();
    }
  }

  public limpar(){
    this.createMovimentoManualForm();
  } 

}
