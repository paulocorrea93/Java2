import java.util.Scanner;

public class EntredaTexto {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = entrada.nextLine();

        System.out.println("Olá, " + nome);

        entrada.close();

    }

}
