package Tema8_accesoDB.EJERCICIOS2;

import Tema8_accesoDB.DBconexion;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio10 {
    public static void main(String[] args) throws SQLException, IOException {
        Connection conectado= DBconexion.conexion();
        String consulta = """
                    SELECT nombre,apellido,anyo_curso,fecha_nacimiento FROM estudiante 
                     ORDER BY fecha_nacimiento LIMIT 5
                                      """;

        Statement mensajero = conectado.createStatement();
        ResultSet result = mensajero.executeQuery(consulta);
        while (result.next()) {
            String nombre = result.getString("nombre");
            String apellido=result.getString("apellido");
            String year= result.getString("fecha_nacimiento");
            System.out.println("Estudiante: "+ nombre +" "+apellido +" - "+" fecha_nacimiento: "+year);
        }
    }
    }

