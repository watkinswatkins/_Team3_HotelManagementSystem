import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { from, Observable } from 'rxjs';
import { Block } from './block';

@Injectable()
export class BlockServiceService {

  private blockUrl: string; 
  private roomUrl: string;

  constructor(private http: HttpClient) {
    this.blockUrl = 'http://localhost:8095/blocks';
    this.roomUrl = 'http://localhost:8095/blocks/block/';
  }

   public findAll(): Observable<Block[]> {

    return this.http.get<Block[]>(this.blockUrl);

   }

   public byBlock(block: string) {

    return this.http.get<Block>(`${this.roomUrl}/${block}`);
   
  }

  public updateBlock(block: Block) {

    return this.http.put<Block>('http://localhost:8095/blocks/updateBlock', block);

  }

}
