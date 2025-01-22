package Strings;

// Crea una clase CaesarCipher para implementar el cifrado de Julio César con
//tres funciones: encrypt (cifrar), decrypt (descifrar) y main. Julio César inventó
//un cifrado para evitar que los mensajes pudieran ser leídos por cualquier
//persona. El cifrado tiene las siguientes normas:
//- Todo mensaje debe tener sus letras en mayúsculas.
//- Se reemplaza cada letra por la siguiente del abecedario, excepto la Z
//que se reemplaza por la A.
//- Se reemplaza cada dígito por el siguiente dígito, excepto el 9 que se
//reemplaza por 0.
//- El resto de caracteres no se reemplazan.
public class CaesarCipher {
    public static String encrypt(String cifrado) {// el requisito va a un sting pq vas a coger llas plaabra de ahi
        char[] caracters = cifrado.toUpperCase().toCharArray();//crear el char para que la pabra se guarde y las separas en por letra
        for (int i = 0; i < caracters.length; i++) {//el for recorre la palabra y la separa
            char letra = caracters[i];//la guarda en la variable
            if (letra > 'A' && letra < 'Z' || letra > 'a' && letra < 'z') {//nos convierte en mayuscula o min
                if (letra == 'Z') {
                    caracters[i] = 'A';//Si es 'Z', se reemplaza con 'A'
                } else {
                    caracters[i] = (char) (letra + 1);//Si no es 'Z',avanza a la +1
                }
            } else if (letra >= '0' && letra <= '9') {
                if (letra == '9') {// Si es '9', se reemplaza con '0'
                    caracters[i] = '0';
                } else {
                    caracters[i] = (char) (letra + 1); // Si no es '9', se avanza al siguiente dígito
                }
            }
        }
        String cifra=new String(caracters);//creas una nueva vatiables del valor del for/array
        // para que guarde con new String ya que saliste del for
        return cifra;
    }
    public static String decrypt(String descifrado) {// el requisito va a un sting pq vas a coger llas plaabra de ahi
        char[] caracters2 = descifrado.toUpperCase().toCharArray(); // Convertir a mayúsculas y a un arreglo de caracteres

        for (int i = 0; i < caracters2.length; i++) {
            char letra = caracters2[i]; // Obtener el carácter actual

            // Si es una letra (A-Z)
            if (letra >= 'A' && letra <= 'Z') {
                if (letra == 'A') {
                    caracters2[i] = 'Z'; // Si es 'A', se reemplaza con 'Z'
                } else {
                    caracters2[i] = (char) (letra - 1); // Si no es 'A', se retrocede a la letra anterior
                }
            }
            // Si es un dígito (0-9)
            else if (letra >= '0' && letra <= '9') {
                if (letra == '0') {
                    caracters2[i] = '9'; // Si es '0', se reemplaza con '9'
                } else {
                    caracters2[i] = (char) (letra - 1); // Si no es '0', se retrocede al dígito anterior
                }
            }
            // Otros caracteres permanecen igual
        }

        return new String(caracters2);
    }

        public static void main(String[] args) {
        String text = "hola";
        String pepe=encrypt(text);
        String pepe2= decrypt(pepe);
        System.out.println(pepe);
        System.out.println(pepe2);
    }
}

