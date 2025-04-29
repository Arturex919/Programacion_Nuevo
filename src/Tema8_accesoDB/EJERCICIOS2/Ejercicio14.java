package Tema8_accesoDB.EJERCICIOS2;

import Tema8_accesoDB.DBconexion;

import java.io.IOException;
import java.sql.*;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) throws SQLException, IOException {

        Connection conectado = DBconexion.conexion();
        String consulta= """
                DELETE FROM estudiante WHERE nombre='Nymphadora' AND apellido = 'Tonks'
                """;
        Statement mensajero=conectado.createStatement();
        int filasEliminadas = mensajero.executeUpdate(consulta);
            System.out.println("Se ha actualizo la fila "+filasEliminadas);

    }
}