package Tema8_accesoDB.EJERCICIOS2;

import Tema8_accesoDB.DBconexion;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio16 {
    public static void main(String[] args) throws SQLException, IOException {
        Connection conectado= DBconexion.conexion();
        String consulta = """
                    SELECT e.nombre,e.apellido,m.nombre AS mascota,a.nombre AS materia FROM estudiante e 
                     LEFT JOIN mascota m ON m.id_estudiante=e.id_estudiante
                     JOIN Estudiante_Asignatura ea ON ea.id_estudiante=e.id_estudiante
                     JOIN Asignatura a ON a.id_asignatura=ea.id_asignatura
                   
                                      """;

        Statement mensajero = conectado.createStatement();
        ResultSet result = mensajero.executeQuery(consulta);
        while (result.next()) {
            String nombre = result.getString("nombre");
            String apellido=result.getString("apellido");
            String mascota= result.getString("mascota");
            String materia=result.getString("materia");
            System.out.println("Estudiante: "+ nombre +" "+apellido +" - "+" mascota: "+mascota+" - "+
                    "Asigantura: "+materia);
        }
    }
    }

