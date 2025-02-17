package Tema4_POO_INTRODUCCION.CUENTAS;


public class Persona {

    private int numeroCuenta;
    private Cuenta[] cuentas;
    private String dni;

    public Persona() {
    }

    //const con parametros

    public Persona(String dni) {//solo ocupas el dni de la persona
        this.cuentas = new Cuenta[3];//especificas el numero de cuentas que hay ;
        this.numeroCuenta = 0;//inicializas con cero para que vaya contando las cuentas
        this.dni = dni;
    }
//getters

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getDni() {
        return dni;
    }

    //settes
    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    //metodos
    public Cuenta[] getCuentas() {
        return cuentas;
    }

    public String toString() {
        String result = "DNI: " + getDni() + "\n";
        result += "Número de cuentas: " + getNumeroCuenta() + "\n";

        // Muestra las cuentas asociadas
        for (int i = 0; i < getNumeroCuenta(); i++) {
            result += "Cuenta " + (i + 1) + ": " + cuentas[i].getNumeroCuenta() + "\n";
        }

        return result;
    }

    public boolean aniadirCuenta(Cuenta cuenta) {
        if (numeroCuenta < 3) { // Verifica si hay espacio para agregar una nueva cuenta
            this.cuentas[numeroCuenta] = cuenta;
            numeroCuenta++; // Aumenta el contador de cuentas
            System.out.println("La cuenta del número DNI: " + getDni());
            System.out.println("El número de la cuenta añadida: " + cuenta.getNumeroCuenta()); // Muestra el número de la cuenta añadida
            System.out.println("La cuenta fue añadida exitosamente");
            return true;
        }
        System.out.println("No se pueden agregar más cuentas. Límite alcanzado.");
        return false; // Si ya no hay espacio para más cuentas
    }

    //REVISAR EJEMPLO DE ANA
    public boolean transferencia(Cuenta cuentaOrigen, Cuenta cuentaDestino, double saldo) {
        // Verificar que ambas cuentas existen
        if (cuentaOrigen != null && cuentaDestino != null) {
            // Verificar si la cuenta de origen tiene saldo suficiente
            if (cuentaOrigen.getSaldo() >= saldo) {
                // Restar el saldo de la cuenta de origen
                cuentaOrigen.setSaldo(cuentaOrigen.getSaldo() - saldo);
                // Sumar el saldo a la cuenta de destino
                cuentaDestino.setSaldo(cuentaDestino.getSaldo() + saldo);

                System.out.println("Transferencia exitosa de $" + saldo + " desde la cuenta "
                        + cuentaOrigen.getNumeroCuenta() + " a la cuenta "
                        + cuentaDestino.getNumeroCuenta());
                return true;
            } else {
                System.out.println("Error: saldo insuficiente en la cuenta de origen.");
                return false;
            }
        } else {
            System.out.println("Error: una o ambas cuentas no existen.");
            return false;
        }
    }

    public boolean esMoroso() {

        for (int i = 0; i < numeroCuenta; i++) {//recorre todas la cuentas
            if (cuentas!=null && cuentas[i].getSaldo() < 0) {//si es menor a cero
                System.out.println("Error tiene una cuenta con un saldo insuficiente");
                return true;
            }
        }
        System.out.println("La persona con DNI " + dni + " no es morosa.");
        return false;
    }
}
