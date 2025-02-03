package POO_INTRODUCCION.CUENTAS;

import java.util.Scanner;

public class PruebaCuentas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Persona[] personas = new Persona[3];
        Cuenta[] cuentas = new Cuenta[3];
        int numPersona = 0;

        System.out.println("MENÚ DE CUENTAS BANCARIAS");
        System.out.println("1. Crear persona");
        System.out.println("2. Crear cuenta y asociarla a una persona");
        System.out.println("3. Mostrar datos de una persona");
        System.out.println("4. Abonar dinero a una cuenta");
        System.out.println("5. Pagar desde una cuenta");
        System.out.println("6. Transferir dinero entre cuentas");
        System.out.println("7. Mostrar personas morosas");
        System.out.println("8. Salir");
        System.out.print("Seleccione una opción: ");
        int opcion = in.nextInt();

        switch (opcion) {

            case 1 -> {

                if (numPersona < 3) {
                    System.out.println("Ingresa el dni");
                    String dni = in.nextLine();
                    personas[numPersona] = new Persona(dni);
                    numPersona++;
                } else {

                    System.out.println("limite maximo de personas");
                }
            }
            case 2->{

            }

        }

    }
}
