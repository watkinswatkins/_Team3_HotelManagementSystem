
export class Inmate {

id?:number;
roomId?:number;
firstName?:String;
lastName?:String;
charge?:String;
notes?:String;
startDate?:Date;
endDate?:Date;
month?:number;
years?:number;

constructor(id: number, roomId: number, firstName: String, lastName: String, 
    charge: String, notes: String, startDate: Date, endDate: Date, month: number, 
    years: number){

        this.id = id;
        this.roomId = roomId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.charge = charge;
        this.notes = notes;
        this.startDate = startDate;
        this.endDate = endDate;
        this.month = month;
        this.years = years;
        
    }
}