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
        String sql = "SELECT l.ID_Lider ,l.Nombre ,l.Primer_Apellido , AVG(l.Salario) PromedioSalario FROM Lider l GROUP BY l.ID_Lider ,l.Nombre ,l.Primer_Apellido ORDER BY PromedioSalario DESC ;";
        try (Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Requerimiento_1Vo requerimiento1 = new Requerimiento_1Vo();
                requerimiento1.setID_Lider(rs.getInt("ID_Lider"));
                requerimiento1.setNombre(rs.getString("Nombre"));
                requerimiento1.setPrimer_Apellido(rs.getString("Primer_Apellido"));
                requerimiento1.setPromedioSalario(rs.getDouble("PromedioSalario"));

                listado_registros_rq1.add(requerimiento1);
          
            }
        }
        return listado_registros_rq1;
    }
}