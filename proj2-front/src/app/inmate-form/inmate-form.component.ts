import { Byte } from '@angular/compiler/src/util';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import{Inmate} from '../inmate';
import{InmateServiceService} from '../inmate-service.service';

@Component({
  selector: 'app-inmate-form',
  templateUrl: './inmate-form.component.html',
  styleUrls: ['./inmate-form.component.css']
})
export class InmateFormComponent implements OnInit {

  constructor(private route: ActivatedRoute,
    private router: Router
    
    ) { }

  ngOnInit(): void {
  }

}
