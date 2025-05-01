package Tema8_accesoDB.EJERCICIOS;

import Tema8_accesoDB.DBconexion;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class operacionesCrud {
    public static void main(String[] args) throws SQLException, IOException {
        Scanner in = new Scanner(System.in);
        Connection conexion = DBconexion.conexion();
        int opcion;
        do {
            showMenu();
            opcion = in.nextInt();
            in.nextLine();//limpia el buffer
            switch (opcion) {
                case 1 -> {
                    System.out.println("ingresa el nombre de la casa");
                    String casa = in.nextLine();
                    consultaCasa(casa, conexion);
                }
                case 2 -> {
                    System.out.println("ingresa el nombre del estudiante");
                    String nombre = in.nextLine();
                    System.out.println("ingresa el apellido del estudiante");
                    String apellido = in.nextLine();
                    mascotaPersona(nombre, apellido, conexion);
                }
                case 3 -> {
                    contarEstudiantesPorCasa(conexion);
                }
                case 4 -> {
                    System.out.println("Nombre de la asignatura:");
                    String nombre = in.nextLine();
                    System.out.println("Aula:");
                    String aula = in.nextLine();
                    System.out.println("¿Es Obligatoria? (T o F):");
                    char opciones = in.next().toUpperCase().charAt(0);
                    in.nextLine(); // limpiar salto de línea
                    boolean obligatoria;
                    if (opciones == 'T') {
                        obligatoria = true;
                        nuevaAsignatura(nombre, aula, obligatoria, conexion);
                    } else if (opciones == 'F') {
                        obligatoria = false;
                        nuevaAsignatura(nombre, aula, obligatoria, conexion);
                    } else {
                        System.out.println("Opción inválida. Solo T o F.");
                    }
                }
                case 5 -> {
                    consultaID(conexion);
                    System.out.println("añade el nueva aula");
                    String aula=in.nextLine();
                    System.out.println("añade el id del aula que quiere modificar");
                    int id=in.nextInt();
                    aulaModificada(aula,id,conexion) ;
                    consultaID(conexion);

                }
                case 6 -> {
                    System.out.println("añade el nombre de la asignatura a eliminar o salir");
                    String asignatura = in.nextLine();
                    if (asignatura.equalsIgnoreCase("salir")){
                        System.out.println("regresando al menu");
                    }else {
                        elimina(asignatura, conexion);
                    }
                }

            }
        } while (opcion != 0);
    }

    public static void showMenu() {
        System.out.println(
                "=======MENU PRINCIPAL=======\n" +
                        "0.) Salir\n" +
                        "1.) Consultar estudiantes por casa\n" +
                        "2.) Obtener la mascota de un estudiante específico\n" +
                        "3.) Obtener el número de estudiantes por casa\n" +
                        "4.) Insertar una nueva asignatura\n" +
                        "5.) Modificar el aula de una asignatura\n" +
                        "6.) Eliminar una asignatura");
    }

    public static void consultaCasa(String nombreCasa, Connection conexion) throws SQLException, IOException {
        String consulta = """
                SELECT e.nombre,e.apellido FROM estudiante e
                JOIN casa c ON c.id_casa=e.id_casa
                 WHERE c.nombre = ?""";
        //para consulta con parametros y mas segura usa esta
        try (PreparedStatement mensajero = conexion.prepareStatement(consulta)) {
            mensajero.setString(1, nombreCasa);
            ResultSet result = mensajero.executeQuery();
            System.out.println("casa de los estudiantes: " + nombreCasa);
            while (result.next()) {
                String nombre = result.getString("nombre");
                String apellido = result.getString("apellido");
                System.out.println(nombre + " " + apellido);
            }
        }
    }

    public static void mascotaPersona(String nombre, String apellido, Connection conexion) throws SQLException, IOException {
        String sql = """
                SELECT m.nombre AS mascota FROM mascota m 
                JOIN estudiante e ON e.id_estudiante=m.id_estudiante
                WHERE e.nombre=? AND e.apellido=?
                """;
        try (PreparedStatement mensajero = conexion.prepareStatement(sql)) {
            mensajero.setString(1, nombre);
            mensajero.setString(2, apellido);
            ResultSet resultado = mensajero.executeQuery();
            while (resultado.next()) {
                String mascota = resultado.getString("mascota");
                System.out.println("mascota: " + mascota);
            }
        }
    }

    public static void contarEstudiantesPorCasa(Connection conexion) throws SQLException {
        String consulta = """
                    SELECT c.nombre AS casa, COUNT(*) AS total
                    FROM estudiante e
                    JOIN casa c ON c.id_casa = e.id_casa
                    GROUP BY c.nombre
                """;

        try (PreparedStatement mensajero = conexion.prepareStatement(consulta);
             ResultSet result = mensajero.executeQuery()) {

            System.out.println("Número de estudiantes por casa:");
            while (result.next()) {
                String casa = result.getString("casa");
                int total = result.getInt("total");
                System.out.println("Casa: " + casa + " → Estudiantes: " + total);
            }
        }
    }

    public static void nuevaAsignatura(String nombre, String aula, boolean obligatoria, Connection conexion) throws SQLException {
        String sql = """
                INSERT INTO asignatura (nombre,aula,obligatoria) VALUES(?,?,?)
                """;
        try (PreparedStatement mensajero = conexion.prepareStatement(sql)) {
            mensajero.setString(1, nombre);
            mensajero.setString(2, aula);
            mensajero.setBoolean(3, obligatoria); // convertir char a String
            int filas = mensajero.executeUpdate();
            System.out.println(filas > 0 ? "Asignatura insertada correctamente." : "No se pudo insertar.");
        }
    }

    public static void aulaModificada(String aulaNueva, int id_asignatura, Connection conexion) throws SQLException {
        String sql = " UPDATE asignatura  SET aula = ?   WHERE id_asignatura = ? ";
        try (PreparedStatement mensajero = conexion.prepareStatement(sql)) {
            mensajero.setString(1, aulaNueva);
            mensajero.setInt(2, id_asignatura);
            int fila = mensajero.executeUpdate();
            System.out.println(fila > 0 ? "Aula modificada correctamente." : "No se encontró la asignatura.");
        }
    }
    public static void consultaID( Connection conexion) throws SQLException, IOException {
        String consulta = " SELECT id_asignatura AS id, nombre,aula FROM asignatura";
        //para consulta con parametros y mas segura usa esta
        try (PreparedStatement mensajero = conexion.prepareStatement(consulta)) {
            ResultSet result = mensajero.executeQuery();
            while (result.next()) {
                String id = result.getString("id");
                String nombre = result.getString("nombre");
                String aula = result.getString("aula");

                System.out.println(id + " - " + nombre+" - "+ aula);
            }
        }
    }


public static void elimina(String asignatura, Connection conexion) throws SQLException {
    String sql =
            " DELETE FROM asignatura WHERE nombre = ?";
    try (PreparedStatement mensajero = conexion.prepareStatement(sql)) {
        mensajero.setString(1, asignatura);
        int fila = mensajero.executeUpdate();//actualiza la tabla
        System.out.println(fila > 0 ? "Asignatura eliminada correctamente." : "No se encontró la asignatura.");

    }
}
}


