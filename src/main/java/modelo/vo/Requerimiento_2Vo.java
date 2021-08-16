package modelo.vo;

//p.ID_Proyecto , p.Constructora, p.Numero_Habitaciones 

public class Requerimiento_2Vo {
    //p.ID_Proyecto, mc.Nombre_Material
    private Integer ID_Proyecto;
    private String Nombre_Material;



    public Requerimiento_2Vo() {
    }
    
   

    public Integer getID_Proyecto() {
        return ID_Proyecto;
    }



    public void setID_Proyecto(Integer iD_Proyecto) {
        ID_Proyecto = iD_Proyecto;
    }



    public String getNombre_Material() {
        return Nombre_Material;
    }



    public void setNombre_Material(String nombre_Material) {
        Nombre_Material = nombre_Material;
    }



    @Override
    public String toString() {
        return ID_Proyecto + " " +  Nombre_Material;
    }

}
