package POO_INTRODUCCION.CUENTAS;

public class Persona {

    private int numeroCuenta;
    private Cuenta[] cuentas;
    private String dni;
//const con parametros
    public Persona(String dni) {//solo ocupas el dni de la persona
        this.cuentas = new Cuenta[3];//especificas el numero de cuentas que hay ;
        this.numeroCuenta = 0;//inicializas con cero para que vaya contando las cuentas
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }


//metodos

    public boolean añadirCuenta(Cuenta cuenta){

        if (numeroCuenta<3){
            this.cuentas[numeroCuenta]=cuenta;
            numeroCuenta++;
            System.out.println("Cuenta añadida exitosamente");
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
            i++;//busca a la siguiente cuenta
        }
        return false;
    }



}
