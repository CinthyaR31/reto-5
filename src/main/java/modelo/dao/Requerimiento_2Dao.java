package modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.vo.Requerimiento_2Vo;
import util.JDBCUtilities;

public class Requerimiento_2Dao {
    public ArrayList<Requerimiento_2Vo> requerimiento2() throws SQLException {
        Connection connection = JDBCUtilities.getConnection();
        ArrayList<Requerimiento_2Vo> listado_registros_rq2 = new ArrayList<Requerimiento_2Vo>();
        String sql = "SELECT p.ID_Proyecto, mc.Nombre_Material FROM  Compra c INNER JOIN Proyecto p ON p.ID_Proyecto = c.ID_Proyecto INNER JOIN MaterialConstruccion mc ON mc.ID_MaterialConstruccion = c.ID_MaterialConstruccion WHERE p.ID_Proyecto IN (12,15,18) ORDER BY p.ID_Proyecto DESC;";
        try (Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {

                Requerimiento_2Vo requerimiento2 = new Requerimiento_2Vo();
                requerimiento2.setID_Proyecto(rs.getInt("ID_Proyecto"));
                requerimiento2.setNombre_Material(rs.getString("Nombre_Material"));

                listado_registros_rq2.add(requerimiento2);
            }
        }
        return listado_registros_rq2;
    }
}