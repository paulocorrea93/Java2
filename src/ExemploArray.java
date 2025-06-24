public class ExemploArray {

    public static void main(String[]args){

        int[] notas = new int[3];
        notas[0] = 7;
        notas[1] = 8;
        notas[2] = 9;

        System.out.println("Nota 1: " + notas[0]);
        System.out.println("Nota 2: " + notas[1]);
        System.out.println("Nota 3: " + notas[2]);

        int[] valores = {1, 2, 3, 4};

        valores[2] = 30;

        System.out.println(valores);

    }

}
