package modelo.vo;

//p.ID_Proyecto , p.Constructora, p.Numero_Habitaciones 

public class Requerimiento_2Vo {

    private Integer ID_Lider;
    private String Nombre;
    private String Primer_Apellido; 
    private Double PromedioSalario; 


    public Requerimiento_2Vo() {
    }
    
    
    public Integer getID_Lider() {
        return ID_Lider;
    }


    public void setID_Lider(Integer iD_Lider) {
        ID_Lider = iD_Lider;
    }


    public String getNombre() {
        return Nombre;
    }


    public void setNombre(String nombre) {
        Nombre = nombre;
    }


    public String getPrimer_Apellido() {
        return Primer_Apellido;
    }


    public void setPrimer_Apellido(String primer_Apellido) {
        Primer_Apellido = primer_Apellido;
    }


    public Double getPromedioSalario() {
        return PromedioSalario;
    }


    public void setPromedioSalario(Double promedioSalario) {
        PromedioSalario = promedioSalario;
    }


    @Override
    public String toString() {
        return ID_Lider + " | " +  Nombre +  " | " + Primer_Apellido + " | " + PromedioSalario;
    }

}
