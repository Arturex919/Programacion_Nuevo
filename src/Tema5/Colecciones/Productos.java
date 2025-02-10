package Tema5.Colecciones;

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

    public boolean compara(Productos objeto) {
        if (this == objeto) return true;
        if (objeto == null || getClass() != objeto.getClass()) return false;
        Productos producto=(Productos) objeto;
        return Objects.equals(this.nombre.toLowerCase(), producto.nombre.toLowerCase());
    }
    @Override
    public int hashCode() {
        return Objects.hash(nombre.toLowerCase());
    }

    @Override
    public String toString() {
        return nombre;
    }
}

