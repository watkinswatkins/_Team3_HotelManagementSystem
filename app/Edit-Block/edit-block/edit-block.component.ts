///this is for editing block assignments
import { Component, OnInit } from '@angular/core';
import { HttpErrorResponse } from '@angular/common/http';
import {FormControl, FormGroup, NgForm } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';
import { BlockModel } from 'src/app/Models/block-model/block.model';
import { BlockService } from 'src/app/Services/block.service';

@Component({
  selector: 'app-edit-block',
  templateUrl: './edit-block.component.html',
  styleUrls: ['./edit-block.component.css']
})
export class EditBlockComponent implements OnInit {

  public block: BlockModel;

  constructor(private blockService: BlockService,
    private route: ActivatedRoute,
    private router: Router) { 
      this.block={
        roomid:0,
        blockNumber:"",
        inmateId:0
      }
    }

  ngOnInit(): void {
  }


  
}
