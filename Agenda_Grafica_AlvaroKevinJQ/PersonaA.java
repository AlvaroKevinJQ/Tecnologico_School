public class PersonaA{//Creamos la clase persona

    String nombre, telefono, correo, fc, area;// Le asignamos propiedades string para registrarlas

    int id;
    
    public PersonaA(){ //Método Constructor
        
    }

    public PersonaA(String nombre, String telefono, String correo, String fc, String area){ //Método Constructor con sobrecarga
        
    }

    //Establecemos los setters para cada atrubuto
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public void setCorreo(String correo){
        this.correo = correo;
    }

    public void setfc(String cumple){
        this.fc = cumple;
    }

    public void setArea(String area){
        this.area = area;
    }


    //Establecemos los getters de cada atributo
    public String getNombre(){
        return this.nombre;
    }

    public String getCorreo(){
        return this.correo;
    }

    public String getTelefono(){
        return this.telefono;
    }

    public String getCumple(){
        return this.fc;
    }

    public String getArea(){
        return this.area;
    }
}