package Tema4_POO_INTRODUCCION.Tema3.EJ2_Animal;

 class Perro extends Animal{

     public Perro(String nombre) {
         super(nombre);
     }

     @Override
     public void hacerRuido() {
         System.out.println(getNombre() +" Guau guau!");
     }
     public void cuidar(){
         System.out.println(getNombre()  +" * Atento y en guardia * ");
     }
 }
