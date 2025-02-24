package Tema4_POO_INTRODUCCION.Tema3.Figura2d;

class Rectangulo extends Figura2d {
    private double base, altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calculaArea() {
        double result = base * altura;
        return result;
    }

    @Override
    public double calculaPerimetro() {
        double result = 2* base + 2* altura;
        return result;
    }

    @Override
    public String toString() {
        return "La base del rectangulo es: " + getBase() + "\n" +
                "La altura del rectangulo es: " + getAltura() +
                "\n" + super.toString();
    }
}
