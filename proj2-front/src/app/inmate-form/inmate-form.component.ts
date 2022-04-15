import { Byte } from '@angular/compiler/src/util';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import{Inmate} from '../inmate';
import{InmateServiceService} from '../inmate-service.service';

@Component({
  selector: 'app-inmate-form',
  templateUrl: './inmate-form.component.html',
  styleUrls: ['./inmate-form.component.css']
})
export class InmateFormComponent implements OnInit {

  inmate!: Inmate;
  id!: number;
  room!: number;

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private inmateService: InmateServiceService)
     
    {this.inmate = new Inmate(); }


  // ngOnInit(): void {

  //   this.id = this.route.snapshot.params['id'];
  //   this.inmateService.findById(this.id).subscribe((data: Inmate) => {
  //   this.inmate = data;

  // });

  ngOnInit(): void {
    
    this.router.navigate(['/inmates']);

  }
  
  onSave() {

    this.inmateService.saveInmate(this.inmate).subscribe(result => 
      this.gotoInmateList());

  }

  onUpdate() {

    this.inmateService.updateInmate(this.inmate).subscribe(result => 
      this.gotoInmateList());

  }

  byId() {

    this.inmateService.findById(this.id).subscribe((data: Inmate) => {
      this.inmate = data;

    });
  }

  byRoom() {

    this.inmateService.fingByRoom(this.room).subscribe((data: Inmate) => {
      this.inmate = data;

    });
  }

  deleteInmate() {

    this.inmateService.deleteInmate(this.id).subscribe(result => 
      this.gotoInmateList());
  }

  gotoInmateList() {

    this.router.navigate(['/inmates']);

  }

}
