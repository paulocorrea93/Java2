public class CalcSimples {

    /*Crie um programa CalculadoraSimples.java com:

    Um método int subtrair(int a, int b) que retorna a diferença

    Um método void mostrarMensagem() que imprime "Operação concluída."

    No main, chame ambos os métodos com valores à sua escolha*/

    public static int subtrair(int a, int b){
        return a-b;
    }

    public static void mensagem(String nome){
        System.out.println("Tarefa concluída " + nome);
    }

    public static void main(String[]args){

        System.out.println(subtrair(10,2));
        mensagem("Paulo");

    }

}
