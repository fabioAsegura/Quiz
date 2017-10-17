package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Esquema;
import util.DbUtil;

public class EsquemaDAO {

    private static Connection connection;

    public EsquemaDAO() throws SQLException {
        connection = DbUtil.getConnection();
    }

    public boolean addEsquema(Esquema esquema) throws SQLException {
        boolean result = false;
        Connection connection = DbUtil.getConnection();
        String query = "insert into esquema (esquema.nombre_esquema) values (?);";
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

    public boolean deleteEsquema(int a) throws SQLException {
        boolean result = false;
        Connection connection = DbUtil.getConnection();
        String query = "delete from esquema where id_esquema = ?";
        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setInt(1, a);
            result = preparedStmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    public boolean updateEsquema(int a, String nombreNuevo) throws SQLException {
        boolean result = false;
        Connection connection = DbUtil.getConnection();
        String query = "update esquema set nombre_esquema = ? where id_esquema = ?";
        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString(1, nombreNuevo);
            preparedStmt.setInt(2, a);
            if (preparedStmt.executeUpdate() > 0) {
                result = true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    public List<Esquema> getAllEsquemas() throws SQLException {
        List<Esquema> esquema = null;
        String query = "SELECT * FROM esquema";
        Connection connection = DbUtil.getConnection();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
            int id = 0;
            String nombre = null;

            while (rs.next()) {
                if (esquema == null) {
                    esquema = new ArrayList<Esquema>();
                }

                Esquema registro = new Esquema(nombre);
                id = rs.getInt("id_esquema");
                registro.setId_esquema(id);

                nombre = rs.getString("nombre_esquema");
                registro.setNombre_esquema(nombre);

                esquema.add(registro);

            }
            for (int i = 0; i < esquema.size(); i++) {
                System.out.println(esquema.get(i).getId_esquema() + " " + esquema.get(i).getNombre_esquema());
            }
            st.close();

        } catch (SQLException e) {
            System.out.println("Problemas al obtener la lista de Esquemas");
            e.printStackTrace();
        }

        return esquema;
    }
}
