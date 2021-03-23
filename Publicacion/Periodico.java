package Publicacion;

public class Periodico extends Publicacion implements Periodicidad
{
    private String seccion;
    private String editor;
       
    public String getSecciones(){
     return seccion;
    }
    
    public void setSecciones(String sec){
       seccion = sec;
    }
    
    public String getEditor(){
     return editor;
    }
    
    public void setEditor(String ed){
        editor = ed;
    }
    
    @Override
    public String getPeriodicidad()//implementación del método
    {
     return periodicidad;
    }
    
}