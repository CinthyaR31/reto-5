package vista;

import java.util.ArrayList;

import controlador.ControladorRequerimientos;
import modelo.vo.Requerimiento_1Vo;
import modelo.vo.Requerimiento_2Vo;

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
            // Su código
        } catch (Exception e) {
            System.err.println(e);
        }
    }

}
