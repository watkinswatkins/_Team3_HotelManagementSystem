import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { InmateService } from '../inmate-service.service';
import { Inmate } from '../inmate';

@Component({
  selector: 'app-inmate-search',
  templateUrl: './inmate-search.component.html',
  styleUrls: ['./inmate-search.component.css']
})
export class InmateSearchComponent implements OnInit {

public inmates!: Inmate[];
public updateInmate: Inmate;
public deleteInmate: Inmate;

  constructor( private inmateService: InmateService, 
    private route: ActivatedRoute,
    private router: Router) { 

      this.updateInmate={
        id:0,
        roomId:0,
        firstName:"",
        lastName:"",
        charge:"",
        notes:"",
        startDate:new Date,
        endDate:new Date,
        month:0,
        years:0
     }
     this.deleteInmate={
      id:0,
      roomId:0,
      firstName:"",
      lastName:"",
      charge:"",
      notes:"",
      startDate: new Date,
      endDate:new Date,
      month:0,
      years:0
     }

    }

  ngOnInit() {
  //   this.inmates = this.inmateService.findById();

  }
  public searchInmate(key: number): void {
    console.log(key);
    const results: Inmate[] = [];
    for (const inmate of this.inmates) {
      if (inmate.id.indexOf(key.toLowerCase()) !== -1
 {
        results.push(inmate);
      }
    }
    this.inmates = results;
    if (results.length === 0 || !key) {
      this.getInmates();
    }
  }

  public onUpdateInmate (inmate: Inmate): void {
    console.log(inmate)
    inmate.roomId = this.updateInmate.roomId;
    inmate.endDate = this.updateInmate.endDate;
    console.log(inmate)

      }
      // (error: HttpErrorResponse) => {
      //   alert(error.message);
      // }
    
  }

