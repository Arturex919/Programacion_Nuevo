package Tema_7_Ficheros.Ejercicios.Ejercicios3;

import java.io.Serializable;
import java.time.LocalDate;

public class Funko implements Serializable {
    private String cod;
    private String nombre;
    private String modelo;
    private double precio;
    private LocalDate fechaLanzamiento;//la cambiamos para guardar la fecha

    public Funko(String cod, String nombre, String modelo, double precio, LocalDate fechaLanzamiento) {
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

    public LocalDate getFechaLanzamiento() {
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

    public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    // Método para convertir el objeto a formato CSV
    public String toCSV() {
        return cod + "," + nombre + "," + modelo + "," + precio + "," + fechaLanzamiento;
    }
    // Método para crear un Funko a partir de una línea CSV
    public static Funko fromCSV(String csvLine) {
        String[] values = csvLine.split(",");//es para separa el csv
        //le das los valores para que se convierta en un funko
        return new Funko(values[0], values[1], values[2], Double.parseDouble(values[3]), LocalDate.parse(values[4]));
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
    //lo hacemos para que no se repita en el csv y solo nos salga una vez
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Funko funko = (Funko) obj;
        return cod.equals(funko.cod);
    }
}
