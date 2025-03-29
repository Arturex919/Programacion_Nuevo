package Tema_7_Ficheros.Ejercicios.Ejercicios3;

import java.io.Serializable;

public class Funko implements Serializable {
    private String cod;
    private String nombre;
    private String modelo;
    private double precio;
    private String fechaLanzamiento;

    public Funko(String cod, String nombre, String modelo, double precio, String fechaLanzamiento) {
        this.cod = cod;
        this.nombre = nombre;
        this.modelo = modelo;
        this.precio = precio;
        this.fechaLanzamiento = fechaLanzamiento;
    }

    //getter

    public String getCod() {
        return cod;
    }

    public String getNombre() {
        return nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public String getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    //setters


    public void setCod(String cod) {
        this.cod = cod;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setFechaLanzamiento(String fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    @Override
    public String toString() {
        return "Funko"+"\n"+
                "COD: "+cod+"\n"+
                "Nombre: "+nombre+"\n"+
                "Modelo: "+modelo+"\n"+
                "Precio: "+precio+"\n"+
                "Fecha de Lanzamiento: "+fechaLanzamiento;
    }
}
