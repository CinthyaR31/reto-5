package modelo.vo;

//p.ID_Proyecto , p.Constructora, p.Numero_Habitaciones 

public class Requerimiento_3Vo {

    //p.ID_Proyecto ,p.Ciudad , l.Nombre
    private Integer ID_Proyecto;
    private String Ciudad;
    private String Nombre; 

    
    public Integer getID_Proyecto() {
        return ID_Proyecto;
    }





    public void setID_Proyecto(Integer iD_Proyecto) {
        ID_Proyecto = iD_Proyecto;
    }





    public String getCiudad() {
        return Ciudad;
    }





    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }





    public String getNombre() {
        return Nombre;
    }





    public void setNombre(String nombre) {
        Nombre = nombre;
    }





    public Requerimiento_3Vo() {
    }
    
    
 


    @Override
    public String toString() {
        return ID_Proyecto + " " +  Ciudad +  " " + Nombre;
    }

}
