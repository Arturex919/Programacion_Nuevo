package Tema3;

import java.util.Scanner;

public class EJ10 {
    //)Escribe un programa que muestre un menú con 9 opciones (si tus
    //ejercicios son modulares no debería costarte demasiado):
    //a) Muestra el signo de un número introducido por el usuario.
    //b) Indica si el usuario es mayor de edad o no.
    //c) Calcula el área y perímetro de un círculo.
    //d) Conversor de euros a dólares y de dólares a euros.
    //e) Mostrar tabla de multiplicar de un número.
    //f) Mostrar tablas de multiplicar del 1 al 10.
    //g) Comprobador de números primos.
    //h) Comprobador de fechas.
    //i) Dibujar triángulos.//
    public static void showMenu() {
        System.out.println("Menu Principal ");
        System.out.println("a) Muestra el signo de un número introducido por el usuario.");
        System.out.println("b) Indica si el usuario es mayor de edad o no.");
        System.out.println("c)Calcula el área y perímetro de un círculo.");
        System.out.println("d) Conversor de euros a dólares y de dólares a euros.");
        System.out.println("e) Mostrar tabla de multiplicar de un número.");
        System.out.println("f) Mostrar tablas de multiplicar del 1 al 10.");
        System.out.println("g) Comprobador de números primos.");
        System.out.println("h) Comprobador de fechas.");
        System.out.println("i) Dibujar triángulos.");
        System.out.println("j) Salir");
        System.out.println("Seleccione una opcion");
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        char opcion;
        do {
            showMenu();
            opcion=in.next().charAt(0);
            switch (opcion) {
                case  'a' ->{
                    System.out.println("inrese un numero");
                    int numero= in.nextInt();
                    System.out.println(EJ.numberSign(numero));
                }
                case  'b'->{

                }
                case 'j'->{
                    System.out.println("adios");
                }
                default -> {
                    System.out.println("no vale");
                }
            }
        }
        while (opcion!='j');
    }
}
