package Tema8_accesoDB.EJERCICIOS2;

import Tema8_accesoDB.DBconexion;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio7 {
    public static void main(String[] args) throws SQLException, IOException {
        Connection conectado = DBconexion.conexion();

        if (conectado!=null) {
            String consulta = """
                    SELECT nombre, apellido FROM estudiante WHERE apellido LIKE 'P%';
                                      """;
            Statement mensajero = conectado.createStatement();
            ResultSet result = mensajero.executeQuery(consulta);
            while (result.next()) {
                String nombre = result.getString("nombre");
                String apellido=result.getString("apellido");

                System.out.println("Estudiante: "+ nombre +" "+apellido );
            }
        }
    }
}

