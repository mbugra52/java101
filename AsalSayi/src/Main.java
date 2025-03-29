public class Main {
    public static void main(String[] args) {

        for (int i = 2; i < 100; i++) {

            boolean asal = true;

            for (int a = 2; a < i; a++) {

                if (i % a == 0) {
                    asal = false;
                    break;
                }

            }

            if (asal) {
                System.out.print(i + " ");
            }

        }

    }
}
