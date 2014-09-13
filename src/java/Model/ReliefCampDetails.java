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
public class ReliefCampDetails {
    int DisasterID;
    int CampID;
    String Address;
    String Contact;
    public ReliefCampDetails(){
        DisasterID
                =CampID;
        Address="";
        Contact="";
    }
    public ReliefCampDetails(int Did,int Campid,String addr,String ph){
        DisasterID=Did;
        CampID=Campid;
        Address=addr;
        Contact=ph;
    }
    public int getDisasterID()  {return DisasterID;}
    public int getCampID()      {return CampID;}
    public String getAddress()  {return Address;}
    public String getContact()  {return Contact;}
}
