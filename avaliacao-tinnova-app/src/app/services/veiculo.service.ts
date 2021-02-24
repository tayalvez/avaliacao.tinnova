import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class VeiculoService {

  private baseUrl = 'http://localhost:8080/api';

  constructor(private http: HttpClient) { }

  getVeiculo(id: number): Observable<Object> {
    return this.http.get(`${this.baseUrl}/${id}`);
  }

  createVeiculo(veiculo: Object): Observable<Object> {
    const url = this.baseUrl + "/saveVeiculo";
    console.log(veiculo);
    return this.http.post(`${url}`, veiculo);
  }

  updateVeiculo(id: number, value: any): Observable<Object> {
    return this.http.put(`${this.baseUrl}/${id}`, value);
  }

  deleteVeiculo(id: number): Observable<any> {
    const url = this.baseUrl + "/deletarVeiculo";
    return this.http.delete(`${url}/${id}`, { responseType: 'text' });
  }

  getVeiculosList(): Observable<any> {
    const url = this.baseUrl + "/veiculos";
    return this.http.get(`${url}`);
  }
}
