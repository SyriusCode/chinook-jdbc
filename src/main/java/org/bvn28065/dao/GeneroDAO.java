package org.bvn28065.dao;

import org.bvn28065.modelo.Genero;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public abstract class GeneroDAO {
    // C1: todos los géneros, en orden alfabético
    public abstract List<Genero> findAll() throws SQLException;

    // C6: nombre de cada género y su número de pistas
    public abstract Map<String, Integer> contarPistas() throws SQLException;
}


