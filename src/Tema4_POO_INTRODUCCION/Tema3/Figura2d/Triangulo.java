package Tema4_POO_INTRODUCCION.Tema3.Figura2d;

 class Triangulo extends Figura2d {
     private double base, altura;

     public Triangulo(double base, double altura) {
         this.base = base;
         this.altura = altura;
     }

     @Override
     public double calculaArea() {
         double result=(base*altura)/2;
         return result;
     }

     @Override
     public double calculaPerimetro() {
         double result=base+base+base;
         return result;
     }

     @Override
     public String toString() {
         return  "La base del triangulo es: "+base+ "\n"+
                 "La altura del triangulo es: "+altura+
                 "\n"+super.toString();
     }
 }
