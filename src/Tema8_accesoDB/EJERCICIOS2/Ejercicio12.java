package Tema8_accesoDB.EJERCICIOS2;

import Tema8_accesoDB.DBconexion;

import java.io.IOException;
import java.sql.*;

public class Ejercicio12 {
    public static void main(String[] args) throws SQLException, IOException {
        Connection conectado = DBconexion.conexion();
        String consulta = """
                 INSERT INTO estudiante(nombre,apellido,id_casa,anyo_curso,fecha_nacimiento)
                 VALUES(?,?,?,?,?)
                """;/*lo colocas en ?? para evitar ataques de sql*/
        /*con el preparedStatement podemos insertalo de manera mas segura y
        lo conectado con la coneccion,pones con su variable y el tipo de varible que es*/

       try( PreparedStatement insertaValor = conectado.prepareStatement(consulta)){
        insertaValor.setString(1, "Nymphadora");
        insertaValor.setString(2, "Tonks");
        insertaValor.setInt(3, 4);
        insertaValor.setInt(4, 7);
        insertaValor.setDate(5, Date.valueOf("1973-11-25"));
        insertaValor.executeUpdate();/*actualiza las filas y ejecutas el insert */
        System.out.println("Estudiante añadido correctamente");
    }
        String consulta2 = "SELECT * FROM estudiante";

        Statement mensajero = conectado.createStatement();
        ResultSet result = mensajero.executeQuery(consulta2);
        while (result.next()) {

            String nombre = result.getString("nombre");
            String apellido=result.getString("apellido");
            String casa=result.getString("id_casa");
            String curso=result.getString("anyo_curso");
            String fecha=result.getString("fecha_nacimiento");
            System.out.println("Estudiante: "+ nombre +" "+apellido+" "+casa+" "+ curso+" "+fecha);
        }
    }
}
