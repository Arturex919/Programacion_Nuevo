package Tema4_POO_INTRODUCCION.Tema3.EJ4_Ficha;

public abstract class Ficha {
    protected String titulo;
    protected int numero;
    //siempres llamas a los constructores

    public Ficha() {
    }

    public Ficha(String titulo, int numero) {
        setTitulo(titulo);
        setNumero(numero);
    }
//getters y setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {

        if (titulo.isEmpty()) {
            System.out.println("Añade un titulo valido");
        } else {
            this.titulo = titulo;
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero <= -1) {
            System.out.println("el numero es no puede ser negativo");
        } else {
            this.numero = numero;
        }
    }

    //creas el metodo abstracto
    public abstract void informacion();

}
