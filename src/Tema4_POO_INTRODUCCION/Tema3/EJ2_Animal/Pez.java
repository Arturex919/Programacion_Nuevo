package Tema4_POO_INTRODUCCION.Tema3.EJ2_Animal;

 class Pez extends Animal{

     public Pez(String nombre) {
         super(nombre);
     }

     @Override
     public void hacerRuido() {
         System.out.println(getNombre()+" glu glu glu");
     }
     public void nada(){
         System.out.println(getNombre() + " esta nadando ");
     }

 }
