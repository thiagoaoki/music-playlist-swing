package br.com.dbsti.aula.model.dao.hibernate;

import br.com.dbsti.aula.model.Usuario;
import br.com.dbsti.aula.model.dao.UsuarioDAO;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class UsuarioDaoHibernateTest {

    private UsuarioDAO dao = new UsuarioDaoHibernate();

    @Test
    public void deveAdicionarUsuarioNoBanco() {
        Usuario usuario = new Usuario();
        usuario.setLogin("rei.silva");
        usuario.setNome("Reinaldo Da Silva");
        usuario.setSenha("123mudar");

        try {
            dao.adiciona(usuario);
        } catch (Exception e) {
            Assert.fail("Deveria adionar um novo cantor");
        }
    }

    @Test
    public void deveAlterarUsuarioNoBanco() {
        Usuario usuario = new Usuario();
        usuario.setLogin("adriano.alioleo");
        usuario.setNome("Adriano Alioleo Costa");
        usuario.setSenha("adriano7814");

        dao.adiciona(usuario);

        Assert.assertNotNull(usuario.getId());
        
        usuario.setNome("Adriano Aliolheo da Costa");
        dao.atualiza(usuario);
        
        Assert.assertEquals("Adriano Aliolheo da Costa", usuario.getNome());
    }
    
    @Test
    public void deveRemoverUsuarioNoBanco(){
        Usuario usuario = new Usuario();
        usuario.setLogin("everaldo.pinheiro");
        usuario.setNome("Everaldo Pinheiro Schurle");
        usuario.setSenha("Sc14shr");
                
        dao.adiciona(usuario);
        Assert.assertNotNull(usuario.getId());
        
        Usuario usuarioDoBanco = dao.pesquisaPorId(usuario.getId());
        dao.remove(usuario.getId());
        usuarioDoBanco = dao.pesquisaPorId(usuario.getId());
        
        Assert.assertNull(usuarioDoBanco);        
    }
    
    @Test
    public void deveListarUsuariosDoBanco(){
        List<Usuario> lstListaUsuario = dao.lista();
        
        Assert.assertFalse(lstListaUsuario.isEmpty());
    }
    
    @Test
    public void deveRetornarUmUsuarioComIdExistente(){
        Long id = 1L;
        Usuario usuario = dao.pesquisaPorId(id);
        Assert.assertNotNull(usuario);
    }
            
}
