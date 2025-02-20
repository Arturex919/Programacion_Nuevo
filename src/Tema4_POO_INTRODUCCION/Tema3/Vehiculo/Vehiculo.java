package Tema4_POO_INTRODUCCION.Tema3.Vehiculo;

public class Vehiculo {

    private String tipo;
    private  String vehiculo;
    int numeroPlaza;
    // contrustores

    public Vehiculo() {
    }

    public Vehiculo(String tipo, String vehiculo, int numeroPlaza) {
        this.tipo = tipo;
        this.vehiculo = vehiculo;
        this.numeroPlaza = numeroPlaza;
    }
//getter

    public String getTipo() {
        return tipo;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public int getNumeroPlaza() {
        return numeroPlaza;
    }


//setters


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNumeroPlaza(int numeroPlaza) {
        this.numeroPlaza = numeroPlaza;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    //metodos
    public void muestraCoche(){
        System.out.println("El tipo de vehiculo es : "+getTipo()+"\n"+
                "\n"+ "la marca del vehiculo es"+getVehiculo()+"\n"+
                "con el numero de plazas"+numeroPlaza);
    }
}
