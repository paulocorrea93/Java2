public class ArrayMaster {

    public static void main(String[] args) {

        int[] numeros = {2, 4, 6, 8, 10};
        int[] invertidos = new int[numeros.length];
        int soma = 0;


        for(int n : numeros){
            soma += n;
        }

        double media = (double) soma / numeros.length;

        System.out.println(media);


//        for (int i = 0; i < numeros.length; i++) {
//            invertidos[i] = numeros[numeros.length - 1 - i];
//        }
//
//        System.out.println(java.util.Arrays.toString(invertidos));
    }

}
