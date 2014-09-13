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
public class VolunteerDetails {
    int VolunteerID;
    String VolunteerName;
    String UserName;
    String Password;
    int VolunteerContact;
    String Address;
    public VolunteerDetails(){
        VolunteerID=-1;
        VolunteerName
                =UserName
                =Password;
        VolunteerContact=-1;
    }
    public VolunteerDetails(int VolID,String VolName,String UName,String pwd,int VolunteerMobile,String addr){
        
        VolunteerID=VolID;
        VolunteerName=VolName;
        UserName=UName;
        Password=pwd;
        VolunteerContact=VolunteerMobile;
        Address=addr;
    }
    
    public int VolunteerID(){
        return VolunteerID;
    }
    public String VolunteerName(){
        return VolunteerName;
    }
    public String UserName(){
        return UserName;
    }
    public String Password(){
        return Password;
    }
    public int VolunteerContact(){
        return VolunteerContact;
    }
    public String Address(){
        return Address;
    }
}
