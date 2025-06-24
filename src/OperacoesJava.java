public class OperacoesJava {

    //Um método multiplicar(int x, int y) que retorna o produto de x * y
    //Um método mensagem(String nome) que imprime: "Olá, [nome]!"

    public static void saudacao(String nome){
        System.out.println("olá " + nome);
    }

    public static int multiplicar(int x, int y){
        return x*y;
    }

    public static void main(String[]args){

        //int multip = multiplicar(5, 2);
        System.out.println(multiplicar(5,3));
        System.out.println(multiplicar(2,8));

        saudacao("Paulo");

    }

}
