public class MaiorValorMatriz {

    public static void main(String[] args) {

        int [][] matrizMaior = {
                {23, 54, 232},{54, 26, 74}
        };

        int maiorValor = matrizMaior[0][0];

        for (int i = 0; i < matrizMaior.length; i++){
            for(int j = 0; j < matrizMaior[i].length; j++){
                if(matrizMaior[i][j] > maiorValor){
                    maiorValor = matrizMaior[i][j];
                }
            }
        }

        System.out.println(maiorValor);

    }

}
