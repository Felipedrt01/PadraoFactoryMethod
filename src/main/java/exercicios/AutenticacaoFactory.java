package exercicios;

public abstract class AutenticacaoFactory {
    public abstract Autenticacao criarAutenticacao();

    public boolean autenticarUsuario(String dados) {
        Autenticacao autenticacao = criarAutenticacao();
        return autenticacao.autenticar(dados);
    }
}
