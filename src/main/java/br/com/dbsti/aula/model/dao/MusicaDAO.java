package br.com.dbsti.aula.model.dao;

import br.com.dbsti.aula.model.Musica;
import java.util.List;

public interface MusicaDAO extends GenericDAO<Musica> {

    public List<Musica> pesquisaPorNome(String nomeFiltro);
    
}
