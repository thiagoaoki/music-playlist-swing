package br.com.dbsti.aula.model.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CriaBanco {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("playlistPU");
        emf.close();
        
    }
}
