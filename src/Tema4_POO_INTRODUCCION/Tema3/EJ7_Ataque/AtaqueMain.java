package Tema4_POO_INTRODUCCION.Tema3.EJ7_Ataque;

import java.util.Scanner;

public class AtaqueMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        AtaqueMagico attackMagic=new AtaqueMagico("Mago",75,100,150,400,"bola de fuego");
        tipoAtaque(attackMagic);
        attackMagic.iCoste();
        attackMagic.iLanzar();
        attackMagic.iDaño();
        Ataquefisico hulk=new Ataquefisico(100,100,200,"hulk","aplasta",300);
        tipoAtaque(hulk);
        hulk.iCoste();
        hulk.iLanzar();
        hulk.iDaño();
        AtaqueMagicoFisico mixto=new AtaqueMagicoFisico(400,"lanzallamas",200,300,100,"jacinto");
        tipoAtaque(mixto);//llamas al metodo
        mixto.iCoste();
        mixto.iLanzar();
        mixto.iDaño();
    }
    //creas el metodo  para instaciar la interfas que
    // creaste y verficas que tipo de instacia es
    public static  void tipoAtaque(Ataque ataque){
        if (ataque instanceof AtaqueMagico){
            System.out.println("Ataque magico activado");
        } else if (ataque instanceof Ataquefisico) {
            System.out.println("Ataque fisico activado");
        } else if (ataque instanceof AtaqueMagicoFisico) {
            System.out.println("Ataque Mixto activado");
        }
    }
}
       /* int vida, ataque, defesa;
        int opcion;

        showMenu();
        opcion= in.nextInt();
        nombresAtaques(opcion);
    }
    public static void showMenu(){
        System.out.println("===MENU===");
        System.out.println("Escoje los ataque de tu personaje los ataques del personaje ");
        System.out.println(" Escoje un valor del 1 al 5");
        System.out.println("1. Lanzar bola de fuego");
        System.out.println("2. Ataque directo");
        System.out.println("3. Destello final");
        System.out.println("4. cullida");
        System.out.println("5. salir");
    }

    public static void nombresAtaques(int opcion) {
        boolean salir = false;

        switch (opcion) {
            case 1 -> {
                System.out.println("Lanzar bola de fuego");
            }
            case 2 -> {
                System.out.println("Ataque directo");
            }
            case 3 -> {
                System.out.println("Destello final");
            }
            case 4 -> {
                System.out.println("cullida");
            }
            case 5 -> {
                salir = true;
            }
            default -> {
                System.out.println("opcion no valida");
            }
        }
    }

    public static void attackMagic() {

*/



