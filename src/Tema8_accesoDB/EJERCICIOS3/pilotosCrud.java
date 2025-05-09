package Tema8_accesoDB.EJERCICIOS3;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class pilotosCrud {
    public static void main(String[] args) throws SQLException, IOException {
        Scanner in=new Scanner(System.in);
        Connection conn=conexionPilotosdb.conexion();
        int opcion;
        do {
            showMenu();
            opcion = in.nextInt();

            switch (opcion) {
                case 1 -> {

                }
            }
        }while (opcion!=8);
    }
    public static void showMenu(){
        System.out.println("======MENU======\n" +
              "Selecciona una opcion"+"\n"+
                "1. Crea un Piloto"+"\n" +
                "2. Leer un Piloto" +"\n" +
                "3. Leer los Pilotos" + "\n" +
                "4. Actualiza Pilotos"+"\n" +
                "5. Borra piloto"+ "\n" +
                "6. Ver la clasificacion de los pilotos"+ "\n"+
                "7. Ver a lo clasificacion constructores"+"\n"+
                "8. Salir");
    }
    public static void

}
