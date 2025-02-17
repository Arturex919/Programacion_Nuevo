package Tema4_POO_INTRODUCCION.Tema2.Cuenta;

import java.util.Scanner;

public class PruebaCuentas {
    public static boolean check(String dni) {
        if (dni.length() != 9) {//si es disntito a 9 digitos nos dara error
            System.out.println("Numero invalido,ingresa un numero valido");
            return false;
        }
        for (int i = 0; i < 8; i++) {//recorre los numeros
            if (!Character.isDigit(dni.charAt(i))) {
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
        String dni;

        do {
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
                    System.out.println("¿Cuántas personas desea crear? (1, 2 o 3)");
                    int numCrear = in.nextInt();
                    in.nextLine(); // Consumir el salto de línea

                    if (numCrear < 1 || numCrear > 3) {
                        System.out.println("Número inválido. Solo puede crear entre 1 y 3 personas.");
                    } else {
                        for (int i = 0; i < numCrear; i++) {
                            if (numPersona < 3) { // Verifica que aún haya espacio en el array
                                System.out.println("Ingresa el DNI de la persona " + (numPersona + 1) + ":");
                                dni = in.nextLine();

                                if (check(dni)) { // Validamos el DNI antes de crear la persona
                                    personas[numPersona++] = new Persona(dni);
                                    System.out.println("Persona creada correctamente.");
                                } else {
                                    System.out.println("DNI inválido. Inténtalo de nuevo.");
                                    i--; // Decrementamos i para que vuelva a intentar
                                }
                            } else {
                                System.out.println("Límite máximo de personas alcanzado.");
                            }
                        }
                    }
                }


                case 2 -> {
                    System.out.println("Ingrese el DNI del usuario:");
                    dni = in.nextLine();

                    Persona persona = null;

                    // Buscar persona en el array
                    for (Persona personDentro : personas) {
                        if (personDentro != null && personDentro.getDni().equals(dni)) {
                            persona = personDentro;

                        }
                    }

                    if (persona != null) { // Si la persona fue encontrada
                        System.out.println("¿Cuántas cuentas desea crear? (1, 2 o 3)");
                        int numCuentas = in.nextInt();

                        // Validar que el número de cuentas esté dentro del rango permitido
                        if (numCuentas < 1 || numCuentas > 3) {
                            System.out.println("Número inválido. Solo puede crear entre 1 y 3 cuentas.");
                        } else {
                            int cuentasAgregadas = 0; // Contador de cuentas agregadas
                            for (int i = 0; i < numCuentas; i++) {
                                if (persona.getNumeroCuenta() < 3) { // Verifica que la persona no tenga ya 3 cuentas
                                    System.out.println("Ingrese el número de cuenta " + (i + 1) + ":");
                                    int numeroC = in.nextInt();

                                    double saldo = 0;

                                    // Intentas añadir la cuenta a la persona
                                    if (persona.aniadirCuenta(new Cuenta(numeroC, saldo))) {
                                        System.out.println("Cuenta creada correctamente.");
                                        cuentasAgregadas++;
                                    } else {
                                        System.out.println("Error: La persona ya tiene el máximo de 3 cuentas.");
                                    }
                                } else {
                                    System.out.println("Límite máximo de cuentas alcanzado para esta persona.");
                                }
                            }

                            if (cuentasAgregadas > 0) {
                                System.out.println("Se crearon " + cuentasAgregadas + " cuentas correctamente.");
                            } else {
                                System.out.println("No se pudo crear ninguna cuenta.");
                            }
                        }
                    } else {
                        System.out.println("Persona no encontrada. Verifique el DNI.");
                    }

                }
                case 3 -> {
                    System.out.println("Ingrese el DNI del usuario:");
                    dni = in.nextLine();

                    Persona persona = null;

                    // Buscar persona en el array
                    for (Persona personDentro : personas) {
                        if (personDentro != null && personDentro.getDni().equals(dni)) {
                            persona = personDentro;
                        }
                    }

                    if (persona != null) {
                        System.out.println("El DNI del usuario es: " + persona.getDni());

                        boolean tieneCuentas = false; // verifica si tiene cuentas

                        for (Cuenta cuenta : persona.getCuentas()) {
                            if (cuenta != null) {
                                System.out.println("Cuenta: " + cuenta.getNumeroCuenta() + " - Saldo: " + cuenta.getSaldo());
                                tieneCuentas = true;
                            }
                        }

                        if (!tieneCuentas) {
                            System.out.println("Esta persona no tiene cuentas asociadas.");
                        }

                    } else {
                        System.out.println("Persona no encontrada.");
                    }
                }
                case 4 -> {
                    System.out.println("ingresa el dni del usuario");
                    dni = in.nextLine();

                    Persona persona = null;
                    for (Persona personaDentro : personas) {
                        if (personaDentro != null && personaDentro.getDni().equals(dni)) {
                            persona = personaDentro;
                        }
                    }
                    if (persona != null) {//si encontraste a la persona
                        System.out.println("Ingrese el número de cuenta donde desea recibir la nómina:");
                        int numeroCuenta = in.nextInt();

                        Cuenta cuentaEncontrada = null;

                        // Buscar la cuenta dentro de las cuentas de la persona
                        for (Cuenta cuenta : persona.getCuentas()) {
                            if (cuenta != null && cuenta.getNumeroCuenta() == numeroCuenta) {
                                cuentaEncontrada = cuenta;
                            }
                        }
                        if (cuentaEncontrada != null) {
                            System.out.println("ingresa el monto de la nomina");
                            double monto = in.nextDouble();

                            cuentaEncontrada.abonos(monto);
                            System.out.println("Nómina de " + monto + " abonada a la cuenta " + numeroCuenta);
                        } else {
                            System.out.println("Número de cuenta no encontrado.");
                        }
                    } else {
                        System.out.println("Persona no encontrada.");
                    }
                }
                case 5 -> {
                    System.out.println("Ingrese el DNI del usuario:");
                    dni = in.nextLine();

                    Persona persona = null;

                    // Buscar persona en el array
                    for (Persona personDentro : personas) {
                        if (personDentro != null && personDentro.getDni().equals(dni)) {
                            persona = personDentro;
                        }
                    }

                    if (persona != null) { // Si la persona fue encontrada
                        System.out.println("Ingrese el número de cuenta desde donde desea pagar:");
                        int numeroCuenta = in.nextInt();
                        in.nextLine(); // Consumir salto de línea

                        Cuenta cuentaEncontrada = null;

                        // Buscar la cuenta dentro de las cuentas de la persona
                        for (Cuenta cuenta : persona.getCuentas()) {
                            if (cuenta != null && cuenta.getNumeroCuenta() == numeroCuenta) {
                                cuentaEncontrada = cuenta;
                            }
                        }

                        if (cuentaEncontrada != null) { // Si la cuenta fue encontrada
                            System.out.println("Ingrese el monto a pagar:");
                            double monto = in.nextDouble();

                            if (cuentaEncontrada.pagos(monto)) {//llamas al metodo para pagar  .


                                System.out.println("Pago de " + monto + " realizado desde la cuenta " + numeroCuenta);
                            } else {
                                System.out.println("Fondos insuficientes para realizar el pago.");
                            }
                        } else {
                            System.out.println("Número de cuenta no encontrado.");
                        }
                    } else {
                        System.out.println("Persona no encontrada.");
                    }
                }
                case 6 -> {
                    System.out.println("Ingrese el dni del usuario");
                    dni = in.nextLine();
                    Persona persona = null;

                    for (Persona personaDetro : personas) {
                        if (personaDetro != null && personaDetro.getDni().equals(dni)) {
                            persona = personaDetro;
                        }
                    }
                    if (persona != null) {
                        System.out.println("Cuentas disponibles para la transferencia:");
                        for (int i = 0; i < persona.getNumeroCuenta(); i++) {
                            Cuenta cuentaOrigen = persona.getCuentas()[i];
                            if (cuentaOrigen != null) {
                                System.out.println((i + 1) + ". Cuenta " + cuentaOrigen.getNumeroCuenta() + " - Saldo: " + cuentaOrigen.getSaldo());
                            }
                        }
                        // Opción de cuenta de origen
                        System.out.println("Selecciona tu cuenta de origen");
                        int opcCuentaOrigen = in.nextInt() - 1; // Se resta 1 para que el usuario seleccione correctamente la posición en el array

                        // Nos aseguramos de que la cuenta seleccionada sea válida y pertenezca al usuario
                        if (opcCuentaOrigen >= 0 && opcCuentaOrigen < persona.getNumeroCuenta()) {
                            Cuenta cuentaOrigen = persona.getCuentas()[opcCuentaOrigen]; // Guarda la cuenta seleccionada

                            // Selección de cuenta de destino
                            System.out.println("Selecciona una cuenta de destino:");
/*Haz una aplicación que permita crear una lista de la compra. Leerá por
consola varios productos y los guardará todos en un set. Si intentas guardar
dos veces el mismo producto te avisará que ya existe el producto.*/
                            // Mostramos las cuentas disponibles para transferencia (excepto la de origen)
                            for (int i = 0; i < persona.getNumeroCuenta(); i++) {
                                Cuenta cuentaPersonaF = persona.getCuentas()[i];
                                if (cuentaPersonaF != null && cuentaPersonaF != cuentaOrigen) {
                                    System.out.println((i + 1) + ". Cuenta " + cuentaPersonaF.getNumeroCuenta() + " - Saldo: " + cuentaPersonaF.getSaldo());
                                }
                            }

                            // Pedimos al usuario que seleccione la cuenta de destino
                            System.out.print("Ingrese la opción de la cuenta destino: ");
                            int opcionCuentaDestino = in.nextInt() - 1; // Se ajusta para coincidir con el índice del array
                            in.nextLine(); // Consumimos el salto de línea para evitar errores en la lectura

                            // Verificamos que la cuenta de destino sea válida y diferente de la de origen
                            if (opcionCuentaDestino >= 0 && opcionCuentaDestino < persona.getNumeroCuenta() && persona.getCuentas()[opcionCuentaDestino] != cuentaOrigen) {
                                Cuenta cuentaDestino = persona.getCuentas()[opcionCuentaDestino];

                                // Solicitamos el monto a transferir
                                System.out.println("Ingrese el monto a transferir:");
                                double monto = in.nextDouble();
                                in.nextLine(); // Consumimos el salto de línea nuevamente para evitar errores posteriores

                                // Realizamos la transferencia
                                persona.transferencia(cuentaOrigen, cuentaDestino, monto);
                            } else {
                                System.out.println("Cuenta de destino inválida.");
                            }
                        } else {
                            System.out.println("Cuenta de origen inválida.");
                        }

                    }
                }
                case 7 ->{
                    for(Persona person: personas){
                    if (person !=null && person.esMoroso()){
                        System.out.println("Dni"+person.getDni());
                    }
                }
            }
            case 8 ->{
                System.out.println("Saliendo");
                }
                default -> {
                    System.out.println("Opcion no valida");
                }
            }
        } while (opcion != 8);

    }
}
