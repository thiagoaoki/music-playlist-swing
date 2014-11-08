package br.com.dbsti.aula.model.dao.hibernate;

import br.com.dbsti.aula.model.Cantor;
import br.com.dbsti.aula.model.dao.CantorDAO;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class CantorDaoHibernateTest {

    private CantorDAO dao = new CantorDaoHibernate();

    @Test
    public void deveAdicionarCantorNoBanco() {
        Cantor cantor = new Cantor();
        cantor.setNome("Zé");
        cantor.setSobrenome("Ramalho");

        try {
            dao.adiciona(cantor);            
        } catch (Exception e) {
            Assert.fail("Deveria adionar um novo cantor");
        }
    }

    @Test(expected = Exception.class)
    public void naoDeveAdicionarCantorQuandoNomeForNulo() {
        Cantor cantor = new Cantor();
        cantor.setNome(null);
        dao.adiciona(cantor);
    }
    
    @Test
    public void deveAlterarCantorNoBanco(){
        Cantor cantor = new Cantor();
        cantor.setNome("Luan");
        cantor.setSobrenome("Santana");
        dao.adiciona(cantor);
        
        Assert.assertNotNull(cantor.getId());
                
        cantor.setNome("Luan alterado");
        cantor.setSobrenome("Santana alterado");
        dao.atualiza(cantor);
        
        Assert.assertEquals("Luan alterado", cantor.getNome());
        Assert.assertEquals("Santana alterado", cantor.getSobrenome());
    }
    
    @Test
    public void deveRemoverCantorNoBanco(){
        Cantor cantor = new Cantor();
        cantor.setNome("Everaldo");
        cantor.setSobrenome("Consta");
        dao.adiciona(cantor);
        
        Assert.assertNotNull(cantor.getId());
        
        Cantor cantorDoBanco = dao.pesquisaPorId(cantor.getId());
        dao.remove(cantor.getId());
        cantorDoBanco = dao.pesquisaPorId(cantor.getId());
        
        Assert.assertNull(cantorDoBanco);
    }
    
    @Test
    public void deveListarCantoresDoBanco(){
        List<Cantor> cantores = dao.lista();
        Assert.assertFalse(cantores.isEmpty());
    }
    
    @Test
    public void deveRetornarUmCantorComIdExistente(){
        Long id = 1L;
        Cantor cantor = dao.pesquisaPorId(id);
        Assert.assertNotNull(cantor);
        Assert.assertEquals(id, cantor.getId());        
        Assert.assertEquals("Frank", cantor.getNome());        
        Assert.assertEquals("Aguiar", cantor.getSobrenome());        
    }
}