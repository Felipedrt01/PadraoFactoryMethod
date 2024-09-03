package exercicios;

public class AutenticacaoSenha implements Autenticacao {
    @Override
    public boolean autenticar(String dados) {
        System.out.println("Autenticando usando Senha.");
        return dados.equals("senha123");
    }
}
