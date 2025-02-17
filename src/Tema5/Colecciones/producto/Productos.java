package Tema5.Colecciones.producto;

import java.util.Objects;

public class Productos {
    private String nombre;


    public Productos(String nombre) {
        this.nombre = nombre;
    }
    //get
    public String getNombre() {
        return nombre;
    }
    //set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    //si no sobreescribes el codigo no funciona
    // Sobrescribir equals para comparar productos por su nombre de manera
    //no lo usas en la clase Carrito, ni en el ejer 1 ni 4
    public boolean equals(Object  objeto) {
        Productos producto=(Productos) objeto;
        return nombre.equalsIgnoreCase(producto.nombre);  // Comparamos los nombres ignorando mayúsculas/minúsculas
    }

    public int hashCode() {
        return Objects.hash(nombre.toLowerCase());
    }

    public String toString() {
        return nombre;
    }
}
/*
si necesitas compara objetos usa esto
if (this == objeto) return true;
 if (objeto == null || getClass() != objeto.getClass()) return false;*/
