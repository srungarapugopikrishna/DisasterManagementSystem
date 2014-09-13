/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

/**
 *
 * @author gopi
 */
public class PeopleDetails {
    int DisasterID;
    int PersonID;
    String PersonName;
    String DOB;
    int AliveStatus;
    String RescueLocation;
    String PresentLocation;
    int ContactNumber;
    public PeopleDetails(){
        DisasterID
                =PersonID;
        PersonName
                =DOB;
        AliveStatus=-1;
        RescueLocation
                =PresentLocation;
        ContactNumber=-1;
    }
    public PeopleDetails(int Did,int Pid,String name,String bday,int LifeStatus,String LocationRescued,String LocationAtPresent,int MobileNumber){
        DisasterID=Did;
        PersonID=Pid;
        PersonName=name;
        DOB=bday;
        AliveStatus=LifeStatus;
        RescueLocation=LocationRescued;
        PresentLocation=LocationAtPresent;
        ContactNumber=MobileNumber;
    }
}
