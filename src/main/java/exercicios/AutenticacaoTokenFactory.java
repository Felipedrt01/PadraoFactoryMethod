package exercicios;

public class AutenticacaoTokenFactory extends AutenticacaoFactory {
    @Override
    public Autenticacao criarAutenticacao() {
        return new AutenticacaoToken();
    }
}
