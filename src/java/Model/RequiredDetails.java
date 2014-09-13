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
public class RequiredDetails {
    int DisasterID;
    String Volunteers;
    String Food;
    String Water;
    String Cloth;
    String Medical;
    String ReliefCampDetails;
    public RequiredDetails(){
         DisasterID=0;
         Volunteers
                =Food
                =Water 
                =Cloth
                =Medical
                =ReliefCampDetails; 
    }
    public RequiredDetails(int Did){
        DisasterID=Did;
        Controller.Database.Database ConDB=new Controller.Database.Database();
        Volunteers=ConDB.getVolunteers(Did); 
        Food=ConDB.getFood(Did);
        Medical=ConDB.getMedical(Did);
        ReliefCampDetails=ConDB.getReliefCampDetails(Did);
    }
}
