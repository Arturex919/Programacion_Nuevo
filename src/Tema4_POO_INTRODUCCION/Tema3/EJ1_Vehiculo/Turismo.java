package Tema4_POO_INTRODUCCION.Tema3.EJ1_Vehiculo;

class Turismo extends Vehiculo {
    private String tipo;
    private  int numeroPlaza;

    public Turismo(String marca, String color, String tipo, int numeroPlaza) {
        super(marca, color);
        this.tipo = tipo;
        this.numeroPlaza = numeroPlaza;
    }

    public int getNumeroPlaza() {
        return numeroPlaza;
    }

    public void setNumeroPlaza(int numeroPlaza) {
        this.numeroPlaza = numeroPlaza;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Tipo de uso: " + tipo);
        super.mostrarDatos();
        System.out.println("Número de plazas: " + numeroPlaza);
    }
}
