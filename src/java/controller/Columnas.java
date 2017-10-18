package controller;

import dao.ColumnaDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Columna;
import model.Esquema;
import model.Tabla;

/**
 *
 * @author User
 */
public class Columnas extends HttpServlet {

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
            out.println("<title>Servlet Columna</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Columna at " + request.getContextPath() + "</h1>");
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
     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         try {
            ColumnaDAO obj = new ColumnaDAO();
            ArrayList<Columna> lista = (ArrayList<Columna>)obj.getAllColumna();
            
            request.setAttribute("listaColumnas", lista);
            
           request.getRequestDispatcher("Columna.jsp").forward(request, response);

        } catch (SQLException ex) {
            Logger.getLogger(Columnas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         try {
            String type= (String) request.getParameter("tipoclave");
            String nombre = (String) request.getParameter("nameColumna");
            String datatype = (String) request.getParameter("datatype");
            int id = Integer.parseInt(request.getParameter("idTabla"));
             
             
            ColumnaDAO dao = new ColumnaDAO();
            Columna tab = new Columna(nombre, datatype, id);
            
            dao.addColumna(tab);
           
            
            response.sendRedirect("Columnas");
            
        } catch (SQLException ex) {
            Logger.getLogger(Columnas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
