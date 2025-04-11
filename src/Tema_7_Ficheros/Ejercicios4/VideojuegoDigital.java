package Tema_7_Ficheros.Ejercicios4;

public class VideojuegoDigital extends Videojuego{
protected String tiendaOnline;
protected double tamanioGB;

    public VideojuegoDigital(String titulo, String plataforma, String tipo, int nota, String tiendaOnline, double tamanioGB) {
        super(titulo, plataforma, tipo, nota);
        this.tiendaOnline = tiendaOnline;
        this.tamanioGB = tamanioGB;
    }
}
