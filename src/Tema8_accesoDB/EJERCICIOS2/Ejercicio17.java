package Tema8_accesoDB.EJERCICIOS2;

import Tema8_accesoDB.DBconexion;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio17 {
    public static void main(String[] args) throws SQLException, IOException {
        Connection conectado= DBconexion.conexion();
        String consulta = """
        SELECT e.nombre, e.apellido, a.nombre AS materia
        FROM estudiante e
        JOIN Estudiante_Asignatura ea ON ea.id_estudiante = e.id_estudiante
        JOIN asignatura a ON ea.id_asignatura = a.id_asignatura
        WHERE a.nombre = 'Encantamientos'
        AND ea.calificacion > (
            SELECT AVG(ea2.calificacion)
            FROM Estudiante_Asignatura ea2
            JOIN asignatura a2 ON ea2.id_asignatura = a2.id_asignatura
            WHERE a2.nombre = 'Encantamientos'
        )
                                      """;

        Statement mensajero = conectado.createStatement();
        ResultSet result = mensajero.executeQuery(consulta);
        while (result.next()) {
            String nombre = result.getString("nombre");
            String apellido=result.getString("apellido");
            String materia = result.getString("materia");
            System.out.println("Estudiante: " + nombre + " " + apellido + " - Asignatura: " + materia);
        }
    }
}
