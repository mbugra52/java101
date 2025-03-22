import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, k, total = 1;

        Scanner sc = new Scanner(System.in);

        System.out.print("Üssü Alınacak Sayıyı Giriniz:");
        n = sc.nextInt();
        System.out.print("Üssü Giriniz:");
        k = sc.nextInt();

        for (int i = 1; i <= k; i++) {
            total *= n;
        }

        System.out.print("Cevap : " + total);

    }
}
