package Tema8_accesoDB.EJERCICIOS3;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.util.Properties;

public class conexionPilotosdb {
    public  static Connection conexion() throws IOException, SQLException {
        Connection conectado=null;
        Properties propietario=new Properties();//nos ayuda a cargar las credenciales
        //crea la carpeta resources y agrega la conexion alli
        FileInputStream inputDB=new FileInputStream("resources/pilotosdb.properties");
        propietario.load(inputDB);
        //solo va a tomar la url,el user y la contraseña no es neceario poner toda la direccion completa
        String url = propietario.getProperty("db.url1");
        String user = propietario.getProperty("db.user1");
        String password = propietario.getProperty("db.password1");
        //DriverManager establece la conexion con la BD
        try {
            conectado = DriverManager.getConnection(url, user, password);
            System.out.println("conectado");
        }catch (Exception e){
            System.out.println("error de conexion");
        }
        return conectado;
    }
}
