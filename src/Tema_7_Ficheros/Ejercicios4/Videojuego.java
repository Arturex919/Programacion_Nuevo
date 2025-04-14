package Tema_7_Ficheros.Ejercicios4;

import java.io.Serializable;

public abstract class Videojuego implements Serializable {
   private String titulo;
   private String plataforma;
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

    public int getNota() {
        return nota;
    }

    public void setNota(int nota)  {
       try {
           if (nota < 1 || nota > 10)
               System.out.println("La nota debe estar entre 1 y 10.");
       } catch (NotaInvalida e) {
           throw new RuntimeException(e);
       }
    }

    public Videojuego(String titulo, String plataforma , int nota) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.nota = nota;
    }

    public abstract String getTipo();
    @Override
    public String toString() {
        return "Título: " + titulo +
                ", Plataforma: " + plataforma +
                ", Nota: " + nota +
                ", Tipo: " + getTipo();
    }



}
