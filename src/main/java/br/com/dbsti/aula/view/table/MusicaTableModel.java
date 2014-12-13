package br.com.dbsti.aula.view.table;

import br.com.dbsti.aula.model.Musica;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class MusicaTableModel extends AbstractTableModel{
    private List<Musica> musicas = new ArrayList<Musica>(); 
    private String[] colunas = {"ID", "Nome", "Duracao", "Cantor"};
    
    public MusicaTableModel(List<Musica> musicas){
        this.musicas = musicas;
    }

    @Override
    public int getRowCount() {
        return musicas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Musica musica = musicas.get(rowIndex);
        
        switch (columnIndex) {
            case 0: 
                return musica.getId();
                
            case 1:
                return musica.getNome();
                
            case 2:
                return musica.getDuracaoTexto();
            
            case 3: 
                return musica.getCantor();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
    public Musica getMusica(int linhaSelecionada) {
        return musicas.get(linhaSelecionada);
    }    

    public void adicionaMusica(Musica musica) {
        musicas.add(musica);
        fireTableDataChanged();
    }

    public void removeMusica(Musica musica) {
        musicas.remove(musica);
        fireTableDataChanged();        
    }

    public void removeMusicas(List<Musica> musicas) {
        musicas.removeAll(musicas);
        fireTableDataChanged();
    }
}
