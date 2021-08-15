package modelo.vo;

//p.ID_Proyecto , p.Constructora, p.Numero_Habitaciones 

public class Requerimiento_1Vo {
    private Integer idProyecto;
    private String constructora;
    private Integer habitaciones;

    public Requerimiento_1Vo() {
    }

    public Integer getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(Integer idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getConstructora() {
        return constructora;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public Integer getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(Integer habitaciones) {
        this.habitaciones = habitaciones;
    }

    @Override
    public String toString() {
        return idProyecto + " " + constructora + " " + habitaciones;
    }

}
