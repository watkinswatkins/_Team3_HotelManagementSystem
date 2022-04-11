aa
//login, cache login, error for incorrect login
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserService } from 'src/app/Services/user.service';
import { User } from 'src/app/Models/user-model/user.model';


@Component({
  selector: 'app-warden-login',
  templateUrl: './warden-login.component.html',
  styleUrls: ['./warden-login.component.css']
})
export class LoginComponent implements OnInit {

  showMessage: boolean = false;
  showUsernameMessage: boolean = false;
  showPasswordMessage: boolean = false;
  username: string = '';
  password: string = '';

  constructor(private userService : UserService, private route : Router) { }

  ngOnInit(): void {}
  onSubmit() {
    this.showMessage = false;
    this.showUsernameMessage = false;
    this.showPasswordMessage = false;
    if (this.username === '') {
      this.showUsernameMessage = true;
    }
    if (this.password === '') {
      this.showPasswordMessage = true;
    }
    this.userService.login(this.username, this.password).subscribe(
      (obj: User) => {
        if(obj == null || obj == undefined) {
          this.showMessage = true;
        }else if(obj.isWarden){
          this.showMessage = false;
          this.userService.user = obj;
          this.route.navigate(['/warden']);
        } else {
          this.userService.user = obj;
          this.route.navigate(['/dashboard']);
        }
        return this.showMessage;
      }
    );
  }
}
