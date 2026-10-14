package org.bvn28065.dao;

import org.bvn28065.modelo.Artista;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public abstract class ArtistaDAO {
    // C3: artistas cuyo nombre contiene el texto
    public abstract List<Artista> buscarPorNombre(String texto) throws SQLException;

    // C7: los n artistas con más unidades vendidas
    public abstract Map<String, Integer> masVendidos(int n) throws SQLException;
}
