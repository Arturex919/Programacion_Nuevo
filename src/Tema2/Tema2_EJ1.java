package Tema2;
import java.util.Scanner;
//area y perimetro de un cuadrado
public class Tema2_EJ1 {
    public static void main(String[] args) {
        int lado, a, b;
        Scanner in = new Scanner(System.in);
        System.out.println("ingresa un valor para el cuadro");
        a = in.nextInt();
        lado = a * a;
        b = a + a + a + a;
        System.out.println("la superfice de un cuadrado es= " + lado);
        System.out.println("el perimetro de un cuadrado es= " + b);
        in.close();
    }
}

