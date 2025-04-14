package Tema_7_Ficheros.Ejercicios4;

public class VideojuegoDigital extends Videojuego implements IJugable{
protected String tiendaOnline;
protected double tamanioGB;

    public VideojuegoDigital(String titulo, String plataforma, int nota, String tiendaOnline, double tamanioGB) {
        super(titulo, plataforma, nota);
        this.tiendaOnline = tiendaOnline;
        this.tamanioGB = tamanioGB;
    }

    @Override
    public String getTipo() {
        return "Digital";
    }
    @Override
    public String toString() {
        return super.toString() +
                ", Tienda Online: " + tiendaOnline +
                ", Tamaño: " + tamanioGB + " GB";
    }

    @Override
    public void JugarDemo() {
        System.out.println("Jugando demo del juego Digital: " + getTitulo());

    }
}
