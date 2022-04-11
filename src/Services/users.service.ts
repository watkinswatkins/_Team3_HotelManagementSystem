import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { catchError, Observable, of } from 'rxjs';
import { Router } from '@angular/router';
import { User } from '../Models/user-model/user.model';
const baseUrl = 'http://localhost:4200/users';


@Injectable({
  providedIn: 'root'
})
export class UsersService {
  user?: User;
  login(username: string, password: string) {
    throw new Error('Method not implemented.');
  }

  constructor(
    private https: HttpClient,
    private route: Router
      
    
  ) { }

  getAll(): Observable<User[]> {
    return this.https.get<User[]>("http://localhost:4200/users");
  }

//role???

registerUser(data: FormData): Observable<User>{ 
  return this.https.post<User>("http://localhost:4200/adduser", data).pipe(
    catchError(this.handleError<User>('register')) 
  );
}
private handleError<T>(operation = 'operation', result?: T) {
  return (error: any): Observable<T> => {

    // TODO: send the error to remote logging infrastructure
    console.error(error); // log to console instead

    // Let the app keep running by returning an empty result.
    return of(result as T);
  };
}
}
