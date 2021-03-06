package vista;

import java.util.ArrayList;

import controlador.ControladorRequerimientos;
import java.sql.SQLException;
import modelo.vo.Requerimiento_1Vo;
import modelo.vo.Requerimiento_2Vo;
import modelo.vo.Requerimiento_3Vo;

public class VistaRequerimientos {

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void requerimiento1() {
        try {
            ArrayList<Requerimiento_1Vo> resultado_requerimiento1 = controlador.consultarRequerimiento1();
            resultado_requerimiento1.forEach(System.out::println);
            // Su código
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento2() {
        try {
            ArrayList<Requerimiento_2Vo> resultado_requerimiento2 = controlador.consultarRequerimiento2();
            resultado_requerimiento2.forEach(System.out::println);
            // Su código
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento3() {
        try {
            ArrayList<Requerimiento_3Vo> resultado_requerimiento3 = controlador.consultarRequerimiento3();
            resultado_requerimiento3.forEach(System.out::println);
            // Su código
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    
   public static void mostrarAppVentanaInicial(){
       AppVentanaInicial appVentanaInicial = new AppVentanaInicial();
       appVentanaInicial.setVisible(true);
   }
   
   public static void mostrarAppReportes() throws SQLException{
       AppReportes appReportes = new AppReportes();
       appReportes.setVisible(true);
   }

   public static void mostrarFormularioLideres(){
       AppFormularioLideres appFormularioLideres = new AppFormularioLideres();
       appFormularioLideres.setVisible(true);
   }
   
}
