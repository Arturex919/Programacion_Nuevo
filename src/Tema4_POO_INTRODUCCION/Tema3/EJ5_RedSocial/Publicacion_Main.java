package Tema4_POO_INTRODUCCION.Tema3.EJ5_RedSocial;

import Tema4_POO_INTRODUCCION.Tema3.EJ6_PublicacionReaccion.Reaccion;

import java.util.Scanner;

public class Publicacion_Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Añade tu publicacion");
        String text=in.nextLine();
        PublicacionTexto publicacionTexto=new PublicacionTexto(text);
        publicacionTexto.iPublicar();
        publicacionTexto.iCompartir();
        System.out.println("");
        PublicacionFoto foto=new PublicacionFoto("Mapache.jpg");
        foto.iPublicar();
        foto.iCompartir();
        foto.iAbrir();
        System.out.println("");
        PublicacionVideo video=new PublicacionVideo("Mapache.mp4");
        video.iPublicar();
        video.iCompartir();
        video.iAbrir();
        System.out.println("");
        Reaccion textosComentarios=new Reaccion("me encanta \uD83E\uDEF0","Los mapaches son los mejor","los mapaches son los mejor");
        textosComentarios.iReacciona();
        textosComentarios.iCometar();
        textosComentarios.iCompartir();

    }

}
