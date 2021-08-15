package modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.vo.Requerimiento_1Vo;
import util.JDBCUtilities;

public class Requerimiento_1Dao {
    public ArrayList<Requerimiento_1Vo> requerimiento1() throws SQLException {
        Connection connection = JDBCUtilities.getConnection();
        ArrayList<Requerimiento_1Vo> listado_registros_rq1 = new ArrayList<Requerimiento_1Vo>();
        String sql = "SELECT p.ID_Proyecto , p.Constructora, p.Numero_Habitaciones FROM Proyecto p WHERE p.Clasificacion ='Apartaestudio' and p.Numero_Habitaciones >=3;";
        try (Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Requerimiento_1Vo requerimiento1 = new Requerimiento_1Vo();
                requerimiento1.setIdProyecto(rs.getInt("ID_Proyecto"));
                requerimiento1.setConstructora(rs.getString("Constructora"));
                requerimiento1.setHabitaciones(rs.getInt("Numero_Habitaciones"));
                listado_registros_rq1.add(requerimiento1);
            }
        }
        return listado_registros_rq1;
    }
}