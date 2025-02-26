package Tema4_POO_INTRODUCCION.Tema3.EJ4_Ficha;

public class DVD extends Ficha {
    private String director;
    private int year;
    private String tipo;

    public DVD() {
        super();
    }

    public DVD(String titulo, int numero, String director, int year, String tipo) {
        super(titulo, numero);
        setDirector(director);
        setYear(year);//cambias el this por el set para valida el año bien
        setTipo(tipo);
    }

    //getter
    public String getDirector() {
        return director;
    }

    public int getYear() {
        return year;
    }

    public String getTipo() {
        return tipo;
    }

    //setters
    public void setDirector(String director) {
        if (director.isEmpty()) {
            System.out.println("añade un director valido ");
        }
        this.director = director;
    }

    public void setYear(int year) {
        if (year <= 0) {
            System.out.println("Introduce un año válido.");
        } else {
            this.year = year;
        }
    }

    public void setTipo(String tipo) {
        if (tipo.isEmpty()) {
            System.out.println("Añade un tipo de dvd valido");
        } else {
            this.tipo = tipo;
        }
    }

    @Override
    public void informacion() {
        System.out.println("Libro: " + titulo + "\n" +
                "Numero: " + numero + "\n" +
                "Director: " + director + "\n" +
                "Año: " + year + "\n" +
                "Tipo de pelicula: " + tipo);
    }
}

