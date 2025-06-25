import java.util.Scanner;

public class EntredaTexto {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = entrada.nextLine();
        System.out.println("Digite sua cidade:");
        String cidade = entrada.nextLine();

        System.out.println("Olá " + nome + " você é de " + cidade);

    }

}
