package Tema8_accesoDB.EJERCICIOS2;

import Tema8_accesoDB.DBconexion;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio3 {
    public static void main(String[] args) throws SQLException, IOException{

        Connection conectado = DBconexion.conexion();
        if (conectado!=null){
            //la consulta debe ir siempre junta no puede separada
            String consulta =
                    "SELECT nombre,apellido,fecha_nacimiento FROM estudiante ORDER BY fecha_nacimiento ASC";
            Statement mensajero=conectado.createStatement();
            ResultSet result= mensajero.executeQuery(consulta);
            while (result.next()){
                String nombres = result.getString("nombre");
                String apellido = result.getString("apellido");
                String fecha_nacimiento=result.getString("fecha_nacimiento");
                System.out.println("Estudiantes:"+nombres + " " + apellido + " - "+fecha_nacimiento );
            }
        }
    }
}
