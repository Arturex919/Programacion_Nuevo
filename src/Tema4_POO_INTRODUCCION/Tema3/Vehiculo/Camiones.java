package Tema4_POO_INTRODUCCION.Tema3.Vehiculo;

class Camiones extends Vehiculo {
    private double pesoMaximo;
    private boolean esPeligroso;

    public Camiones(String marca, String color, double pesoMaximo, boolean esPeligroso) {
        super(marca, color);
        this.pesoMaximo = pesoMaximo;
        this.esPeligroso = esPeligroso;
    }

    public double getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(double pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    public boolean isEsPeligroso() {
        return esPeligroso;
    }

    public void setEsPeligroso(boolean esPeligroso) {
        this.esPeligroso = esPeligroso;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("El peso maximo es de: "+pesoMaximo);
        System.out.println("Mercancia peligrosa: "+(esPeligroso ? "si":"no"));
    }
}



