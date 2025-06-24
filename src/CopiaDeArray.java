public class CopiaDeArray {

    public static void main(String[] args) {

        int[] original = {12, 23, 34, 45};
        int[] copia = new int[original.length];

        for (int i = 0; i < original.length; i++){
            copia[i] = original[i];
        }

        System.out.println(java.util.Arrays.toString(copia));

    }

}
