package br.com.dbsti.aula.model.dao.hibernate;

import br.com.dbsti.aula.model.Musica;
import br.com.dbsti.aula.model.dao.MusicaDAO;
import br.com.dbsti.aula.model.util.JPAUtil;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class MusicaDaoHibernate extends GenericDaoHibernate<Musica> implements MusicaDAO {

    @Override
    public List<Musica> pesquisaPorNome(String nomeFiltro) {
        EntityManager em = JPAUtil.createEntityManager();
        Query q = em.createQuery("select m from Musica m where lower(m.nome) like :nome");
        q.setParameter("nome", "%" + nomeFiltro.toLowerCase() + "%");
        List resultList = q.getResultList();        
        return resultList;
    }
    
}
