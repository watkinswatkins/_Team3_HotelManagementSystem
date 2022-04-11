import { Byte } from "@angular/compiler/src/util";
aa
export class ImageModel {
    
id?: number;
name?: string;
type?: string;
image?: Byte;

constructor(id: number, name: string, type: string, image: Byte) {
    this.id = id;
    this.name = name;
    this.type = type;
    this.image = image;
}

}