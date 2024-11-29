package Tema2;
import java.util.Scanner;

public class Tema2_EJ26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        boolean esPrimo=true;
        System.out.println("ingrese un numero");
        num = in.nextInt();
        for (int i = 2; i < num; i++) {
            if (num%i==0) {
                esPrimo = false;
            }
        }
        if (esPrimo){
            System.out.println(+num+" es primo");
        }else{
            System.out.println(+num+" no es primo");
        }
    }
}