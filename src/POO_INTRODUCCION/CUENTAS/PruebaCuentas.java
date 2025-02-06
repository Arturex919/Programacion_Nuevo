package POO_INTRODUCCION.CUENTAS;

import java.util.Scanner;

public class PruebaCuentas {
    public static boolean check(String dni){
        if (dni.length() !=9){//si es disntito a 9 digitos nos dara error
            System.out.println("Numero invalido,ingresa un numero valido");
            return false;
        }
        for (int i = 0; i < 8; i++) {//recorre los numeros
            if (!Character.isDigit(dni.charAt(i))){
                System.out.println("Los primeros 8 caracteres deben ser dígitos.");
                return false;
            }
        }
        char letra = dni.charAt(8);
        if (!Character.isLetter(letra)) {
            System.out.println("El último carácter debe ser una letra.");
            return false;
        }

        return true;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Persona[] personas = new Persona[3];
        Cuenta[] cuentas = new Cuenta[3];
        int numPersona = 0;
        int opcion;
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
         opcion = in.nextInt();
         in.nextLine();

        switch (opcion) {

            case 1 -> {
               do{
                    if (numPersona < 3) {
                        System.out.println("Ingresa el DNI:");
                        String dni = in.nextLine();

                        // Check if the DNI is valid first
                        if (check(dni)) {
                            personas[numPersona++] = new Persona(dni);
                            System.out.println("Su DNI es válido.");
                        } else {
                            System.out.println("Corrija su DNI.");
                        }
                    }
               } while (numPersona < 3);

                System.out.println("Límite máximo de personas alcanzado.");
            }
            case 2->{
                System.out.println("Ingrese el DNI  del usuario");
                String dni=in.nextLine();
                Persona persona = null;
                

            }

        }

    }
}
