package exercicios;

public class AutenticacaoBiometria implements Autenticacao {
    private String dadosBiometricosArmazenados = "biometriaValida";

    @Override
    public boolean autenticar(String dados) {
        System.out.println("Autenticando usando Biometria.");
        return dados.equals(dadosBiometricosArmazenados);
    }
}
