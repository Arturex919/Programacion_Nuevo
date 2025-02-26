package Tema4_POO_INTRODUCCION.Tema3.EJ4_Ficha;

class Revista extends Ficha {

    private int numeroPublicacion;
    private int year;

    public Revista() {
    }

    public Revista(String titulo, int numero, int numeroPublicacion, int year) {
        super(titulo, numero);
        setNumeroPublicacion(numeroPublicacion);
        setYear(year);
    }

    public int getNumeroPublicacion() {
        return numeroPublicacion;
    }

    public void setNumeroPublicacion(int numeroPublicacion) {
        if (numeroPublicacion <= 0) {
            System.out.println("añade un numero de publicacion  valida");
        } else {
            this.numeroPublicacion = numeroPublicacion;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year <= 0) {
            System.out.println("Introduce un año válido.");
        } else {
            this.year = year;
        }
    }

    @Override
    public void informacion() {
        System.out.println("Libro: " + titulo + "\n" +
                "numero de publicacion: " + numeroPublicacion + "\n" +
                "Año: " + year + "\n"
                + "Numero: " + numero);
    }
}
