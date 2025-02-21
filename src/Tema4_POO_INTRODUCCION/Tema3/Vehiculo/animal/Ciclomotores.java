package Tema4_POO_INTRODUCCION.Tema3.Vehiculo.animal;

import Tema4_POO_INTRODUCCION.Tema3.Vehiculo.Vehiculo;

class Ciclomotores extends Vehiculo {
    private int cilidrada;
    //llamas al padre

    public Ciclomotores(boolean carnet, int cilidrada) {
        this.cilidrada = cilidrada;
    }

    public Ciclomotores(String tipo, String vehiculo, int numeroPlaza, int cilidrada) {
        super(tipo, vehiculo, numeroPlaza);
        this.cilidrada = cilidrada;
    }

    public int getCilidrada() {
        return cilidrada;
    }

    public void setCilidrada(int cilidrada) {
        this.cilidrada = cilidrada;
    }

    public boolean necesitaCarnet(){
        if (cilidrada >125){
            System.out.println("si necesita carnet para andar");
            return true;
        }else{
            System.out.println("NO lo necesita");
            return false;
        }
    }

    public String toString(){
        return "La cilindrada de su cliclomotor es :"+getCilidrada();
    }
}
