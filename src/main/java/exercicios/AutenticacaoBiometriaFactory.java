package exercicios;

public class AutenticacaoBiometriaFactory extends AutenticacaoFactory {
    @Override
    public Autenticacao criarAutenticacao() {
        return new AutenticacaoBiometria();
    }
}
