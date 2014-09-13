/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller.Database;

import Model.VolunteerDetails;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gopi
 */
public class Database {

    private static Connection con;
    private static final String host = "localhost", dbname = "dms", username = "root", password = "root";
    private static final int port = 3306;
    private static String query;
    
   public static void getConnected() {
        try {
             Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/" + dbname + "?zeroDateTimeBehavior=convertToNull", username, password);
            if(con == null)
                System.err.println("Unable to Connect");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void closeConnection() {
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static int getVolunteerCurrID() {
        getConnected();
       // System.out.print("getVolunteerCurrID");
          int VID = -1;
        try {
            query = "select volunteers_id from dms.volunteers_info ORDER BY volunteers_id DESC LIMIT 1";
            Statement stmt  = con.createStatement();
            ResultSet rs=stmt.executeQuery(query);
            if(rs.next()){
                
                while(rs.next()){
                    VID=rs.getInt("Volunteers_id");
                }
            }else{
            return 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
           
        closeConnection();
        return VID;
    }

    public static void addVolunteerRegistration(VolunteerDetails vdetails) {
        try {
            getConnected();
              query = "INSERT INTO dms.volunteers_info (`volunteers_id`, name , username, password, contact_no,volunteers_Address)"
                    + "VALUES (" + ((vdetails.getVolunteerID() + 1)) + ", '" + vdetails.getVolunteerName()+ "', '" + vdetails.getUserNameOfVolunteer()+ "', '" + vdetails.getPassword()+ "', '" + vdetails.getVolunteerContact()+"', '" + vdetails.getVolunteerAddress()+ "')";
            Statement stmt = con.createStatement();
            stmt.executeUpdate(query);
            
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public String getDisasterType(int Did){
        getConnected();
        //MyCodeHere
        closeConnection();
        return null;
    }

    public String getDisasterLocation(int Did) {
        getConnected();
        //MyCodeHere
        closeConnection();
        return null;
    }

    public String getDisasterDeaths() {
        getConnected();
        //MyCodeHere
        closeConnection();
        return null;
    }

    public String getDisasterPropertyLoss() {
        getConnected();
        //MyCodeHere
        closeConnection();
        return null;
    }

    public String getVolunteers(int Did) {
        getConnected();
        //MyCodeHere
        closeConnection();
        return null;
    }

    public String getFood(int Did) {
        getConnected();
        //MyCodeHere
        closeConnection();
        return null;
    }

    public String getMedical(int Did) {
        getConnected();
        //MyCodeHere
        closeConnection();
        return null;
    }

    public String getReliefCampDetails(int Did) {
        getConnected();
        //MyCodeHere
        closeConnection();
        return null;
    }

    public int getDeaths(int Did) {
        getConnected();
        //MyCodeHere
        closeConnection();
        return -1;
    }

    public int getPropertyLoss(int Did) {
        getConnected();
        //MyCodeHere
        closeConnection();
        return -1;
    }

    public int getPeopleInjured(int Did) {
        getConnected();
        //MyCodeHere
        closeConnection();
        return -1;
    }

    public String getCampAddress(int Campid) {
        getConnected();
        //MyCodeHere
        closeConnection();
        return null;
    }

    public String getCampContact(int Campid) {
        getConnected();
        //MyCodeHere
        closeConnection();
        return null;
    }
}