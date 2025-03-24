package Tema_7_Ficheros.Ejercicios.B.B2;

public class Alumno {
    String nombre;
    String apellido;
    double media;

    public Alumno(String nombre, String apellido, double media) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.media = media;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
}
