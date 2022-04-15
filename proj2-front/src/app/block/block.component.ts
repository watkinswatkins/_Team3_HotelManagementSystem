import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Block } from '../block';
import { BlockServiceService } from '../block-service.service';

@Component({
  selector: 'app-block',
  templateUrl: './block.component.html',
  styleUrls: ['./block.component.css']
})
export class BlockComponent implements OnInit {

  blocks: Block[] = [];
  block: Block;

  constructor(
    private blockService: BlockServiceService,
    private router: Router,
    private route: ActivatedRoute
    ) {
      this.block = new Block();
     }

  ngOnInit(): void {
    this.blockService.findAll().subscribe((data: Block[]) => {
      this.blocks = data;
      console.log(this.blocks);
    })
  
  }

  byBlock(block: string) {

    return

  }

  updateBlock() {

    this.blockService.updateBlock(this.block).subscribe(result => this.gotoBlocks());

  }

  gotoBlocks() {

    this.router.navigate(['/blocks']);
    
  }

}
