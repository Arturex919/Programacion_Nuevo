package Tema4_POO_INTRODUCCION.Tema3.Vehiculo.animal;

import Tema4_POO_INTRODUCCION.Tema3.Vehiculo.Vehiculo;

class Camiones extends Vehiculo {
    private int pesoMaximo;
    private boolean esPeligroso;

    public Camiones(String tipo, String vehiculo, int numeroPlaza, int pesoMaximo, boolean esPeligroso) {
        super(tipo, vehiculo, numeroPlaza);
        this.pesoMaximo = pesoMaximo;
        this.esPeligroso = esPeligroso;
    }

    public int getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(int pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    public boolean isEsPeligroso() {
        return esPeligroso;
    }

    public void setEsPeligroso(boolean esPeligroso) {
        this.esPeligroso = esPeligroso;
    }
    public boolean menrcancia(String material) {
        if (material.equals(esPeligroso)){
            System.out.println("Es peligrosa");
            return true;
        }else{
            System.out.println("no es peligroso");
            return false;
        }
    }
}

