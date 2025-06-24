public class Saudador {

    public static void gerarSaudacao(String nome) {
        System.out.println("Olá " + nome);
    }

    public static void exibirMensagem() {
        System.out.println("Seja bem vindo.");
    }

    public static void main(String[] args) {

        gerarSaudacao("Paulo");
        exibirMensagem();

    }

}
