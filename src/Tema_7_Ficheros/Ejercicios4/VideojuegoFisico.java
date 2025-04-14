package Tema_7_Ficheros.Ejercicios4;

public class VideojuegoFisico extends Videojuego implements IJugable {
    private String tiendaCompra;
     private String estado;


    public VideojuegoFisico(String titulo, String plataforma, int nota, String tiendaCompra, String estado) {
        super(titulo, plataforma, nota);
        this.tiendaCompra = tiendaCompra;
        this.estado = estado;
    }

    @Override
    public String getTipo() {
        return "Físico";
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Tienda: " + tiendaCompra +
                ", Estado: " + estado;
    }


    @Override
    public void JugarDemo() {
        System.out.println("Jugando demo del juego físico: " + getTitulo());
    }
}
