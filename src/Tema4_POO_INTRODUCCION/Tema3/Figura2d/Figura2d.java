package Tema4_POO_INTRODUCCION.Tema3.Figura2d;

public abstract class Figura2d {
    public abstract double calculaArea();

    public abstract double calculaPerimetro();

    public String toString() {
        return "El area es :" + calculaArea() + "\n"
                +" el perimetro es " + calculaPerimetro();
    }
}
