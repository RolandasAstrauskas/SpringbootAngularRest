
export class Client
{
    clientId:string;
    firstLastname:string;
    dateOfBirth:string;
    gender:string;

    constructor(clientId,firstLastname, dateOfBirth, gender)
    {
        this.clientId = clientId;
        this.firstLastname = firstLastname;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }
}
