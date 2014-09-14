/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Controller.Database.Database;
import Model.ReliefCampDetails;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author gopi
 */
public class RcampDetails extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
         String disaster_name = request.getParameter("disaster_Name");
         String Campid=request.getParameter("relief_Camp_ID");
          String relief_Ph = request.getParameter("relief_Ph");
        String relief_add = request.getParameter("relief_addrs");
       String VolunteersNeeded = request.getParameter("volunteers_Req");
       String FudPacks = request.getParameter("total_foodpacks_Required");
       String MediaKits = request.getParameter("medicalKits_required");
        int DisasterId=Database.addDisasterName(disaster_name);
        int  noOfFudPacks=Integer.parseInt(FudPacks);
        int noOfMedicalKits=Integer.parseInt(MediaKits);
        int noOfVolunteers=Integer.parseInt(VolunteersNeeded);
        ReliefCampDetails rCamp=new ReliefCampDetails(DisasterId,Campid,relief_add,relief_Ph,noOfFudPacks,noOfMedicalKits,noOfVolunteers);  
        Database.addReliefCampAndRequirementsDetails(rCamp);
        RequestDispatcher rd = null;
        if(DisasterId==0){
        rd = request.getRequestDispatcher("adminaccount.html");}
        else{rd = request.getRequestDispatcher("volunteeraccount.html");}
        if (rd != null) {
            rd.forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
