/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ColumnaDAO;
import dao.EsquemaDAO;
import dao.TablaDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Tabla;

/**
 *
 * @author User
 */
public class EditarColumnas extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet EditarEsquemas</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EditarEsquemas at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            ColumnaDAO dao = new ColumnaDAO();
        } catch (SQLException ex) {
            Logger.getLogger(EditarColumnas.class.getName()).log(Level.SEVERE, null, ex);
        }
        String id = request.getParameter("id");
        request.setAttribute("id", id);
        request.getRequestDispatcher("EditColumnas.jsp").forward(request, response);

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         
        String nombreC=(String) request.getParameter("nombreC");
        int id = Integer.parseInt(request.getParameter("id"));
        ColumnaDAO dao;
        try {
            dao = new ColumnaDAO();
        } catch (SQLException ex) {
            Logger.getLogger(EditarColumnas.class.getName()).log(Level.SEVERE, null, ex);
        }
        dao.updateColumna(id, nombreT);
        response.sendRedirect("Columnas");
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
   
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}