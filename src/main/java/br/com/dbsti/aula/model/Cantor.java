package br.com.dbsti.aula.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

@Entity
public class Cantor implements Serializable{
    private static final long serialVersionUID = -6562300303769279831L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(length = 255, nullable = false)
    private String nome;
    
    @Column(length = 255)
    private String sobrenome;
    
    @Lob
    private Byte[] foto;
    
    @OneToMany(mappedBy = "cantor")
    private List<Musica> musicas;

    public Long getId(){
        return id;
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