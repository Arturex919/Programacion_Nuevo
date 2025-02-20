package Tema4_POO_INTRODUCCION.Tema3.Vehiculo.animal;

import Tema4_POO_INTRODUCCION.Tema3.Vehiculo.Vehiculo;

class Turismo extends Vehiculo {
    private String tipo;
    public Turismo(String tipo, String vehiculo, int numeroPlaza) {
        super(tipo, vehiculo, numeroPlaza);
    }

    public String toString() {
        super.muestraCoche();
        return "Tipo de uso: " + tipo;
    }
}
