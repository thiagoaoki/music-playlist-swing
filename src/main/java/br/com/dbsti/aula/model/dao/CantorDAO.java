package br.com.dbsti.aula.model.dao;

import br.com.dbsti.aula.model.Cantor;
import java.util.List;

public interface CantorDAO extends GenericDAO<Cantor>{
    List<Cantor> pesquesaPorNome(String nome);
}