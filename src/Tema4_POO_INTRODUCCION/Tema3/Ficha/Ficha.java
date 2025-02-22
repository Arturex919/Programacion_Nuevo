package Tema4_POO_INTRODUCCION.Tema3.Ficha;

public abstract class Ficha {
    protected String titulo;
    protected int numero;
    //siempres llamas a los constructores

    public Ficha() {
    }

    public Ficha(String titulo, int numero) {
        this.titulo = titulo;
        this.numero = numero;
    }
//getters y setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    //creas el metodo abstracto
    public  abstract  void informacion();

}
