import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { from, Observable } from 'rxjs';
import { Pending } from './pending';

@Injectable({
  providedIn: 'root'
})
export class PendingServiceService {

  private pendingUrl: string;
  private statusUrl: string;

  constructor(private http: HttpClient) {

    this.pendingUrl = 'http://localhost:8095/pending';
    this.statusUrl = 'http://localhost:8095/pending/status/';
   }

   public findAll(): Observable<Pending[]> {

    return this.http.get<Pending[]>(this.pendingUrl);

   }

   public findStatus(status: string) {

    return this.http.get<Pending>(`${this.statusUrl}/${status}`);
   
  }

  public addPending(pending: Pending) {

    return this.http.post<Pending>('http:localhost:8095/addPending', pending);

  }

}
