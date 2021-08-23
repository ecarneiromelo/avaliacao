import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { SelectItem } from 'primeng/api';
import { Observable } from 'rxjs';
import { environment } from '../../environments/environment';
import { ProdutoCosif } from '../model/produto-cosif';

@Injectable({
  providedIn: 'root'
})
export class CosifService {

  private cosifUrl: string;

  constructor(private http: HttpClient) {
    this.cosifUrl = environment.url + 'cosif';
  }

  public findAll(idProduto: string): Promise<any> {
    return this.http.get<any>(`${this.cosifUrl}/produto/${idProduto}`).toPromise();
  }
}
