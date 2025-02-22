package Tema4_POO_INTRODUCCION.Tema3.Figura2d;

class Circulo extends Figura2d {
    private double radio;
    private double diametro;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calculaArea() {
        double result = Math.PI * Math.pow(radio,2);
        return result;
    }

    @Override
    public double calculaPerimetro() {
        double result = 2 * Math.PI * radio;
        return result;
    }

    @Override
    public String toString() {
        return "El radio del circulo es: " + radio +
                "\n" + super.toString();
    }
}
