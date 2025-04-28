package Tema8_accesoDB.EJERCICIOS2;

import Tema8_accesoDB.DBconexion;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        try {
            Connection conectado = DBconexion.conexion();
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el nombre del estudiante que desea borrar: ");
            String nombreBorrar = scanner.nextLine(); // Leer desde la terminal

            String consulta = "DELETE FROM estudiante WHERE nombre = ?";

            try (PreparedStatement borrarValor = conectado.prepareStatement(consulta)) {
                borrarValor.setString(1, nombreBorrar);

                int filasEliminadas = borrarValor.executeUpdate();

                if (filasEliminadas > 0) {
                    System.out.println("Estudiante eliminado correctamente.");
                } else {
                    System.out.println("No se encontró un estudiante con ese nombre.");
                }
            }
        } catch (SQLException | IOException e) {
            System.out.println("Error de base de datos: " + e.getMessage());
        }
    }
}