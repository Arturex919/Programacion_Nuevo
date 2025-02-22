package Tema4_POO_INTRODUCCION.Tema3.Ficha;

public class Libro extends  Ficha{
    private String autor;
    private String editorial;
//contrustores
    public Libro() {
    }

    public Libro(String titulo, String autor, String editorial, int numero) {
        super(titulo, numero);//clase padre
        this.autor = autor;
        this.editorial = editorial;
    }
//getters y setters

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
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
