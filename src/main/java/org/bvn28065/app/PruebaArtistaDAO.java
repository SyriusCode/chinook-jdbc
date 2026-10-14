package org.bvn28065.app;

import org.bvn28065.dao.ArtistaDAO;
import org.bvn28065.dao.ArtistaDAOJdbc;
import org.bvn28065.modelo.Artista;

import java.sql.SQLException;
import java.util.Map;

public class PruebaArtistaDAO {
    static void main() {
        ArtistaDAO artistaDAO = new ArtistaDAOJdbc();

        try {
            System.out.println("=== C3 · Artistas que contienen \"iron\" ===");
            for (Artista artista : artistaDAO.buscarPorNombre("iron")) {
                System.out.println(artista);
            }

            System.out.println();
            System.out.println("=== C7 · Los 5 artistas más vendidos ===");
            Map<String, Integer> ventas = artistaDAO.masVendidos(5);
            for (Map.Entry<String, Integer> fila : ventas.entrySet()) {
                System.out.println(fila.getKey() + ": " + fila.getValue() + " unidades");
            }

        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
