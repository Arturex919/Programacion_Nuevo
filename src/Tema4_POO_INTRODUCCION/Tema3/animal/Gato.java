package Tema4_POO_INTRODUCCION.Tema3.animal;

   class Gato extends Animal {

       public Gato(String nombre) {
           super(nombre);
       }

       @Override
       public void hacerRuido() {
           System.out.println(getNombre()+ " miau! miauuu");
       }

       public void afilarGarra(){
           System.out.println(getNombre() +" se esta afilando las garras");
           System.out.println( " * sonido afilando las garras *");
       }
   }
