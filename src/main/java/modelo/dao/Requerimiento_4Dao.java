package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.vo.Requerimiento_3Vo;
import util.JDBCUtilities;

public class Requerimiento_4Dao {

    public Boolean requerimiento4(
            String Nombre,
            String Primer_Apellido,
            String Segundo_Apellido,
            Integer Salario,
            String Ciudad_Residencia,
            String Cargo,
            Integer Clasificacion,
            String Documento_Identidad,
            String Fecha_Nacimiento
    ) throws SQLException {
        Connection connection = JDBCUtilities.getConnection();

        String sql = "INSERT INTO Lider (Nombre, Primer_Apellido, Segundo_Apellido, Salario, Ciudad_Residencia, Cargo, Clasificacion, Documento_Identidad, Fecha_Nacimiento) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";

        PreparedStatement consulta = connection.prepareStatement(sql);
        consulta.setString(1, Nombre);
        consulta.setString(2, Primer_Apellido);
        consulta.setString(3, Segundo_Apellido);
        consulta.setInt(4, Salario);
        consulta.setString(5, Ciudad_Residencia);
        consulta.setString(6, Cargo);
        consulta.setInt(7, Clasificacion);
        consulta.setString(8, Documento_Identidad);
        consulta.setString(9, Fecha_Nacimiento);

        consulta.executeUpdate();

        connection.close();

        return true;
    }
}
