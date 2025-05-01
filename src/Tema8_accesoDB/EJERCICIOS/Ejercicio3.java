package Tema8_accesoDB.EJERCICIOS;

import Tema8_accesoDB.DBconexion;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio3 {
    public static void contarEstudiantesPorCasa(Connection conexion) throws SQLException {
        String consulta = """
        SELECT c.nombre AS casa, COUNT(*) AS total
        FROM estudiante e
        JOIN casa c ON c.id_casa = e.id_casa
        GROUP BY c.nombre
    """;

        try (PreparedStatement stmt = conexion.prepareStatement(consulta);
             ResultSet rs = stmt.executeQuery()) {

            System.out.println("Número de estudiantes por casa:");
            while (rs.next()) {
                String casa = rs.getString("casa");
                int total = rs.getInt("total");
                System.out.println("Casa: " + casa + " → Estudiantes: " + total);
            }
        }
    }

    public static void main(String[] args) throws SQLException, IOException {
        Scanner in = new Scanner(System.in);
        Connection conexion=DBconexion.conexion();
        contarEstudiantesPorCasa(conexion);
    }
}

