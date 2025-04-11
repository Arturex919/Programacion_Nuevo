package Tema_7_Ficheros.Ejercicios4;

public class VideojuegoFisico extends Videojuego {
    private String tiendaCompra;
     private String estado;

    public VideojuegoFisico(String titulo, String plataforma, String tipo, int nota, String tiendaCompra, String estado) {
        super(titulo, plataforma, tipo, nota);
        this.tiendaCompra = tiendaCompra;
        this.estado = estado;
    }
}
