public class ArrayComFor {

    public static void main(String[] args) {

        int[] numeros = {10, 20, 30, 40};
        numeros[2] = 50;

        System.out.println(numeros[2]);

        int[] num2 = {5, 10, 15};
        int soma = 0;

        for (int i = 0; i < num2.length; i++) {
            soma += num2[i];
        }

        System.out.println("Soma: " + soma);

        int[] num3 = {34, 44, 32, 9};
        int maior = num3[0];

        for(int i = 1; i < num3.length; i++){
            if(num3[i] > maior){
                maior = num3[i];
            }
        }

        System.out.println("Maior número: " + maior);

    }

}
