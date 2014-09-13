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
            if (con == null) {
                System.err.println("Unable to Connect");
            }
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
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next()) {

                while (rs.next()) {
                    VID = rs.getInt("Volunteers_id");
                }
            } else {
                return 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeConnection();
        return VID;
    }

    public static boolean addVolunteerRegistration(VolunteerDetails vdetails) {
        try {
            getConnected();
            
            String checkRegisteredUsers = "select volunteers_id from dms.volunteers_info where username='" + vdetails.getUserNameOfVolunteer() + "'";
            Statement stmt1 = con.createStatement();
            ResultSet rs = stmt1.executeQuery(checkRegisteredUsers);
            if (rs.next()) {
                 return false;
            } else{
                query = "INSERT INTO dms.volunteers_info (`volunteers_id`, name , username, password, contact_no,volunteers_Address)"
                        + "VALUES (" + ((vdetails.getVolunteerID() + 1)) + ", '" + vdetails.getVolunteerName() + "', '" + vdetails.getUserNameOfVolunteer() + "', '" + vdetails.getPassword() + "', '" + vdetails.getVolunteerContact() + "', '" + vdetails.getVolunteerAddress() + "')";
                Statement stmt = con.createStatement();
                stmt.executeUpdate(query);
                }
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    public static boolean checkLogin(String username, String pwd) {

        System.out.println("In CheckLogin");
        getConnected();
        String volunteers_id;
        try {
            query = "select volunteers_id from dms.volunteers_info where username='" + username + "'";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next()) {
               
                volunteers_id = rs.getString(1);
                query = "select password from dms.volunteers_info where volunteers_id='" + volunteers_id + "'";
                rs = stmt.executeQuery(query);
                rs.next();
                String dbpassword = rs.getString(1);
               // System.out.println("dbpassword---"+dbpassword+"--Pwd---"+pwd);
                if (dbpassword.equals(pwd)) {
                  //  System.out.println("SuccessFull");
                    closeConnection();
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
        return false;

    }

    public String getDisasterType(int Did) {
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
