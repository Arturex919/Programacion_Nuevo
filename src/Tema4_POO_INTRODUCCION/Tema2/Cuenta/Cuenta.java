package Tema4_POO_INTRODUCCION.Tema2.Cuenta;

public class Cuenta {
    private int numeroCuenta;
    private double saldo;

    //sin parametros


    public Cuenta() {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    //cons con parametros
    public Cuenta(int numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }
//set cuenta
    //get
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {//devuleve el saldo
        return saldo;
    }

    //sett
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
//metodos

    //recibe el abono
    public  void abonos(double monto){

        if (monto>0){
            this.saldo+=monto;
            System.out.println("Le han abonado "+this.saldo+" a su cuenta");
        }else {
            System.out.println("Error en el abono");
        }
    }
    //paga los pagos
    public boolean pagos(double monto){

        if (monto >0 && monto <= saldo){

          //double pago =saldo-monto;
          this.saldo = this.saldo-monto;

            System.out.println("El total a pagar es: "+monto);
            System.out.println("");
            System.out.println("Pago de $" + monto + " realizado con éxito.");
            System.out.println("Su saldo actualizado es: "+this.saldo);
            return true;
        }else {
            System.out.println("Fondos insuficiente o monto invalido");
            return false;
        }

        }
    }

