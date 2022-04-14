import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { from, Observable } from 'rxjs';
import { Login } from './login';

@Injectable()
export class LoginServiceService {

  private loginUrl: string;

  constructor(private http: HttpClient) {

    this.loginUrl = 'http://localhost:8095/users/login';

   }

   public checkLogin(login: Login){

    return this.http.post<Login>('http://localhost:8095/users/login', login);

   }
}
