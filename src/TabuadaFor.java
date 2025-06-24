public class TabuadaFor {

    public static void main(String[] args) {

        int num1 = 3;

        for (int i = 1; i <= 10; i++) {

            if (i == 3) {
                //continue;
                break;
            }

            System.out.println(num1 * i);
        }

    }

}
