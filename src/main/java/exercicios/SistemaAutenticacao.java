package exercicios;

public class SistemaAutenticacao {
    public static void main(String[] args) {
        // Autenticação por Senha
        AutenticacaoFactory senhaFactory = new AutenticacaoSenhaFactory();
        boolean senhaAutenticada = senhaFactory.autenticarUsuario("senha123");
        System.out.println("Senha autenticada: " + senhaAutenticada);

        // Autenticação por Biometria
        AutenticacaoFactory biometriaFactory = new AutenticacaoBiometriaFactory();
        boolean biometriaAutenticada = biometriaFactory.autenticarUsuario("biometriaValida");
        System.out.println("Biometria autenticada: " + biometriaAutenticada);

        // Autenticação por Token
        AutenticacaoFactory tokenFactory = new AutenticacaoTokenFactory();
        boolean tokenAutenticado = tokenFactory.autenticarUsuario("tokenValido");
        System.out.println("Token autenticado: " + tokenAutenticado);
    }
}
