import java.util.Scanner;

public class Main {
    static int power(int a, int b) {

        if (b == 0) {
            return 1;
        } else if (b == 1) {
            return a;
        } else {
            return a * power(a, b - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tabanı Giriniz : ");
        int a = scanner.nextInt();
        System.out.print("Üssü Giriniz : ");
        int b = scanner.nextInt();

        System.out.print("Sonuç = " + power(a, b));

    }
}
