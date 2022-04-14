import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Login } from '../login';
import { LoginServiceService } from '../login-service.service';
import { User } from '../user';

@Component({
  selector: 'app-login-form',
  templateUrl: './login-form.component.html',
  styleUrls: ['./login-form.component.css']
})
export class LoginFormComponent implements OnInit {

  login: Login;


  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private loginService: LoginServiceService

  ) { this.login = new Login(); }

  ngOnInit(): void {
    
    this.router.navigate(['/login']);

  }

  onLogin() {

    this.loginService.checkLogin(this.login).subscribe(result => this.gotoPage());

  }

  gotoPage() {

    this.router.navigate(['/user'])

  }

  

}
