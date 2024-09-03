package exercicios;

public class AutenticacaoSenhaFactory extends AutenticacaoFactory {
    @Override
    public Autenticacao criarAutenticacao() {
        return new AutenticacaoSenha();
    }
}
