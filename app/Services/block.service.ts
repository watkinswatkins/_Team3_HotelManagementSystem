import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { BlockModel } from '../Models/block-model/block.model';
const baseUrl = 'http://localhost:8095/blocks';

@Injectable({
  providedIn: 'root'
})
export class BlockService {
  apiServerUr: any;
aa
  constructor(private https: HttpClient) { }

  public getBlock(blockNumber: String): Observable<BlockModel>
  {
    return this.https.get<BlockModel>(http://localhost:8095/blocks/block/block);
  }

	
  
}
function http<T>(http: any): Observable<BlockModel> {
  throw new Error('Function not implemented.');
}

