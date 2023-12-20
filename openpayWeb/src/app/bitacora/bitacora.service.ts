import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Bitacora } from '../interfaces/bitacora';

@Injectable({
  providedIn: 'root'
})
export class BitacoraService {
  private urlEndPoint: string = 'http://localhost:8082/openpay/bitacora';


  constructor(private http: HttpClient) { }

  getBitacora():Observable<Bitacora[]>{
    return this.http.get<any>(this.urlEndPoint);
  }
}
