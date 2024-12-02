package TEMA3.TEMA3_ACT;

import java.util.Scanner;

public class EJ {
    //Crea un programa que pida un número por consola y nos indique si es
    //positivo, negativo o 0. Para ello implementa la función numberSign que
    //devuelve 0, 1 o -1 dependiendo de si el número que recibe como
    //parámetro es 0, positivo o negativo.//
    public static int numberSign(int numero){
        if (numero>0){
            return 1; // si es mayor a 0 nos devuelve 1
        } else if (numero < 0) {
            return -1;  // si es menor a 0 nos devuelve -1
        }else {
            return 0;  // si es igual a 0 nos devuelve 0
        }
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num;
        System.out.println("ingrese un numero");
        num = in.nextInt();
        int res=numberSign(num);

        if (res ==1){
            System.out.println("su numero  es positivo");
        } else if (res == -1) {
            System.out.println("su numero  es negativo");
        } else {
            System.out.println("su numero  es cero");
        }
    }
}
