package exercicios;

import org.junit.Test;
import static org.junit.Assert.*;

public class SistemaAutenticacaoTest {

    @Test
    public void testAutenticacaoSenha() {
        AutenticacaoFactory senhaFactory = new AutenticacaoSenhaFactory();
        boolean senhaAutenticada = senhaFactory.autenticarUsuario("senha123");
        assertTrue("A senha deve ser autenticada", senhaAutenticada);

        boolean senhaNaoAutenticada = senhaFactory.autenticarUsuario("senhaErrada");
        assertFalse("A senha não deve ser autenticada", senhaNaoAutenticada);
    }

    @Test
    public void testAutenticacaoBiometria() {
        AutenticacaoFactory biometriaFactory = new AutenticacaoBiometriaFactory();
        boolean biometriaAutenticada = biometriaFactory.autenticarUsuario("biometriaValida");
        assertTrue("A biometria deve ser autenticada", biometriaAutenticada);

        boolean biometriaNaoAutenticada = biometriaFactory.autenticarUsuario("biometriaInvalida");
        assertFalse("A biometria não deve ser autenticada", biometriaNaoAutenticada);
    }

    @Test
    public void testAutenticacaoToken() {
        AutenticacaoFactory tokenFactory = new AutenticacaoTokenFactory();
        boolean tokenAutenticado = tokenFactory.autenticarUsuario("tokenValido");
        assertTrue("O token deve ser autenticado", tokenAutenticado);

        boolean tokenNaoAutenticado = tokenFactory.autenticarUsuario("tokenInvalido");
        assertFalse("O token não deve ser autenticado", tokenNaoAutenticado);
    }
}
