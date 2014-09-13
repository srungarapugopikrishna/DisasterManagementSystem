/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import Controller.Database.Database;

/**
 *
 * @author gopi
 */
public class DisasterDetails {
    int DisasterID;
    String DisasterName;
    String DisasterType;
    int DisasterTypeID;
    String DisasterLocation;
    String DisasterDeaths;
    String DisasterPropertyLoss;
    String DisasterInjuredPeople;
 
    public DisasterDetails(){
        DisasterID=0;
        DisasterName
                =DisasterType;
        DisasterTypeID=-1;
        DisasterLocation
                =DisasterDeaths
                =DisasterPropertyLoss
                =DisasterInjuredPeople;
    }
    public DisasterDetails(int Did,String DisName,String DisType,String DisLoc,String DisDeaths,String DisPropertyLoss,String DisInjuredPeople){
         DisasterID=Did;
         DisasterName=DisName;
         DisasterType =  DisType;
         DisasterTypeID=Database.addDisasterType(DisasterType);
         DisasterLocation=DisLoc;
         DisasterDeaths=DisDeaths;
         DisasterPropertyLoss=DisPropertyLoss;
         DisasterInjuredPeople=DisInjuredPeople;
    }
    
    public int getDisasterID(){
        return DisasterID;
    }
    public String getDisasterName(){
        return DisasterName;
    }
    public int getDisasterTypeID(){
        return DisasterTypeID;
    }
    public String getDisasterLocation(){
        return DisasterLocation;
    }
    public String getDisasterDeaths(){
        return DisasterDeaths;
    }
    public String getDisasterInjuredPeople(){
        return DisasterInjuredPeople;
    }
    public String getDisasterPropertyLoss(){
        return DisasterPropertyLoss;
    }
}