

export class User{

    id?:number;
    username?:string;
    password?:string;
    firstName?:string;
    lastName?:string;
    // role?:Role;
  isWarden: any;

    constructor(id: number, username: string, password: string, 
        firstName: string, lastName: string, role:Role){

            this.id = id;
            this.username = username;
            this.password = password;
            this.firstName = firstName;
            this.lastName = lastName;
            this.role = role;
            //should we have isWarden as a boolean? instead of role?
            
        }

}