import { Component, ɵAPP_ID_RANDOM_PROVIDER } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Inmate } from '../inmate';
import { InmateService } from '../inmate-service.service';
import { DatePipe } from '@angular/common';

@Component({
  selector: 'app-inmate-update',
  templateUrl: './inmate-update.component.html',
  styleUrls: ['./inmate-update.component.css']
})
export class InmateUpdateComponent {

  public inmate: Inmate;
  constructor(private inmateService: InmateService,
    private route: ActivatedRoute,
    private router: Router) {
  // inmate: Inmate;
  this.inmate={
    id:0,
    roomId:0,
    firstName:"",
    lastName:"",
    charge:"",
    notes:"",
    startDate: ,
    endDate: ,
    month: 0,
    years: 0
  }
  
}



    onSubmit() {
      this.inmateService.createInmate(this.inmate).subscribe(result => this.gotoInmatesList());
    }

    gotoInmatesList() {
      this.router.navigate(['inmates']);

    }


}
