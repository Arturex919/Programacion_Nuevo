package Tema4_POO_INTRODUCCION.Tema3.Ficha;

class Revista extends Ficha {
    private int numeroPublicacion;
    private int year;

    public Revista(String titulo, int numero, int numeroPublicacion, int year) {
        super(titulo, numero);
        this.numeroPublicacion = numeroPublicacion;
        this.year = year;
    }

    @Override
    public void informacion() {
        System.out.println("Libro: " + titulo + "\n" +
                "numero de publicacion: " + numeroPublicacion + "\n" +
                "Año: " + year + "\n"
                + "Numero: " + numero);
    }
}
