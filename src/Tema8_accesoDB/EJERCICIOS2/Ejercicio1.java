package Tema8_accesoDB.EJERCICIOS2;


import Tema8_accesoDB.DBconexion;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio1 {
    public static void main(String[] args) throws SQLException, IOException {

            /*establecemos la conexion a nuestra de DB*/
            Connection connection = DBconexion.conexion();
            if (connection != null) {
                /*Escribimo la consulta que deseamos*/
                String consulta = "SELECT * FROM profesor";

                // el Statement es para que envie la consulta a la base de datos
                Statement mensajero = connection.createStatement();

                // Ejecuta y guarda la consulta
                ResultSet result = mensajero.executeQuery(consulta);

                // Recorrer los resultados
                while (result.next()) {
                    //obitiene el resultado en forma de string
                    String nombre = result.getString("nombre");
                    String apellido = result.getString("apellido");

                    System.out.println("Profesores: " + nombre + " " + apellido);
                }
            }

    }
}