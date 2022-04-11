import { Component, OnInit } from '@angular/core';
import { Inmate } from '../Models/inmate-model/inmate.model';

import { InmateService } from '../Services/inmate.service';
import { Pending } from '../Models/pending-model/pending.model';
import { PendingService } from '../Services/pending.service';
import { BlockModel } from '../Models/block-model/block.model';
import { BlockService } from '../Services/block.service';
import { ActivatedRoute, Router } from '@angular/router';
import { User } from '../Models/user-model/user.model';
import { HttpErrorResponse } from '@angular/common/http';
import { NgForm } from '@angular/forms';


@Component({
  selector: 'app-warden',
  templateUrl: './warden.component.html',
  styleUrls: ['./warden.component.css']
})
export class WardenComponent implements OnInit {

  public inmates!: Inmate[];
  public editInmate: Inmate;
  public user!: User;

  constructor(private blockService: BlockService, 
    private InmateService: InmateService, 
    private pending: PendingService,
    private route: ActivatedRoute,
    private router: Router) { 

      this.editInmate={
        id: 0,
        roomId: 0,
        firstName:"",
        lastName:"",
        charge: "",
        notes: "",
        startDate: new Date,
        endDate: new Date,
        month: 0,
        years: 0 
      }

      ngOnInit(): void {
        this.getInmates();
      }
    }
  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }

    public getInmates(): void{
      this.InmateService.getInmates().subscribe(
        (response: Inmate[]) => {
          this.inmates= response;
        },
        (error: HttpErrorResponse) => {
          alert(error.message);
        }
      )
    }

    public onAddInmate (addForm: NgForm): void {
      // document.getElementById('add-student-form').click();
      this.InmateService.addInmate(addForm.value).subscribe(
        (response: Inmate) => {
          console.log(response);
          this.getInmates();
          addForm.reset();
        },
        (error: HttpErrorResponse) => {
          alert(error.message);
          addForm.reset();
        }
      );
    }
    public onUpdateInmate (inmate: Inmate): void {
      console.log(inmate)
      inmate.roomId = this.editInmate.roomId;
      inmate.endDate = this.editInmate.endDate;
      console.log(inmate)
      this.InmateService.updateInmate(inmate, this.editInmate.id).subscribe(
        (response: Inmate) => {
          console.log(response);
          this.getInmates();
        },
        (error: HttpErrorResponse) => {
          alert(error.message);
        }
      );
    }
}
