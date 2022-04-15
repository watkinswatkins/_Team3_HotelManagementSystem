import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Inmate } from '../app/inmate';
import { from, Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class InmateServiceService {
  private inmatesUrl: string;
  private roomInmatesUrl: string;

  
  constructor(private http: HttpClient) { 

    this.inmatesUrl = 'http://localhost:8095/inmates/';
    this.roomInmatesUrl = 'http://localhost:8095/inmates/findByRoom/';
    
  }
  public findAll(): Observable<Inmate[]>{
    return this.http.get<Inmate[]>(this.inmatesUrl);
  }

  public saveInmate(inmate: Inmate) {
    return this.http.post<Inmate>(this.inmatesUrl, inmate);
  }
  
  public updateInmate(inmate: Inmate) {
    return this.http.put<Inmate>(this.inmatesUrl, inmate);
  }

  public findById(id: number) {
     return this.http.get<Inmate>(`${this.inmatesUrl}/${id}`)
  
   }

 public fingByRoom(room: number){
  return this.http.get<Inmate>(`${this.roomInmatesUrl}/${room}`);
 }

  public deleteInmate(id: number) {
  return this.http.delete<Inmate>(`${this.inmatesUrl}/${id}`)
  
   }
}
