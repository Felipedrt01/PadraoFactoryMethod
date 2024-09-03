package exercicios;

public class AutenticacaoToken implements Autenticacao {
    @Override
    public boolean autenticar(String dados) {
        System.out.println("Autenticando usando Token.");
        return dados.equals("tokenValido");
    }
}
