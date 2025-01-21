package Tema2;
import java.util.Scanner;
public class Tema2_EJ27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cantidad = 20;
        int cont = 0;
        int num = 2;
        System.out.println("sus primeros 20 numeros primos son:");
        while (cont < 20) {

            boolean esPrimo = true;

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        if (esPrimo){
            System.out.println(num);
            cont++;
        }
        num++;
    }
}
}