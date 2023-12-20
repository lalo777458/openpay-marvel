import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class MarvelService {

  private urlEndPoint: string = 'http://localhost:8082/openpay';


  constructor(private http: HttpClient) { }

  getCharacters(): Observable<any> {
    return this.http.get<any>(this.urlEndPoint);
  }

  getCharactersById(id: number): Observable<any> {
    return this.http.get<any>(this.urlEndPoint + "/" + id);
  }

}
