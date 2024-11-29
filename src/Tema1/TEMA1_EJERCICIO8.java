package Tema1;

import java.util.Scanner;
public class TEMA1_EJERCICIO8 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in) ;
        System.out.println("escriba un valor para a");
        int a = in.nextInt();
        System.out.println("escriba un valor para b");
        int b=in.nextInt();
        if (a==b) {
            System.out.println("Los numeros son iguales ");
        }else if (a>b){
            System.out.println("EL mayor es "+a);
        }else {
            System.out.println("El mayor es "+b);
        }
    }
}
