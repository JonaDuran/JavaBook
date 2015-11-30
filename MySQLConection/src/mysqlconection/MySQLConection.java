package mysqlconection;

import java.sql.*;

/**
 * 27/02/15
 *
 * @author Jonathan
 *
 * Java2.pdf p271..
 */
public class MySQLConection {

    public static void main(String[] args) {
        try {
            System.out.println("Intentando conectar a la base de datos");

            // registra el controlador en la BD 
            Class.forName("com.mysql.jdbc.Driver").newInstance();

            // Abre la conexión con la BD
            Connection connection = DriverManager.getConnection(
                    //ruta/BD, usuario, contraseña
                    "jdbc:mysql://localhost/agenda", "root", "");

            System.out.println("Conección exitosa");

            // Permite ejecuatar sentencias SQL
            Statement mysql = connection.createStatement();

            if (true) {
                System.out.println("si");
                /* Ambas pueden ejecutar cualquier sentencia SQL */

                // retorna un booleano
                mysql.execute("INSERT INTO amigos "
                        + "VALUES ('Edson', 18, 'Calle D. #7', 317381111)");

                // retorna el número de registros afectados
                mysql.executeUpdate("UPDATE amigos "
                        + "SET nombre='Jona', domicilio='Calle D. #7'"
                        + "WHERE nombre='Jonathan'");
                
                
                
            }
            
            // retorna todos los registros
            ResultSet resultado = mysql.executeQuery("SELECT * FROM amigos");

            System.out.println("Nombre\t\tEdad\tDomicilio\t\tTeléfono");

            // mientras que exista otro registro
            while (resultado.next()) {
                // muestra los datos
                System.out.println(resultado.getString("nombre") + "\t"
                        + resultado.getString("edad") + "\t"
                        + resultado.getString("domicilio") + "\t"
                        + resultado.getString("telefono") + "\t"
                );
            }

            // cierra la conexión
            connection.close();

        } catch (SQLException e) {
            System.out.println("Error de MySQL");
            e.printStackTrace();

        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada");
            e.printStackTrace();

        } catch (Exception e) {
            System.out.println("A ocurrido un error");
            e.printStackTrace();
        }
    }

}
