package Tema4_POO_INTRODUCCION.Tema3.EJ2_Animal;

class Pajaro extends Animal {

    public Pajaro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerRuido() {
        System.out.println(getNombre() + " pio pio ");
    }

    public void volar() {
        System.out.println(getNombre() + " empieza a volar ");
    }
}
