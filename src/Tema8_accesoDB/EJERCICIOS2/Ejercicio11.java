package Tema8_accesoDB.EJERCICIOS2;

import Tema8_accesoDB.DBconexion;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio11 {
    public static void main(String[] args) throws SQLException, IOException {
        Connection conectado= DBconexion.conexion();
        String consulta = """
                    SELECT e.nombre,e.apellido,a.nombre AS materia FROM estudiante e
                    JOIN Estudiante_Asignatura ea ON ea.id_estudiante=e.id_estudiante
                    JOIN Asignatura a ON a.id_asignatura=ea.id_asignatura
                    WHERE ea.calificacion >= 8 AND a.nombre ='Vuelo';
                                      """;

        Statement mensajero = conectado.createStatement();
        ResultSet result = mensajero.executeQuery(consulta);
        while (result.next()) {
            String nombre = result.getString("nombre");
            String apellido=result.getString("apellido");
            String curso = result.getString("materia");
            System.out.println("Estudiante: "+ nombre +" "+apellido +" - "+" materia: "+ curso);
        }
    }
}
