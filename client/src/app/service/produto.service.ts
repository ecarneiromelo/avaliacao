import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from '../../environments/environment';
import { MovimentoManual } from '../model/movimento-manual';

@Injectable({
  providedIn: 'root'
})
export class MovimentosManuaisService {

  private movimentosManuaisUrl: string;

  constructor(private http: HttpClient) {
    this.movimentosManuaisUrl = environment.url + 'produto';
  }

  public findAll(): Observable<MovimentoManual[]> {
    return this.http.get<MovimentoManual[]>(this.movimentosManuaisUrl);
  }

  public save(movimentoManual: MovimentoManual) {
    return this.http.post<MovimentoManual>(this.movimentosManuaisUrl, movimentoManual);
  }

  public update(movimentoManual: MovimentoManual, idMovimento: number) {
    return this.http.put<MovimentoManual>(this.movimentosManuaisUrl+'/'+ idMovimento , movimentoManual);
  }
}
