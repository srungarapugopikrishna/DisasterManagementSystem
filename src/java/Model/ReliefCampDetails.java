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
    String CampID;
    String Address;
    String Contact;
    int FoodPacks;
    int MedicalKits;
    int volunteers_required;
    public ReliefCampDetails(){
        DisasterID=-1;
            CampID="";
        Address
            =Contact;
        FoodPacks
                =MedicalKits
                =volunteers_required;
    }
    public ReliefCampDetails(int Did,String Campid,String addr,String ph,int fudpcks,int medkits,int noofvolunteers){
        DisasterID=Did;
        CampID=Campid;
        Address=addr;
        Contact=ph;
        FoodPacks=fudpcks;
        MedicalKits=medkits;
        volunteers_required=noofvolunteers;
    }
    public int getDisasterID()  {return DisasterID;}
    public String getCampID()      {return CampID;}
    public String getAddress()  {return Address;}
    public String getContact()  {return Contact;}
    public int getFoodPacks()   {return FoodPacks;}
    public int getMedicalDetails() {return MedicalKits;}
    public int getNoOfVolunteers(){return volunteers_required;}
}
