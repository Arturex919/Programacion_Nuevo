package Tema4_POO_INTRODUCCION.Tema3.EJ3_Figura2d;

public class Cuadrado extends Rectangulo {

    public Cuadrado(double base, double altura) {
        super(base, altura);
    }


    public String toString(){
        return  "El lado del cuadro es = "+getBase()+"\n"+
                "El area del cuadro es = "+calculaArea()+"\n"+
                "El perimetro del cuadro es = "+calculaPerimetro();
    }
}

