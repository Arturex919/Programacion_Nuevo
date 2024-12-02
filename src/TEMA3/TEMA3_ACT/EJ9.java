package TEMA3.TEMA3_ACT;

import java.util.Scanner;

public class EJ9 {
    //) Escribe un procedimiento que muestre por pantalla un triángulo como el
    //que hay a continuación. Recibirá 2 parámetros: el carácter y el número
    //de líneas del triángulo//
    public static void triangulo(char carac, int num){
        //este for es para la cantidad de lineas//
        for (int i=1;i<=num;i++){
            //num - i nos dice la cantidad de espacios que se deben imprimir en la fila actual.//
            //imprime los espacios para el triangulo//
            for (int e=1;e<=num-i;e++){
                System.out.print(" ");
            }
            //imprime el numero de caracter//
            for (int j=1;j<=2*i-1;j++){
                // Se usa para imprimir en la misma línea//
                System.out.print(carac);
            }
            // Se usa para imprimir en otra línea//
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num;
        char carac;
        System.out.println("dime el numero de lineas del triangulo");
        num= in.nextInt();
        System.out.println("ingresa el tipo de caracter para el triangulo");
        carac=in.next().charAt(0);
        triangulo(carac,num);
    }
}
