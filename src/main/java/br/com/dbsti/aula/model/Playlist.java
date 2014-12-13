package br.com.dbsti.aula.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Playlist implements Serializable{
    private static final long serialVersionUID = 2568124443649468278L;    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }
    
    @Column(length = 255, nullable = false)
    private String nome;
    private Integer quantidadeDeExecucoes;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataUltimaExecucao;
    
    @Temporal(TemporalType.DATE)
    private Date dataCriacao;
    private Integer duracaoTotal = 0;
    
    @ManyToMany(cascade = CascadeType.REMOVE)
    @JoinTable(name = "playlist_musica")
    private final List<Musica> musicas = new ArrayList<>();

    public void adicionaMusica(Musica musica){
        musicas.add(musica);
        duracaoTotal += musica.getDuracao();
    }
    
    public void removeMusica(Musica musica) {
        musicas.remove(musica);
        duracaoTotal -= musica.getDuracao();
    }    
    
    public Date getDuracaoTotalDate(){
        if (duracaoTotal == null) {
            return null;
        } 
        
        int segundos = duracaoTotal %60;
        int horasEmMinutos = duracaoTotal / 60;       
        int minutos = horasEmMinutos %60;
        int horas = horasEmMinutos /60;
        
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR, horas);
        calendar.set(Calendar.MINUTE, minutos);        
        calendar.set(Calendar.SECOND, segundos);
        
        return calendar.getTime();
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
