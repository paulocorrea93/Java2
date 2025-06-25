public class ArrayMaster {

    public static void main(String[] args) {

        int[] numeros = {2, 4, 7, 8, 11};
        int[] invertidos = new int[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            invertidos[i] = numeros[numeros.length - 1 - i];
        }

        System.out.println(java.util.Arrays.toString(invertidos));
    }

}
