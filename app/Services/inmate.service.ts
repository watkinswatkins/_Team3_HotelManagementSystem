import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';
import { Inmate } from '../Models/inmate-model/inmate.model';
aa


@Injectable({
  providedIn: 'root'
})
export class InmateService {
  apiServerUrl: any;

  constructor(private http: HttpClient) { }

  //all inmates
  public getInmates(): Observable<Inmate[]>
  {
    return this.http.get<Inmate[]>(`${this.apiServerUrl}/inmate`);
  }
  //inmate by room
  public getInmateByRoomId(roomId: string)
  {
    return this.http.get<Inmate>(`${this.apiServerUrl}/inmate/roomId/${roomId}`);
  }
  //inmate by ID
  public getInmate(inmateId: Number): Observable<Inmate>
  {
    return this.http.get<Inmate>(`${this.apiServerUrl}/inmate/${inmateId}`)
  }
  //add inmate
  public addInmate(inmate: Inmate): Observable<Inmate>
  {
    return this.http.post<Inmate>(`${this.apiServerUrl}/inmate/add`, inmate)
  }
//update inmate
  public updateInmate(inmate: Inmate, inmateId: Number)
  {
    return this.http.post<Inmate>(`${this.apiServerUrl}/inmate/${inmateId}`, inmate)
  }

  // public deleteInmate(inmateId: number){
  //   return this.http.delete<void>(`${this.apiServerUrl}/inmate/delete/${inmateId}`)
  // }

 
}
