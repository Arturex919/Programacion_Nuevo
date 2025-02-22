package Tema4_POO_INTRODUCCION.Tema3.Vehiculo;

public class Vehiculo {

    private String marca;
    private String color;
    // contrustores

    public Vehiculo(String marca, String color) {
        this.marca = marca;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void mostrarDatos() {
        System.out.println("Color: " + color);
        System.out.println("Marca: " + marca);
    }
}

