package br.com.dbsti.aula.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Playlist {
    private String nome;
    private Integer quantidadeDeExecucoes;
    private Date dataUltimaExecucao;
    private Date dataCriacao;
    private Integer duracaoTotal;
    private final List<Musica> musicas = new ArrayList<>();

    public void adicionaMusica(Musica musica){
        musicas.add(musica);
    }
    
    public List<Musica> getMusicas() {
        return musicas;
    }        
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidadeDeExecucoes() {
        return quantidadeDeExecucoes;
    }

    public Date getDataUltimaExecucao() {
        return dataUltimaExecucao;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public Integer getDuracaoTotal() {
        return duracaoTotal;
    }

}
