package Tema4_POO_INTRODUCCION.Tema3.Vehiculo;

class Ciclomotores extends Vehiculo {
    private int cilidrada;

    //llamas al padre

    public Ciclomotores(String tipo, String vehiculo, int cilidrada) {
        super(tipo, vehiculo);
        this.cilidrada = cilidrada;
    }

    public int getCilidrada() {
        return cilidrada;
    }

    public void setCilidrada(int cilidrada) {
        this.cilidrada = cilidrada;
    }

    public boolean necesitaCarnet() {
        if (cilidrada >= 125) {
            System.out.println("necestia un carnet");
            return true;
        } else {
            System.out.println("no lo necesita");
            return false;
        }
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("La cilindrada es de : "+cilidrada);
        System.out.println(necesitaCarnet());
    }
}