import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class NasaService {
  private apiUrl = 'http://localhost:8080/apod/random';

  constructor(private http: HttpClient) {}

  getRandomAPOD(): Observable<any> {
    return this.http.get<any>(this.apiUrl);
  }
}
