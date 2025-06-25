public class MediaMatriz {

    public static void main(String[] args) {

        double[][] media = {
                {10, 10}, {10, 10}
        };

        double valorMedia = 0;

        for (int i = 0; i < media.length; i++){
            for (int j = 0; j < media[i].length; j++){
                valorMedia += media[i][j] / media.length;
            }
        }

        System.out.println(valorMedia);

    }

}
