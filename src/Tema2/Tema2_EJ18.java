package Tema2;

import java.util.Scanner;

public class Tema2_EJ18 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double a,b;
        System.out.println("Ingrese un numero");
        a= in.nextDouble();
      if (a>0){
          b=Math.sqrt(a);
          System.out.println("su raiz es igual= "+b);
      } else{
            System.out.println("errooor");
        }
      in.close();
    }
}