public class NumerosPares {

    public static void main(String[] args) {
        int[] pares = {1, 2, 3, 4, 5, 6, 7, 8};
        //int par = pares[0];

        for (int i = 1; i < pares.length; i++) {
            if (pares[i] % 2 == 0) {
                System.out.println(pares[i]);
            }
        }

    }

}
