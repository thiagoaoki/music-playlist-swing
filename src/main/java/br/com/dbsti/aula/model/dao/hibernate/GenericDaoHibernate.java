package br.com.dbsti.aula.model.dao.hibernate;

import br.com.dbsti.aula.model.dao.GenericDAO;
import br.com.dbsti.aula.model.util.JPAUtil;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import javax.persistence.EntityManager;

public class GenericDaoHibernate<T> implements GenericDAO<T> {

    private Class<T> classePersistente;

    public GenericDaoHibernate() {
        classePersistente = getTypeClass();
    }

    private Class<T> getTypeClass() {
        ParameterizedType type = (ParameterizedType) getClass().getGenericSuperclass();
        Type[] types = type.getActualTypeArguments();
        Class<T> classe = (Class<T>) types[0];
        return classe;
    }

    @Override
    public void adiciona(T entidade) {
        EntityManager em = JPAUtil.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(entidade);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    @Override
    public void atualiza(T entidade) {
        EntityManager em = JPAUtil.createEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(entidade);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    @Override
    public void remove(T entidade) {
        EntityManager em = JPAUtil.createEntityManager();
        try {
            em.getTransaction().begin();
            em.remove(em);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    @Override
    public List<T> lista() {
        List<T> list = null;
        return list;
    }

    @Override
    public T pesquisaPorId(Long id) {
        EntityManager em = JPAUtil.createEntityManager();
        try {
            T objeto = em.find(classePersistente, id);
            return objeto;
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
            return null;
        } finally {
            em.close();
        }
    }
}
