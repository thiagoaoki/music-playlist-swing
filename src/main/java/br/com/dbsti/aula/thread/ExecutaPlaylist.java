package br.com.dbsti.aula.thread;

public class ExecutaPlaylist extends Thread {

    private String nomePlaylist;
    
    public ExecutaPlaylist(String nomePlaylist){
        this.nomePlaylist = nomePlaylist;
    }
    
    @Override
    public void run() {
        System.out.println("Inicio: " + nomePlaylist);
        while (!Thread.interrupted()) {
            System.out.println("Nome: " + nomePlaylist + " Executando Playlist.. ");
        }
                
        System.out.println("Fim: " + nomePlaylist);
    }
}