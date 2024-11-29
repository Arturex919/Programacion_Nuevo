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
        Scanner in = new Scanner(System.in);
        char opcion;
        do {
            showMenu();
            opcion = in.next().charAt(0);
            switch (opcion) {
                case 'a' -> {
                    System.out.println("inrese un numero");
                    int numero = in.nextInt();
                    if (EJ.numberSign(numero)>=1){
                        System.out.println("Es positivo");
                    } else if (EJ.numberSign(numero)==0) {
                        System.out.println("Es igual a cero");
                    }else {
                        System.out.println("Es negativo");
                    }

                }
                case 'b' -> {
                    System.out.println("ingresa tu edad");
                    int edad = in.nextInt();

                    if (EJ2.isAdult(edad)){
                        System.out.println("es mayor");
                    }else{
                        System.out.println("es menor");
                    }
                }
                case 'c' -> {
                    int radio;
                    do {
                        System.out.println("ingrese un radio");
                        radio = in.nextInt();
                        System.out.println(EJ3.calculateCiclePerimeter(radio));
                        System.out.println(EJ3.calculateCircleArea(radio));
                    }while (EJ3.validRadius(radio));
                }
                case 'd'->{
                    int cantidad;
                    System.out.println("Ingrese una cantidad");
                    cantidad= in.nextInt();
                }
                case 'j' -> {
                    System.out.println("adios");
                }
                default -> {
                    System.out.println("no vale");
                }
            }
        } while (opcion != 'j');

    }
}
