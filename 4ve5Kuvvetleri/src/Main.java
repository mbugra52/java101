import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);

        System.out.print("Sınır Sayıyı Giriniz:");
        n = inp.nextInt();

        for (int i = 1; i <= n; i *= 4) {
            System.out.println(i);
        }

        System.out.println("-----------");

        for (int i = 1; i <= n; i *= 5) {
            System.out.println(i);
        }

    }
}
