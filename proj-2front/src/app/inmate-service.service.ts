import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';
import { Inmate } from '../app/inmate';
@Injectable(
    // {providedIn: 'root'}
)
export class InmateService {
//   apiServerUrl: any;
    private inmatesUrl: string;
  constructor(private http: HttpClient) {
      this.inmatesUrl = 'http://localhost:8095/inmates'
  }
  //all inmates
  public findAll(): Observable<Inmate[]>
  {
    return this.http.get<Inmate[]>(this.inmatesUrl);
  }
    //inmate by ID
    public findById(inmateId: Inmate): Observable<Inmate>
    {
      return this.http.get<Inmate>('http://localhost:8095/inmates/${id}');
    }
  //inmate by room
  public findByRoom(room: number)
  {
    return this.http.get<Inmate>('http://localhost:8095/inmates/findByRoom/${room}');
  }
//update inmate
  public updateInmate(inmate: Inmate, inmateId: Inmate)
  {
    return this.http.post<Inmate>('http://localhost:8095/inmates/updateInmate', inmate);
  }
    //create inmate
    public createInmate(inmate: Inmate): Observable<Inmate>
    {
      return this.http.post<Inmate>('http://localhost:8095/inmates/createInmate', inmate);
    }
  //delete inmate
  public deleteInmate(inmateId: number){
    return this.http.delete<void>('http://localhost:8095/inmate/delete/${inmateId}');
  }
}