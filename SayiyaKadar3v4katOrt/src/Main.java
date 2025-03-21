import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k, sayi=0, toplam=0;
        double ort=0;


        Scanner sc = new Scanner(System.in);

        System.out.print("Sayı Giriniz:");
        k = sc.nextInt();

        for (int i = 1; i <= k; i++) {

            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                sayi++;
                ort = toplam / sayi;

            }
        }
        System.out.print("Ortalama:" + ort);
    }
}
