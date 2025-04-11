package Tema_7_Ficheros.Ejercicios4;

public class Videojuego {
   private String titulo;
   private String plataforma;
   private String tipo;
   private int nota;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Videojuego(String titulo, String plataforma, String tipo, int nota) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.tipo = tipo;
        this.nota = nota;
    }

    public static void getTipo(){
    }


}
