public class ArrayMaster {

    public static void main(String[] args) {

        int[] numeros = {2, 4, 6, 4, 77, 10};
        int[] invertidos = new int[numeros.length];
        int soma = 0;

        int procurar = 7;
        boolean achou = false;

        for(int n : numeros){
            if(n == 7){
                achou = true;
                break;
            }
        }

        System.out.println(achou);

//        for(int n : numeros){
//            soma += n;
//        }
//
//        double media = (double) soma / numeros.length;
//
//        System.out.println(media);


//        for (int i = 0; i < numeros.length; i++) {
//            invertidos[i] = numeros[numeros.length - 1 - i];
//        }
//
//        System.out.println(java.util.Arrays.toString(invertidos));
    }

}
