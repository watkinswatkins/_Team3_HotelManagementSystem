

export class BlockModel {

  roomid?:number;
  blockNumber?:String;
  inmateId?:number;

  constructor(inmateId: number, blockNumber: String, roomid: number) {
    this.inmateId = inmateId;
    this.blockNumber = blockNumber;
    this.roomid = roomid;
    
  }
}

