package Tema5.Colecciones.Banco;

public class Usuario {
    private String name;
    private String dni;
    private int edad;

    //contrusctor

    public Usuario() {
    }

    public Usuario(String name, String dni, int edad) {
        this.name = name;
        this.dni = dni;
        this.edad = edad;
    }
    // getter

    public String getName() {
        return name;
    }

    public String getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    //setter

    public void setName(String name) {
        this.name = name;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setEdad(int edad) {
        if (edad < 0) {
            System.out.println("La edad no puede ser negativa.");
        } else {
            this.edad = edad;
        }

    }

    // metodos
    public String toString() {
        return "El usuario con el dni " + dni + "\n" +
                "Nombre del usuario " + name + "\n" +
                "Edad " + edad;
    }

}
