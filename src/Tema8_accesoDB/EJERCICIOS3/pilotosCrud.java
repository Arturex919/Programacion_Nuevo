package Tema8_accesoDB.EJERCICIOS3;

import java.io.IOException;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pilotosCrud {
    public static void main(String[] args) throws SQLException, IOException {
        Scanner in = new Scanner(System.in);
        Connection conn = conexionPilotosdb.conexion();
        int opcion;
        do {
            showMenu();
            opcion = in.nextInt();

            switch (opcion) {
                case 1 -> {
                    pilotos pilotos = pilotBD(in);
                    crearPiloto(conn, pilotos);
                }
                case 2 -> {
                    System.out.print("Introduce el ID del piloto a buscar: ");
                    int id = in.nextInt();
                    leerPiloto(conn, id);
                }
                case 3->{
                    try {
                        List<pilotos> lista = Readpilots(conn);
                        for (pilotos p : lista) {
                            System.out.println("ID: " + p.getDriverid());
                            System.out.println("Código: " + p.getCode());
                            System.out.println("Nombre: " + p.getForename() + " " + p.getSurname());
                            System.out.println("Fecha de nacimiento: " + p.getFecha());
                            System.out.println("Nacionalidad: " + p.getNationality());
                            System.out.println("Constructor ID: " + p.getConstructorId());
                            System.out.println("URL: " + p.getUrl());
                            System.out.println("----------------------------------");
                        }
                    } catch (SQLException e) {
                        System.out.println("Error al leer pilotos: " + e.getMessage());
                    }
                }
                case 4 -> {
                    System.out.println("Ingresa el ID del piloto que quieres actualizar:");
                    int id = in.nextInt();
                    in.nextLine(); // limpiar buffer
                    System.out.println("Ingresa los nuevos datos del piloto:");
                    pilotos pilotoNuevo = pilotBD(in);

                    update(conn, pilotoNuevo);
                }
                case 5 -> {
                    System.out.println("Ingresa el id del piloto");
                    int id= in.nextInt();
                    pilotos elimina=new pilotos(id,null,null,null,null,null,0,null);
                    delete(conn,elimina);
                }
                case 6->{
                    clasificacionPilotos(conn);
                }
                case  7->{
                    clasificacionBuild(conn);
                }
                case 8->{
                    System.out.println("HASTA LA PROXIMA");
                }

            }
        } while (opcion != 8);
    }

    public static void showMenu() {
        System.out.println("======MENU======\n" +
                "Selecciona una opcion" + "\n" +
                "1. Crea un Piloto" + "\n" +
                "2. Leer un Piloto" + "\n" +
                "3. Leer los Pilotos" + "\n" +
                "4. Actualiza Pilotos" + "\n" +
                "5. Borra piloto" + "\n" +
                "6. Ver la clasificacion de los pilotos" + "\n" +
                "7. Ver a lo clasificacion constructores" + "\n" +
                "8. Salir");
    }

    public static pilotos pilotBD(Scanner in) {
        in.nextLine();
        System.out.print("Code: ");
        String code = in.nextLine();

        System.out.print("Nombre: ");
        String nombre = in.nextLine();

        System.out.print("Apellido: ");
        String apellido = in.nextLine();

        System.out.print("Fecha (yyyy-MM-dd): ");
        String fechaStr = in.nextLine();
        LocalDate fecha = LocalDate.parse(fechaStr);

        System.out.print("Nacionalidad: ");
        String nacionalidad = in.nextLine();

        System.out.print("Ingresa un construsctor del 1 al 13"+
                "\n"+"Constructor ID: ");
        int constructorId = in.nextInt();
        in.nextLine(); // limpiar otra vez

        System.out.print("URL: ");
        String url = in.nextLine();

        return new pilotos( 0,code, nombre, apellido, fecha, nacionalidad, constructorId, url);
    }
//CreatePilot, recibe un objeto piloto y lo añade a la base de datos.
    public static void crearPiloto(Connection connection, pilotos pilotos) throws SQLException, IOException {
        String sql = """
                INSERT INTO drivers(code,forename,surname,dob,
                nationality,constructorId,url) VALUES(?,?,?,?,?,?,?);
                """;
        PreparedStatement mensajero = connection.prepareStatement(sql);
        mensajero.setString(1, pilotos.getCode());
        mensajero.setString(2, pilotos.getForename());
        mensajero.setString(3, pilotos.getSurname());
        // Date.valueOf convierte un String o LocalDate en java.sql.Date para usarlo en SQL
        mensajero.setDate(4, Date.valueOf(pilotos.getFecha()));
        mensajero.setString(5, pilotos.getNationality());
        mensajero.setInt(6, pilotos.getConstructorId());
        mensajero.setString(7, pilotos.getUrl());

        mensajero.executeUpdate();
        System.out.println("Nuevo piloto creado");
    }
//ReadPilot, recibe un entero y devuelve un piloto de la base de datos.
    public static pilotos leerPiloto(Connection connection, int id) throws SQLException {
        String sql = """
                SELECT* FROM drivers WHERE driverid= ?;
                """;
        try (PreparedStatement mensajero = connection.prepareStatement(sql)) {
            mensajero.setInt(1, id);//solo quieres el id pones el id como parametro
            ResultSet resultado = mensajero.executeQuery();
            if (resultado.next()) {
                    int driverid=  resultado.getInt("driverid");
                    String code= resultado.getString("code");
                    String nombre=  resultado.getString("forename");
                    String apellido=  resultado.getString("surname");
                    LocalDate fecha= resultado.getDate("dob").toLocalDate();
                    String nacionalidad=  resultado.getString("nationality");
                    int constructorid=  resultado.getInt("constructorid");
                    String url=  resultado.getString("url");
                    System.out.println(
                            "PILOTOS: "+"\n"+
                            "ID: "+ driverid+"\n"+
                            "CODE: "+code+"\n"+
                            "NOMBRE: "+nombre+"\n"
                            +"APELLIDO: "+apellido+"\n"+
                            "FECHA: "+fecha+"\n"
                            +"NACIONALIDAD: "+nacionalidad+"\n"+
                            "CONSTRUCTOR ID: "+constructorid+"\n"
                            +"URL: "+url);
                return new pilotos(driverid, code, nombre, apellido, fecha, nacionalidad, constructorid, url);
            } else {
                System.out.println("ERROR" + "\n"
                        + "no se encontro el ID del usuario: " + id);
                return null;
            }
        }
    }
    public static List<pilotos> Readpilots(Connection connection) throws SQLException {
        // Consulta SQL para obtener todos los pilotos de la tabla 'drivers'
        String sql = """
            SELECT * FROM drivers;
            """;

        // Lista donde se almacenarán los objetos 'pilotos'
        List<pilotos> pilotos = new ArrayList<>();

        try (PreparedStatement mensajero = connection.prepareStatement(sql)) {
            ResultSet resultSet = mensajero.executeQuery();

            // Recorrer el ResultSet fila por fila
            while (resultSet.next()) {
                // Crear un nuevo objeto 'pilotos' por cada fila
                pilotos pilotos1 = new pilotos();

                // Usamos los métodos SET para asignar valores desde la base de datos
                pilotos1.setDriverid(resultSet.getInt("driverid"));
                pilotos1.setCode(resultSet.getString("code"));
                pilotos1.setForename(resultSet.getString("forename"));
                pilotos1.setSurname(resultSet.getString("surname"));
                pilotos1.setFecha(resultSet.getDate("dob").toLocalDate());
                pilotos1.setNationality(resultSet.getString("nationality"));
                pilotos1.setConstructorId(resultSet.getInt("constructorid"));
                pilotos1.setUrl(resultSet.getString("url"));

                // Agregamos el piloto ya lleno a la lista
                pilotos.add(pilotos1);
            }

            // Devolvemos la lista de pilotos completa
            return pilotos;
        }
    }

    //UpdatePilot, recibe un objeto piloto y actualiza los datos en la base de datos.
    public static void update(Connection connection, pilotos pilot) throws SQLException {
        String sql = """
            UPDATE drivers
            SET code=?, forename=?, surname=?, dob=?, nationality=?, constructorId=?, url=?
            WHERE driverid=?;
            """;
        try (PreparedStatement mensajero = connection.prepareStatement(sql)) {
            mensajero.setString(1, pilot.getCode());
            mensajero.setString(2, pilot.getForename());
            mensajero.setString(3, pilot.getSurname());
            mensajero.setDate(4, Date.valueOf(pilot.getFecha()));
            mensajero.setString(5, pilot.getNationality());
            mensajero.setInt(6, pilot.getConstructorId());
            mensajero.setString(7, pilot.getUrl());
            mensajero.setInt(8,pilot.getDriverid()); //obtenemos el id del objeto piloto
            mensajero.executeUpdate();
            System.out.println("Piloto actualizado correctamente.");

        }
    }
    //DeletePilot, recibe un objeto piloto y lo elimina de la base de datos.
    public static void delete(Connection connection,pilotos pilotos) throws SQLException {
        String sql= """
                DELETE FROM drivers
                WHERE driverid=?
                """;
        try (PreparedStatement mensajero=connection.prepareStatement(sql)) {
            mensajero.setInt(1, pilotos.getDriverid());
            mensajero.executeUpdate();
            System.out.println("piloto eliminado");
        }
    }
    //ShowPilotClassification, muestra la clasificación final del mundial ordenada
    //por puntos de los pilotos.
    public static void clasificacionPilotos(Connection connection) throws SQLException {
        String sql= """
                SELECT d.driverid AS piloto,d.forename AS nombre ,d.surname AS apellido,SUM(r.points) AS puntos,
                 MAX(r.position) AS posicion FROM results r 
                JOIN drivers d ON d.driverid = r.driverid 
                JOIN races ra ON ra.raceid = r.raceid
                GROUP BY d.driverid
                 ORDER BY puntos DESC;
                """;
        try (PreparedStatement mensajero=connection.prepareStatement(sql)){
            ResultSet result= mensajero.executeQuery();
            while (result.next()){
                int driverid = result.getInt("piloto");
                String nombre = result.getString("nombre");
                String apellido = result.getString("apellido");
                int puntos = result.getInt("puntos");
                int position = result.getInt("posicion");
                System.out.println("========raking=======");
                System.out.println("ID: "+driverid+"\n"+
                        "nombre: "+nombre+"\n"+
                        "apellido: "+apellido+"\n"+
                        "puntos: "+puntos+"\n"+
                        "posicion: "+position);
            }
        }
    }
    //ShowBuildersClassification, muestra la clasificación del mundial ordenada por
    //puntos de los equipos
    public static void clasificacionBuild(Connection connection) throws SQLException {
        String sql = """
                SELECT c.constructorid AS equipo, c.name AS nombre_equipo,
                                   SUM(r.points) AS puntos
                            FROM drivers d
                            JOIN constructors c ON c.constructorid = d.constructorid
                            JOIN results r ON r.driverid = d.driverid
                            GROUP BY c.constructorid, c.name
                            ORDER BY puntos DESC;
            """;
        try (PreparedStatement mensajero = connection.prepareStatement(sql)) {
            ResultSet result = mensajero.executeQuery();
            System.out.println("====== CLASIFICACIÓN DE CONSTRUCTORES ======");
            while (result.next()) {
                int constructorId = result.getInt("equipo");
                String nombre = result.getString("nombre_equipo");
                int puntos = result.getInt("puntos");

                System.out.println("Constructor ID: " + constructorId);
                System.out.println("Nombre: " + nombre);
                System.out.println("Puntos: " + puntos);
                System.out.println("-----------------------------");
            }
        }
    }


}

