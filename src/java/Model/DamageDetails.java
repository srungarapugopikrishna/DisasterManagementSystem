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
public class DamageDetails {
    int DisasterID;
    int Deaths;
    int PropertyLoss;
    int PeopleInjured;
    public DamageDetails(){
        DisasterID
                =Deaths
                =PropertyLoss
                =PeopleInjured;
    }
    public DamageDetails(int Did){
        DisasterID=Did;
        Controller.Database.Database ConDB=new Controller.Database.Database();
//        Deaths=ConDB.getDeaths(Did);
//        PropertyLoss=ConDB.getPropertyLoss(Did);
//        PeopleInjured=ConDB.getPeopleInjured(Did);
    }
}