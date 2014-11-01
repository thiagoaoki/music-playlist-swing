package br.com.dbsti.aula.model.dao;

import java.util.List;

public interface GenericDAO<T> {
    void adiciona(T endidade);
    void atualiza(T entidade);
    void remove(T entidade);
    List<T> lista();
    T pesquisaPorId(Long id);
}