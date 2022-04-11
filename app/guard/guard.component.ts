aa
//guard homepage to view and edit inmates, to view and edit block assignments
import { Component, OnInit } from '@angular/core';
import { Inmate } from '../Models/inmate-model/inmate.model';
import { UserService } from '../Services/user.service';
import { FormBuilder } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';
import { Router } from '@angular/router';

@Component({
  selector: 'app-guard',
  templateUrl: './guard.component.html',
  styleUrls: ['./guard.component.css']
})
export class GuardComponent implements OnInit {

 
  constructor(

    private userService : UserService,
    private formBuilder: FormBuilder,
    private route : ActivatedRoute,
    private router: Router,

  
  ) { }

  ngOnInit(): void {
  }

}
