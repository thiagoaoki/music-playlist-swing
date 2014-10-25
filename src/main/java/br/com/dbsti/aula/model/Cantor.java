package br.com.dbsti.aula.model;

import java.util.List;

public class Cantor {
    private String nome;
    private String sobrenome;
    private Byte[] foto;
    private List<Musica> musicas;

    public List<Musica> getMusicas() {
        return musicas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobreNome) {
        this.sobrenome = sobreNome;
    }

    public Byte[] getFoto() {
        return foto;
    }

    public void setFoto(Byte[] foto) {
        this.foto = foto;
    }
}