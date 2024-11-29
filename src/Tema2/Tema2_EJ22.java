package Tema2;

import java.util.Scanner;

public class Tema2_EJ22 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a,digitos=0;
        System.out.println("ingrese un numero");
        a= in.nextInt();
        while (a>0){
            a=a/10;
            digitos++;
        }
        System.out.println("el resultado es:" + digitos);

    }
}
