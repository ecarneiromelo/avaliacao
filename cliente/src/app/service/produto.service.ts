import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { SelectItem } from 'primeng/api';
import { Observable } from 'rxjs';
import { environment } from '../../environments/environment';
import { Produto } from '../model/produto';

@Injectable({
  providedIn: 'root'
})
export class ProdutoService {

  private produtoUrl: string;

  constructor(private http: HttpClient) {
    this.produtoUrl = environment.url + 'produto';
  }

  async findAll(): Promise<any> {
    return this.http.get<any>(this.produtoUrl).toPromise();
  }
}
