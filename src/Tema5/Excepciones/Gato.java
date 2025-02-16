package Tema5.Excepciones;

import java.util.Scanner;

public class Gato {
    private String nombre;
    private int edad;

    //construsct

    public Gato() {
    }

    // Constructor con parámetros, valida el nombre y la edad
    public Gato(String nombre, int edad) {

            setNombre(nombre); // Validación del nombre
            setEdad(edad);     // Validación de la edad

    }

    // Setter para nombre
    //cuando usas el throw asegurate de ponerlo en el inicio como en el metodo
    public void setNombre(String nombre) throws IllegalArgumentException {
        if (nombre.length() < 3) {
            throw new IllegalArgumentException("El nombre debe tener al menos 3 caracteres.");
        }
        this.nombre = nombre;
    }

    // Setter para edad
    public void setEdad(int edad) throws IllegalArgumentException {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa.");
        }
        this.edad = edad;
    }


    //getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    //metodos

    public String toString() {
        return "El nombre del gato es : " + this.nombre + "\n" +
                "y la edad es: " + this.edad;
    }
}
