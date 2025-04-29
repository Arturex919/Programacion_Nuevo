package Tema8_accesoDB.EJERCICIOS2;

import Tema8_accesoDB.DBconexion;

import javax.xml.transform.Result;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio13  {
    public static void main(String[] args) throws SQLException, IOException {
        Connection connection= DBconexion.conexion();
        String sql= """
                UPDATE casa
                SET id_jefe = 5
                WHERE nombre='Hufflepuff'
                """;

        Statement mensajero = connection.createStatement();
        int jefeActualizado=mensajero.executeUpdate(sql);/*Para actualizar la fila usa el executeUpdate*/
        System.out.println("fila Actualizada "+jefeActualizado);
    }
}
