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
public class DisasterDetails {
    int DisasterID;
    String DisasterName;
    String DisasterType;
    String DisasterLocation;
    String DisasterDeaths;
    String DisasterPropertyLoss;
 
    public DisasterDetails(){
        DisasterID=0;
        DisasterName
                =DisasterType
                =DisasterLocation
                =DisasterDeaths
                =DisasterPropertyLoss;
    }
    public DisasterDetails(int Did){
         DisasterID=Did;
         Controller.Database.Database ConDB=new Controller.Database.Database();
         DisasterType = ConDB.getDisasterType(Did);
         DisasterLocation=ConDB.getDisasterLocation(Did);
         DisasterDeaths=ConDB.getDisasterDeaths();
         DisasterPropertyLoss=ConDB.getDisasterPropertyLoss();
    }
}