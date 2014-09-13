/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import static Controller.Database.Database.getVolunteerCurrID;

/**
 *
 * @author gopi
 */
public class VolunteerDetails {
    int VolunteerID;
    String VolunteerName;
    String UserName;
    String Password;
    String VolunteerContact;
    String Address;
    public VolunteerDetails(){
        VolunteerID=-1;
        VolunteerName
                =UserName
                =Password;
        VolunteerContact="111";
    }
    public VolunteerDetails(int VolID,String VolName,String UName,String pwd,String VolunteerMobile,String addr){
        
        VolunteerID=getVolunteerCurrID();
        VolunteerName=VolName;
        UserName=UName;
        Password=pwd;
        VolunteerContact=VolunteerMobile;
        Address=addr;
    }
    
    public int getVolunteerID(){
        return VolunteerID;
    }
    public String getVolunteerName(){
        return VolunteerName;
    }
    public String getUserNameOfVolunteer(){
        return UserName;
    }
    public String getPassword(){
        return Password;
    }
    public String getVolunteerContact(){
        return VolunteerContact;
    }
    public String getVolunteerAddress(){
        return Address;
    }
}
