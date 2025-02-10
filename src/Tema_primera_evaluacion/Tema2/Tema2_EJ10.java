package Tema_primera_evaluacion.Tema2;

import java.util.Scanner;

public class Tema2_EJ10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;

        System.out.println("ingrese un numero ");
        a = in.nextInt();
        System.out.println("ingrese un numero");
        b = in.nextInt();
        System.out.println("ingrese un valor ");
        c = in.nextInt();
        if (a<=b && b<=c){
           System.out.println("los numeros estan ordenados");
        }else{
           System.out.println("los numeros no estan ordenados");
        }
        in.close();
    }
}


