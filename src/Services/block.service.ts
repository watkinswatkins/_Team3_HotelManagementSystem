import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { BlockModel } from '../Models/block-model/block.model';
const baseUrl = 'http://localhost:4200/block';

@Injectable({
  providedIn: 'root'
})
export class BlockService {

  constructor(private https: HttpClient) { }

  

}
