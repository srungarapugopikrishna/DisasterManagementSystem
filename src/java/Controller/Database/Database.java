/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Database;

import Model.DisasterDetails;
import Model.PeopleDetails;
import Model.ReliefCampDetails;
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
            } else { 
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

        // System.out.println("In CheckLogin");
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

    public static int addDisasterName(String disasterName) {
        try {
            getConnected();
            String disaster_Id;
            String query2 = "select did from dms.disaster where disaster_name="+disasterName;
            Statement stmt2 = con.createStatement();
            ResultSet rs1 = stmt2.executeQuery(query2);
            if(rs1.next()){
                disaster_Id = rs1.getString(1);
                return Integer.parseInt(disaster_Id);
            }
            else{
                String disasterId;
                query = "select did from dms.disasters ORDER BY did DESC LIMIT 1";
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                if (rs.next()) {
                    disasterId = rs.getString(1);
                    String query1 = "INSERT INTO dms.disasters (`did`,disaster_name)"
                            + "VALUES (" + ((Integer.parseInt(disasterId) + 1)) + ", '" + disasterName + "')";
                    Statement stmt1 = con.createStatement();
                    stmt1.executeUpdate(query1);
                    return (Integer.parseInt(disasterId) + 1);

                } else {
                    String query1 = "INSERT INTO dms.disasters (`did`,disaster_name)"
                            + "VALUES (" + ((1)) + ", '" + disasterName + "')";
                    Statement stmt1 = con.createStatement();
                    stmt1.executeUpdate(query1);
                }
        }
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 1;
    }

    public static void addDisasterDetailsToDB(DisasterDetails Ddetails) {
        try {
            getConnected();
            query = "INSERT INTO dms.disaster_details (`did`, disaster_type , location, total_deaths, property_loss,people_injured)"
                    + "VALUES (" + ((Ddetails.getDisasterID())) + ", '" + Ddetails.getDisasterTypeID() + "', '" + Ddetails.getDisasterLocation() + "', '" + Ddetails.getDisasterDeaths() + "', '" + Ddetails.getDisasterPropertyLoss() + "', '" + Ddetails.getDisasterInjuredPeople() + "')";
            Statement stmt = con.createStatement();
            stmt.executeUpdate(query);
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//    public static int addDisasterType(String disasterType) {
//        try {
//            getConnected();
//            String disaster_Type_Id;
//            query = "select type_id from dms.disaster_types ORDER BY type_id DESC LIMIT 1";
//            Statement stmt = con.createStatement();
//            ResultSet rs = stmt.executeQuery(query);
//            if (rs.next()) {
//                disaster_Type_Id = rs.getString(1);
//                String query1 = "INSERT INTO dms.disaster_types (`type_id`,disaster_type)"
//                        + "VALUES (" + ((Integer.parseInt(disaster_Type_Id) + 1)) + ", '" + disasterType + "')";
//                Statement stmt1 = con.createStatement();
//                stmt1.executeUpdate(query1);
//                return (Integer.parseInt(disaster_Type_Id) + 1);
//
//            } else {
//                String query1 = "INSERT INTO dms.disaster_types (`type_id`,disaster_type)"
//                        + "VALUES (" + ((1)) + ", '" + disasterType + "')";
//                Statement stmt1 = con.createStatement();
//                stmt1.executeUpdate(query1);
//            }
//            closeConnection();
//        } catch (SQLException ex) {
//            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return 1;
//    }
    public static int addDisasterType(String disasterType) {
        try {
            getConnected();
            String disaster_Type_Id;
            query = "select type_id from dms.disaster_types where disaster_type="+disasterType;
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next()) {
            } else {
                   String query2 = "select type_id from dms.disaster_types ORDER BY type_id DESC LIMIT 1";
                   Statement stmt2 = con.createStatement();
                   ResultSet rs1 = stmt2.executeQuery(query2);
                   if (rs1.next()) {
                       disaster_Type_Id = rs.getString(1);
                       String query1 = "INSERT INTO dms.disaster_types (`type_id`,disaster_type)"
                               + "VALUES (" + ((Integer.parseInt(disaster_Type_Id) + 1)) + ", '" + disasterType + "')";
                       Statement stmt1 = con.createStatement();
                       stmt1.executeUpdate(query1);
                       return (Integer.parseInt(disaster_Type_Id) + 1);

                   } else {
                       String query1 = "INSERT INTO dms.disaster_types (`type_id`,disaster_type)"
                               + "VALUES (" + ((1)) + ", '" + disasterType + "')";
                       Statement stmt1 = con.createStatement();
                       stmt1.executeUpdate(query1);
                       return 1;
                   }
            }
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 1;
    }
    public static void addPeopleDetailsToDB(PeopleDetails people) { 
        try {
            getConnected();
            query = "INSERT INTO dms. people (`pid`,`did`, Name , `age`, `status`, rescued_location,present_location,contact_no,sex)"
                    + "VALUES (" +people.getPersonID()+ ", "+people.getDisasterID()+ ", '" + people.getPersonName() + "', '" + people.getAge() + "', '" + people.getAliveStatus() + "', '" + people.getResucuedLocation() + "', '" + people.getPresentLocation() +"', '" + people.getMobile()+"', '" + people.getSex()+ "')";
            Statement stmt = con.createStatement();
            stmt.executeUpdate(query);
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static int getPID() {
         getConnected();
         int PiD = 0;
         
         try {
            query = "select pid from dms.people ORDER BY pid DESC LIMIT 1";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next()) {
                 PiD = rs.getInt("pid");
                 return PiD;
            } else {
                return 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
        return -10;
        
    }

    public static void addReliefCampAndRequirementsDetails(ReliefCampDetails rCamp) {
        try {
            getConnected();
            query = "INSERT INTO dms. reliefcampandrequirementdetails (`did`, camp_id , Address, Phone_no, FoodPacks,MedicalKits,VolunteersRequired)"
+ "VALUES (" +rCamp.getDisasterID()+ ", "+rCamp.getCampID()+ ", '" + rCamp.getAddress() + "', '" + rCamp.getContact() + "', '" + rCamp.getFoodPacks() + "', '" + rCamp.getMedicalDetails() + "', '" + rCamp.getNoOfVolunteers() + "')";
            Statement stmt = con.createStatement();
            stmt.executeUpdate(query);
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
