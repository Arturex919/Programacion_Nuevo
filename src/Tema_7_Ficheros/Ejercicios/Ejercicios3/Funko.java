package Tema_7_Ficheros.Ejercicios.Ejercicios3;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

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
    public static Funko fromCSV(String csvLine) {
        String[] values = csvLine.split(",");

        try {
            String cod = values[0];
            String nombre = values[1];
            String modelo = values[2];
            double precio = Double.parseDouble(values[3]);  // Asegúrate de que el precio es un número válido
            LocalDate fechaLanzamiento = LocalDate.parse(values[4]);  // Asegúrate de que la fecha tenga el formato correcto

            return new Funko(cod, nombre, modelo, precio, fechaLanzamiento);//devuelve los funko
        } catch (NumberFormatException | DateTimeParseException e) {
            return null;
        }
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
