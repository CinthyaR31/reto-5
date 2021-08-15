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
        String sql = "SELECT l.ID_Lider ,l.Nombre ,l.Primer_Apellido , AVG(l.Salario) PromedioSalario FROM Lider l GROUP BY l.ID_Lider ,l.Nombre ,l.Primer_Apellido ORDER BY PromedioSalario DESC ;";
        try (Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {

                Requerimiento_2Vo requerimiento2 = new Requerimiento_2Vo();
                requerimiento2.setID_Lider(rs.getInt("ID_Lider"));
                requerimiento2.setNombre(rs.getString("Nombre"));
                requerimiento2.setPrimer_Apellido(rs.getString("Primer_Apellido"));
                requerimiento2.setPromedioSalario(rs.getDouble("PromedioSalario"));

                listado_registros_rq2.add(requerimiento2);
            }
        }
        return listado_registros_rq2;
    }
}