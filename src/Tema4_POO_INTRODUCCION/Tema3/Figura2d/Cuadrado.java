package Tema4_POO_INTRODUCCION.Tema3.Figura2d;

public class Cuadrado extends Figura2d {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calculaArea() {
        double resultado = lado * lado;
        return resultado;
    }

    @Override
    public double calculaPerimetro() {
        double resultado = 4 * lado;
        return resultado;
    }

    @Override
    public String toString() {
        return "El Lado del cuadrado es : " + lado + "\n"+
               super.toString();
    }
}
