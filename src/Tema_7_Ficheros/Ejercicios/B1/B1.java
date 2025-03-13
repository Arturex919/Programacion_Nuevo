package Tema_7_Ficheros.Ejercicios.B1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class B1 {
    public static void main(String[] args) throws IOException {
        String filename = "Documentos/numeros.txt";//guardas la direccion en la variable
        String leeLineas;
        int numero_max = Integer.MIN_VALUE;//el valor maximo va a iniciar el valor minimo posible
        int numero_min = Integer.MAX_VALUE;//el valor mimnimo vas a iniciar el valor maximo posible/

        try {
            try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
                //ojo pon doble parentesis siempre
                while ((leeLineas= br.readLine())!=null){//va a leer linea por linea hasta que sea distinta a null
                    int num=Integer.parseInt(leeLineas);//conviertes de String a entero
                    if (num>numero_max)
                        numero_max=num;

                    if (num<numero_min)
                        numero_min=num;
                }
                System.out.println("El numero mayor es: "+numero_max);
                System.out.println("El numero menor es: "+numero_min);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
        System.out.println("Error: el archivo contiene un valor no numérico.");
    }
    }
}
