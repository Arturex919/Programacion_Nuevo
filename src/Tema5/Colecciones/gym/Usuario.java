package Tema5.Colecciones.gym;

public class Usuario {
    private  String nombre;
    private  int edad;

    //constructor


    public Usuario( String nombre,int edad) {
        this.nombre = nombre;
        this.edad = edad;

    }

    //get
    public int getEdad() {
        return edad;
    }
    public String getNombre() {
        return nombre;
    }
    //set
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
@Override
    public String toString() {
        return "Nombre: "+nombre+"\n" +
                "edad: "+edad;
    }
}
