import { Component, OnInit } from '@angular/core';
import { BlockModel } from 'src/app/Models/block-model/block.model';
aa

@Component({
  selector: 'app-block',
  templateUrl: './block.component.html',
  styleUrls: ['./block.component.css']
})
export class BlockComponent implements OnInit {

  block : BlockModel = {
    roomid: 1,
    blockNumber: "",
    inmateId: 40
  };

  constructor() { }

  ngOnInit(): void {
  }

}
