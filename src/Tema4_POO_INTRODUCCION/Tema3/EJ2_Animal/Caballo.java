package Tema4_POO_INTRODUCCION.Tema3.EJ2_Animal;


 class Caballo extends Animal {

     public Caballo(String nombre) {
         super(nombre);
     }

     @Override
     public void hacerRuido() {
         System.out.println(getNombre()+" relincha: ¡Hiiiiii!");
     }

   public void Galopar(){
       System.out.println(getNombre()+" esta galopando rapido");
   }
 }
