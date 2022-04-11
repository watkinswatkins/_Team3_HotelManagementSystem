import { CreateTracingOptions } from "trace_events";
aa

export class Pending{

    id?:number;
    roomId?:number;
    firstName?:string;
    lastName?:string;
    charge?:string;
    status?:String;
    startDate?:Date;
    endDate?:Date;
    month?:number;
    years?:number;

    constructor(id: number, roomId: number, firstName: string, lastName: string, 
        charge: string, status: String, startDate: Date, endDate: Date, month: number, 
        years: number){

            this.id = id;
            this.roomId = roomId;
            this.firstName = firstName;
            this.lastName = lastName;
            this.charge = charge;
            this.status = status;
            this.startDate = startDate;
            this.endDate = endDate;
            this.month = month;
            this.years = years;
        }
}