/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import util.DbUtil;
import model.ContextoNavegacionM;

/**
 *
 * @author LabingXEON
 */
public class ContextoNavegacionDAO {
    
    private static Connection connection;

    public ContextoNavegacionDAO() throws SQLException {
        connection = DbUtil.getConnection();
    }
    public boolean addContexto(ContextoNavegacionM contextonavegacion) throws SQLException {
        boolean result = false;
        Connection connection = DbUtil.getConnection();
        String query = "insert into contextonavegacion (contextonavegacion.Id_contexto,contextonavegacion.Link,contextonavegacion.id_UnidadAbstracta) values (?, ?, ?)";
        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setInt(1, contextonavegacion.getId_contexto());
            preparedStmt.setString(2, contextonavegacion.getLink());
             preparedStmt.setInt(3, contextonavegacion.getid_UnidadAbstracta());
            result = preparedStmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
   
}
