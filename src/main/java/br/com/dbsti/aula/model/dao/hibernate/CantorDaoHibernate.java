package br.com.dbsti.aula.model.dao.hibernate;

import br.com.dbsti.aula.model.Cantor;
import br.com.dbsti.aula.model.dao.CantorDAO;
import br.com.dbsti.aula.model.util.JPAUtil;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class CantorDaoHibernate extends GenericDaoHibernate<Cantor> implements CantorDAO{

    @Override
    public List<Cantor> pesquesaPorNome(String nome) {
        EntityManager em = JPAUtil.createEntityManager();
        Query q = em.createQuery("select c from Cantor c where c.nome like :nome");
        q.setParameter("nome", "%" + nome + "%");
        List resultList = q.getResultList();        
        return resultList;
    }        
}
