package br.com.dbsti.aula.controller;

import br.com.dbsti.aula.model.Musica;
import br.com.dbsti.aula.model.Playlist;
import br.com.dbsti.aula.model.dao.MusicaDAO;
import br.com.dbsti.aula.model.dao.PlaylistDAO;
import br.com.dbsti.aula.model.dao.hibernate.MusicaDaoHibernate;
import br.com.dbsti.aula.model.dao.hibernate.PlaylistDaoHibernate;
import br.com.dbsti.aula.thread.ExecutaPlaylist;
import br.com.dbsti.aula.view.PlayListDialog;
import br.com.dbsti.aula.view.PlaylistFormDialog;
import br.com.dbsti.aula.view.table.MusicaTableModel;
import br.com.dbsti.aula.view.table.PlayListTableModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlayListController {
    
    private PlayListDialog view;
    private PlaylistDAO playlistDao = new PlaylistDaoHibernate();
    private PlayListTableModel playlistTableModel;
    private MusicaTableModel musicaTableModelView;
    private Map<String, ExecutaPlaylist> threds = new HashMap<String, ExecutaPlaylist>();
    private MusicaDAO musicaDao = new MusicaDaoHibernate();
    private MusicaTableModel musicaTableModelDisponiveis;
    private MusicaTableModel musicaTableModelPlaylist;
    private PlaylistFormDialog form;
    private Playlist playlist = new Playlist();
            
    public PlayListController(PlayListDialog view) {
        this.view = view;        
    }
    
    public void preencheTabelaPlayList(){
        List<Playlist> playlists = playlistDao.lista();
        playlistTableModel = new PlayListTableModel(playlists);
        view.atualizaTabelaPlaylist(playlistTableModel);
    }      
    
    public void carregaMusicasDaPlaylistView(int linha) {
        Playlist playlist = playlistTableModel.getPlaylist(linha);
        List<Musica> musicas = playlist.getMusicas();
        musicaTableModelView = new MusicaTableModel(musicas);
        view.atualizaTabelaMusicas(musicaTableModelView);
    }
    
    public void executarPlaylist(int linha){
        Playlist playlist = playlistTableModel.getPlaylist(linha);
        ExecutaPlaylist executaPlaylist = new ExecutaPlaylist(playlist.getNome());
        
        threds.put(playlist.getNome(), executaPlaylist);        
        
        executaPlaylist.start();
    }
    
    public void pararPlayllist(int linha){
        Playlist playlist = playlistTableModel.getPlaylist(linha);
        ExecutaPlaylist executaPlaylist = threds.get(playlist.getNome());
        
        executaPlaylist.interrupt();
    }

    public void preencheTabelaMusicasDisponiveis() {
        List<Musica> musicas = musicaDao.lista();
        musicaTableModelDisponiveis = new MusicaTableModel(musicas);
        form.atualizaTabelaMusicasDisponiveis(musicaTableModelDisponiveis);
        form.setDuracao(playlist.getDuracaoTotalDate());
        
        musicaTableModelDisponiveis.removeMusicas(playlist.getMusicas());
        form.atualizaTabelaMusicasPlaylist(musicaTableModelPlaylist);
    }
    
    public void registraForm(PlaylistFormDialog form) {
        this.form = form;
        musicaTableModelPlaylist = new MusicaTableModel(new ArrayList<Musica>());
        form.atualizaTabelaMusicasPlaylist(musicaTableModelPlaylist);        
    }
    
    public void adicionaMusica(int linha){
        Musica musica = musicaTableModelDisponiveis.getMusica(linha);
        musicaTableModelPlaylist.adicionaMusica(musica);
        musicaTableModelDisponiveis.removeMusica(musica);
        
        playlist.adicionaMusica(musica);
        form.setDuracao(playlist.getDuracaoTotalDate());
    }
    
    public void removeMusica(int linha){
        Musica musica = musicaTableModelPlaylist.getMusica(linha);
        musicaTableModelDisponiveis.adicionaMusica(musica);
        musicaTableModelPlaylist.removeMusica(musica);
        
        playlist.removeMusica(musica);
    }
    
    public void salvar(){
        playlist.setNome(form.getNome());
        
        if (playlist.getId() == null) {
            playlistDao.adiciona(playlist);
        } else {
            playlistDao.atualiza(playlist);
        }
        
        preencheTabelaPlayList();        
    }
    
    public void preencheFormPlaylist(int selectedRow){
        playlist = playlistTableModel.getPlaylist(selectedRow);
        form.setNome(playlist.getNome());
        musicaTableModelPlaylist = new MusicaTableModel(playlist.getMusicas());
        form.atualizaTabelaMusicasPlaylist(musicaTableModelPlaylist);                       
    }   
}