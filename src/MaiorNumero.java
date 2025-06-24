public class MaiorNumero {

    public static void main(String[] args) {
        int[] valores = {23,43,22,56,52};
        int maior = valores[0];

        for(int i = 1; i < valores.length; i++){
            if (valores[i] > maior){
                maior = valores[i];
            }
        }

        System.out.println("Maior valor: " + maior);

    }


}
