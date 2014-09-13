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
    int Contact;
    public ReliefCampDetails(){
        DisasterID
                =CampID;
        Address="";
        Contact=-1;
    }
    public ReliefCampDetails(int Campid){
        CampID=Campid;
        Controller.Database.Database ConDB=new Controller.Database.Database();
        Address=ConDB.getCampAddress(Campid);
        Contact=ConDB.getCampontactAddress(Campid);
    }
}
