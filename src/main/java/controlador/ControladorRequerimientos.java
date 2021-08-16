package controlador;

import java.sql.SQLException;
import java.util.ArrayList;

import modelo.dao.Requerimiento_1Dao;
import modelo.dao.Requerimiento_2Dao;
import modelo.vo.Requerimiento_1Vo;
import modelo.vo.Requerimiento_2Vo;
import modelo.dao.Requerimiento_3Dao;
import modelo.dao.Requerimiento_4Dao;
import modelo.vo.Requerimiento_3Vo;

public class ControladorRequerimientos {

    private Requerimiento_1Dao requerimiento_1Dao;
    private Requerimiento_2Dao requerimiento_2Dao;
    private Requerimiento_3Dao requerimiento_3Dao;
    private Requerimiento_4Dao requerimiento_4Dao;

    public ControladorRequerimientos() {
        this.requerimiento_1Dao = new Requerimiento_1Dao();
        this.requerimiento_2Dao = new Requerimiento_2Dao();
        this.requerimiento_3Dao = new Requerimiento_3Dao();
        this.requerimiento_4Dao = new Requerimiento_4Dao();
    }

    public ArrayList<Requerimiento_1Vo> consultarRequerimiento1() throws SQLException {
        return this.requerimiento_1Dao.requerimiento1();
    }

    public ArrayList<Requerimiento_2Vo> consultarRequerimiento2() throws SQLException {
        return this.requerimiento_2Dao.requerimiento2();
    }

    public ArrayList<Requerimiento_3Vo> consultarRequerimiento3() throws SQLException {
        return this.requerimiento_3Dao.requerimiento3();
    }

    public Boolean guardarLider(
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
        return this.requerimiento_4Dao.requerimiento4(Nombre, Primer_Apellido, Segundo_Apellido, Salario, Ciudad_Residencia, Cargo, Clasificacion, Documento_Identidad, Fecha_Nacimiento);
    }

}
