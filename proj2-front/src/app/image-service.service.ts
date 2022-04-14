// import { Injectable } from '@angular/core';
// import { HttpClient, HttpHeaders } from '@angular/common/http';
// import { from, Observable } from 'rxjs';
// import { Image } from './image';
// import { Byte } from '@angular/compiler/src/util';

// @Injectable()
// export class ImageServiceService {

//   private imageUrl: string;

//   constructor(private http: HttpClient) { 

//     this.imageUrl = 'http://localhost:8095/get/image/';

//   }

//   public getImage(imageName: string) {

//     return this.http.get<Image>(this.imageUrl + imageName);

//   }

//   public saveImage(image: Image) {

//     return this.http.post<Image>('http://localhost:8095/upload/image', + image );

//   }

// }
