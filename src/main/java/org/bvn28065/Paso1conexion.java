package org.bvn28065;

import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Paso1conexion {

    public static void main(String[] args) {
        String url = "jdbc:mariadb://localhost:3306/chinook";
        String usuario = "root";
        String password = "";

        try (Connection conexion = DriverManager.getConnection(url, usuario, password)) {
            System.out.println("Conectado correctamente a: " + conexion.getCatalog());
        } catch (SQLException e) {
            System.err.println("Error al conectar: " + e.getMessage());
        }
    }
}
