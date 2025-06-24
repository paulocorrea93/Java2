public class ContadorWhile {

    public static void main(String[] args) {

        int cont = 0;

        while (cont <= 5) {
            System.out.println(cont);
            cont++;
        }

        System.out.println("------------");

        int cont2 = 1;

        do {
            System.out.println(cont2);
            cont2++;
        } while (cont2 < 4);

    }

}
