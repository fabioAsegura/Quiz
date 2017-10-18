package dao;

import util.DbUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Columna;

public class ColumnaDAO {

    private Connection connection;

    public ColumnaDAO() throws SQLException {
        connection = DbUtil.getConnection();
    }

    public boolean addColumna(Columna columna) throws SQLException {
       boolean result = false;
        Connection connection = DbUtil.getConnection();
        String query = "insert into columna (columna.nombre_columna,columna.data_type,columna.id_tabla) values (?, ?, ?);";
        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString(1, columna.getNombre_columna());
            preparedStmt.setString(2, columna.getData_type());
             preparedStmt.setInt(3, columna.getId_tabla());
            result = preparedStmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public boolean deleteColumna(int a) throws SQLException {
          boolean result = false;
        Connection connection = DbUtil.getConnection();
        String query = "delete from columna where id_columna = ?";
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

    public boolean updateColumna(int a, String nombreNuevo) throws SQLException {
         boolean result = false;
        Connection connection = DbUtil.getConnection();
        String query = "update columna set nombre_columna = ? where id_columna = ?";
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
    public boolean updateColumnaDataType(int a, String nuevoDataType) throws SQLException {
         boolean result = false;
        Connection connection = DbUtil.getConnection();
        String query = "update columna set data_type = ? where id_columna = ?";
        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString(1, nuevoDataType);
            preparedStmt.setInt(2, a);
            if (preparedStmt.executeUpdate() > 0) {
                result = true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    public List<Columna> getAllColumna() throws SQLException {
      List<Columna> columna = null;
      boolean result = false;
        String query = "SELECT * FROM columna";
        Connection connection = DbUtil.getConnection();
        try {    
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
           int id=0;
            String data_type=null;
            String nombre = null;
            int id_tabla = 0;

            while (rs.next()) {
                if (columna == null) {
                    columna = new ArrayList<Columna>();
                }
                Columna registro = new Columna(nombre,data_type,id_tabla);
                id = rs.getInt("id_columna");
                registro.setId_columna(id);

                nombre = rs.getString("nombre_columna");
                registro.setNombre_columna(nombre);
                
                data_type=rs.getString("data_type");
                registro.setData_type(data_type);
                
                id_tabla = rs.getInt("id_tabla");
                registro.setId_tabla(id);


                columna.add(registro);

            }
            for (int i = 0; i < columna.size(); i++) {
                System.out.println(columna.get(i).getId_columna()+ " " + columna.get(i).getNombre_columna()+" "+columna.get(i).getData_type());
            }
            st.close();

        } catch (SQLException e) {
            System.out.println("Problemas al obtener la lista de Columnas");
            e.printStackTrace();
        }

        return columna;
    
    }

}
