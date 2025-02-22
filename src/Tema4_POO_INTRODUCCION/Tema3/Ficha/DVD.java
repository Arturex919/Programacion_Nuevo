package Tema4_POO_INTRODUCCION.Tema3.Ficha;

public class DVD extends Ficha {
    private String director;
    private int year;
    private String tipo;

    public DVD(String titulo, int numero, String director, int year, String tipo) {
        super(titulo, numero);
        this.director = director;
        this.year = year;
        this.tipo = tipo;
    }

    @Override
    public void informacion() {
        System.out.println("Libro: " + titulo + "\n" +
                "Numero: " + numero + "\n" +
                "Director: " + director + "\n" +
                "Año: " + year+"\n"+
                "Tipo de pelicula: "+tipo);
    }
}

