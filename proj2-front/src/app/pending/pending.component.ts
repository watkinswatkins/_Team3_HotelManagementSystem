import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Pending } from '../pending';
import { PendingServiceService } from '../pending-service.service';

@Component({
  selector: 'app-pending',
  templateUrl: './pending.component.html',
  styleUrls: ['./pending.component.css']
})
export class PendingComponent implements OnInit {

  pending: Pending;
  status!: string;

  constructor(
    private route: ActivatedRoute, 
    private router: Router, 
    private pendingService: PendingServiceService
  ) { this.pending = new Pending(); }

  ngOnInit(): void {

    this.router.navigate(['/pending']);

  }

  onStatus() {

    this.pendingService.findStatus(this.status).subscribe((data: Pending) => {
      this.pending = data;

    })

  }

  addPending() {

    this.pendingService.addPending(this.pending).subscribe(result => 
      this.gottoPending());
  }

  gottoPending() {

    this.router.navigate(['/pending']);

  }

}
