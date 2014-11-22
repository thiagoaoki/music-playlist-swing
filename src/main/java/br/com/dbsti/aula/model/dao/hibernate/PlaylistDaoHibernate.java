package br.com.dbsti.aula.model.dao.hibernate;

import br.com.dbsti.aula.model.Playlist;
import br.com.dbsti.aula.model.dao.PlaylistDAO;
import br.com.dbsti.aula.model.util.JPAUtil;

import javax.persistence.EntityManager;

public class PlaylistDaoHibernate extends GenericDaoHibernate<Playlist> implements PlaylistDAO {
    @Override
    public void remove(Long id) {
        EntityManager em = JPAUtil.createEntityManager();
        
        try {
            em.getTransaction().begin();
            Playlist playlist = em.find(Playlist.class, id);
            playlist.getMusicas().clear();
            em.remove(playlist);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            JPAUtil.closeEntityManager();
        }
    }
}
