package Tema5.Excepciones;

import java.util.ArrayList;
import java.util.IllegalFormatException;
import java.util.Scanner;

public class ListGatoMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Gato> gato = new ArrayList<>();
        int cont = 0;
        while (cont < 5) {
            try {
                System.out.println("ingresa un nombre");
                String nombre = in.nextLine();
                Gato gato1 = new Gato();

                gato1.setNombre(nombre);
                System.out.println("ingresa una edad");
                int edad = in.nextInt();
                gato1.setEdad(edad);
                gato.add(gato1);//añades el gato
                cont++;
                System.out.println("Gato creado correctamente.");

            } catch (IllegalFormatException e) {
                System.out.println("errooor");

            } catch (Exception e) {
                System.out.println("Error: ingresa un formato valido");
            }
        }
        //muestra a lo gatos
        System.out.println("Lista de Gatos registrados:");
        for (Gato gatico : gato) {
            System.out.println(gatico.toString());
        }

    }
}
