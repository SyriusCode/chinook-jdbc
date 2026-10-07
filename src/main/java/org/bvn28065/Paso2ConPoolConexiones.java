package org.bvn28065;

import java.sql.*;

public class Paso2ConPoolConexiones {
    public static void main(String[] args) {
        String url = "jdbc:mariadb://localhost:3306/chinook";
        String usuario = "root";
        String contraseña = "";

        String sql = "SELECT GenreId, Name FROM Genre ORDER BY Name";

        try (Connection conexion = PoolConexiones.getConnection();
             Statement sentencia = conexion.createStatement()) {

            boolean hayResultado = sentencia.execute(sql);
            System.out.println("¿execute() devuelve un ResultSet? " + hayResultado);

            if (hayResultado) {
                ResultSet resultado = sentencia.getResultSet();
                while (resultado.next()) {
                    System.out.println(resultado.getInt("GenreId") + " - " + resultado.getString("Name"));
                }
            }

        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
