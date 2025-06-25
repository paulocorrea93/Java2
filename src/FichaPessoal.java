import java.util.Scanner;

public class FichaPessoal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu nome:");
        String nome = entrada.nextLine();
        System.out.println("Digite a sua idade:");
        int idade = entrada.nextInt();
        System.out.println("Digite a sua altura:");
        double altura = entrada.nextDouble();

        System.out.println("Meu nome é " + nome + " tenho " + idade + " anos e " + altura + "m");

    }

}
