package Tema_primera_evaluacion.Tema2;

import java.util.Scanner;

public class Tema2_EJ7 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a,b,mayor,c ;
        System.out.println(" escribir un numero entero a ");
        a= in.nextInt();
        System.out.println("escrbir un numero entero b");
        b= in.nextInt();
            mayor=a;
            if (b>mayor){
                mayor=b ;}
            c= mayor-b;
        System.out.println("su numero mayor es= "+mayor);
        System.out.println("el resultado es : "+c);
        in.close();

        }
    }

