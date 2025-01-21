package Strings;

public class Ej1 {
    public static String masGrande(String palabra) {
        String[] palabra1 = palabra.split("\\s+");//nos divide por espacios en blanco
        String palabraLarga = ""; //busca la palabra larga ;
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra1[i].length() > palabraLarga.length()) {
                palabraLarga = palabra1[i];
            }
        }
        return palabraLarga;

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
    public static void main(String[] args) {
        String texto = "El lenguaje de programación Java es increíble";
        String resultado = masGrande(texto);
        System.out.println("La palabra de mayor longitud es: \"" + resultado + "\"");
    }
}