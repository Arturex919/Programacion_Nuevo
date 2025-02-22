package Tema4_POO_INTRODUCCION.Tema3.Ficha;

public class Libro extends  Ficha{
    private String autor;
    private String editorial;

    public Libro(String titulo, String autor, String editorial, int numero) {
        super(titulo, numero);//clase padre
        this.autor = autor;
        this.editorial = editorial;
    }

    @Override
    public void informacion() {
        System.out.println("Libro: "+titulo+"\n"+
                "Autor: "+autor+"\n"+
                "Editorial: "+editorial+"\n"
                +"Numero: "+numero);
    }
}
