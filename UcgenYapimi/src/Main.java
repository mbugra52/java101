import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Basamak Sayısını Giriniz :");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int k = 1; k <= n - i; k++) { //her bir basamaktaki bosluk sayisi
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i) - 1; j++) { //her bir satirda o satirin 2kati-1 kadar yıldız (2. de 3 yıldız)
                System.out.print("*");
            }

            System.out.println();

        }


    }
}
