/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import Controller.Database.Database;
import java.sql.Blob;

/**
 *
 * @author gopi
 */
public class PeopleDetails {
    int DisasterID;
     int PersonID;
    String PersonName;
    int Age;
    String Sex;
    int AliveStatus;
    String RescueLocation;
    String PresentLocation;
    String image;
    String ContactNumber;
    public PeopleDetails(){
        DisasterID=-1;
            //    =PersonID;
        PersonName="";
          Age=-1;
        AliveStatus=-1;
        RescueLocation
                =PresentLocation
                =image
                =ContactNumber;
    }
    public PeopleDetails(int Did,String name,int age,String sex,int LifeStatus,String LocationRescued,String LocationAtPresent,String MobileNumber){
        DisasterID=Did;
        
        PersonName=name;
        Age=age;
        Sex=sex;
        AliveStatus=LifeStatus;
        RescueLocation=LocationRescued;
        PresentLocation=LocationAtPresent;
        ContactNumber=MobileNumber;
        
    }
    
    public int getDisasterID(){
        return DisasterID;
    }
    public String getPersonName(){
        return PersonName;
    }
    public int getAge(){
        return Age;
    }
    public String getSex(){
        return Sex;
    }
    public int getAliveStatus(){
        return AliveStatus;
    }
    public String getResucuedLocation(){
        return RescueLocation;
    }
    public String getPresentLocation(){
        return PresentLocation;
    }
    public String getMobile(){
        return ContactNumber;
    }
}
