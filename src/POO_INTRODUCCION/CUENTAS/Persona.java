package POO_INTRODUCCION.CUENTAS;

import POO_INTRODUCCION.Cuentas;

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
        System.out.println("el numero del dni es : " + getDni());
        System.out.println("el numero de usuario es : " + numeroCuenta);
        return "";
    }

    public boolean aniadirCuenta(Cuenta cuenta) {
        int numeroCUneta = 0;
        if (numeroCuenta < 3) {
            this.cuentas[numeroCuenta] = cuenta;
            numeroCuenta++;
            System.out.println("La cuenta del numero DNI : " + getDni());
            System.out.println(" el numero de la cuenta: " + cuenta);
            System.out.println("La cuenta fue añadida exitosamente");
            return true;
        }
        return false;

    }

    public boolean esMoroso() {

        for (int i = 0; i < numeroCuenta; i++) {//recorre todas la cuentas
            if (cuentas[i].getSaldo() < 0) {//si es menor a cero
                System.out.println("Error tiene una cuenta con un saldo insuficiente");
                return true;
            }
        }
        return false;
    }
}
