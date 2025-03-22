import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, r;
        int total = 1, total2 = 1, total3 = 1;
        double total4;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kümenin Eleman Sayısını Giriniz:");
        n = inp.nextInt();
        System.out.print("Seçilecek Eleman Sayısını Giriniz");
        r = inp.nextInt();

        for (int i = 1; i <= n; i++) {
            total = total * i;
        }
        for (int a = 1; a <= r; a++) {
            total2 = total2 * a;
        }
        for (int b = 1; b <= (n - r); b++) {
            total3 = total3 * b;
        }

        total4 = total / (total2 * total3);

        System.out.print("C(n,r)=" + total4);


    }
}
