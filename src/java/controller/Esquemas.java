/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.EsquemaDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Esquema;


/**
 *
 * @author User
 */
public class Esquemas extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try {
            EsquemaDAO dao = new EsquemaDAO();
            ArrayList<Esquema> lista = (ArrayList<Esquema>) dao.getAllEsquemas();
            
            request.setAttribute("listaEsquemas", lista);
            
           request.getRequestDispatcher("Esquema.jsp").forward(request, response);
            
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Esquemas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try {
            String nombre = (String) request.getParameter("nombre");
    
            
            EsquemaDAO dao = new EsquemaDAO();
            Esquema esq = new Esquema(nombre);
            
            dao.addEsquema(esq);
           
            
            response.sendRedirect("Esquemas");
            
        } catch (SQLException ex) {
            Logger.getLogger(Esquemas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    

}
