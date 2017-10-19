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

/**
 *
 * @author LabingXEON
 */
public class ContextoNavegacion {
    
    public boolean addContexto(int id, String link) throws SQLException {
        boolean result = false;
        Connection connection = DbUtil.getConnection();
        String query = "insert into ";
        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString(1, esquema.getNombre_esquema());
            result = preparedStmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
