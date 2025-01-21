package Strings;

public class Ej1 {
    //Una función que reciba una cadena y devuelva la palabra de
    //mayor longitud
    public static String masGrande(String palabra) {
        String[] palabraBusqueda = palabra.split("\\s+");//nos divide por espacios en blanco
        String palabraLarga = ""; //busca la palabra larga ;

        //(palabraBusquedad)usas la palabra donde guardas el array la palabra mas grande
        for (int i = 0; i < palabraBusqueda.length; i++) {

            if (palabraBusqueda[i].length() > palabraLarga.length()) {
                palabraLarga = palabraBusqueda[i];
            }
        }
        return palabraLarga;
    }

    //Una función que reciba dos cadenas y devuelva el número de
    //veces que la segunda cadena está incluida en la primera.
    public static int cadena(String palabra, String palabra2) {
        int cont = 0;
        int repite = 0;

        while ((repite = palabra.indexOf(palabra2, repite)) != -1) {
            cont++;
            cont += palabra2.length();
        }
        return cont;
    }

    public static void main(String[] args) {
        String palabra = "hola pepe vas a jugar pelota ";
        String text = masGrande(palabra);
        System.out.println(text);
    }
}
    /* Revisar
    String[] masLarga = palabra.split("\\s+");//se en carga de dividir por espacios en blancos
            String buscaPalabra = ""; //busca la palabra mas larga

            for (int i = 0; i < palabra.length(); i++) {
                if (masLarga[i].length() > buscaPalabra.length()) {
                    buscaPalabra = masLarga[i];
                }
            }
            return buscaPalabra;
        }
    */