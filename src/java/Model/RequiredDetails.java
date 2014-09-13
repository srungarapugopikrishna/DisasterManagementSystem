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
    int Volunteers;
    int Food;
    int Medical;
    
    public RequiredDetails(){
         DisasterID
                 = Volunteers 
                 = Food
                 =Medical; 
    }
    public RequiredDetails(int Did,int volunteersCount,int FoodQuantity,int MedicalKits){
        DisasterID=Did;
        Controller.Database.Database ConDB=new Controller.Database.Database();
        Volunteers=volunteersCount; 
        Food=FoodQuantity;
        Medical=MedicalKits;
    }
    public int getDisasterID()  {return DisasterID;}
    public int getVolunteers()  {return Volunteers;}
    public int getFood()        {return Food;}
    public int getMedical()       {return Medical;}
}
