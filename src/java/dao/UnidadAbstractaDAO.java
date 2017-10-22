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
    import model.UnidadAbstracta;

/**
 *
 * @author LabingXEON
 */
public class UnidadAbstractaDAO {
    
    private static Connection connection;

    public UnidadAbstractaDAO() throws SQLException {
        connection = DbUtil.getConnection();
    }
    public boolean addUnidad(UnidadAbstracta unidadabstracta) throws SQLException {
        boolean result = false;
        Connection connection = DbUtil.getConnection();
        String query = "insert into unidadabstractainformacion (unidadabstracta.Id_UnidadAbstracta,unidadabstracta.Id_tabla) values (?, ?)";
        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setInt(1, unidadabstracta.getId_UnidadAbstracta());
             preparedStmt.setInt(2, unidadabstracta.getId_tabla());
            result = preparedStmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
   
}
