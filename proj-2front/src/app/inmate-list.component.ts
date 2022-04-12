import { Component, OnInit } from '@angular/core';
import { Inmate } from '../inmate';
import { InmateService } from '../inmate-service.service';

@Component({
  selector: 'app-inmate-list',
  templateUrl: './inmate-list.component.html',
  styleUrls: ['./inmate-list.component.css']
})
export class InmateListComponent implements OnInit {

inmate?: Inmate[];

  constructor(private inmateService: InmateService) { 

  }

  ngOnInit() {
    this.inmateService.findAll().subscribe(data => {
      this.inmate = data;
    })
  }

}
