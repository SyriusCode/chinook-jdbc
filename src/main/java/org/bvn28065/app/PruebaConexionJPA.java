package org.bvn28065.app;

import jakarta.persistence.EntityManager;
import org.bvn28065.conexion.JPAUtil;

public class PruebaConexionJPA {

    public static void main(String[] args) {
        try (EntityManager em = JPAUtil.getEntityManager()) {
            System.out.println("EntityManager abierto: " + em.isOpen());
        }
    }
}