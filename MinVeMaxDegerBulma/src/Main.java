import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, sayi, max, min;
        System.out.print("Kaç Tane Sayı Gireceksiniz :");
        a = sc.nextInt();

        System.out.print("1. Sayıyı Giriniz :");
        sayi = sc.nextInt();
        max = sayi;
        min = sayi;

        for (int i = 2; i <= a; i++) {
            System.out.print(i + ". Sayı Giriniz : ");
            sayi = sc.nextInt();

            if (sayi > max) {
                max = sayi;
            }
            if (sayi < min) {
                min = sayi;
            }
        }
        System.out.println("En Büyük Sayı :" + max);
        System.out.print("En Küçük Sayı : " + min);
    }
}
