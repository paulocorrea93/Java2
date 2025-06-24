public class EscolherOpcao {

    public static void main(String[]args){

        int opcao = 2;

        switch (opcao){
            case 1:
                System.out.println("Novo jogo");
                break;
            case 2:
                System.out.println("Continuar");
                break;
            case 3:
                System.out.println("Sair");
                break;
            default:
                System.out.println("Escolha inválida");
        }

    }

}
