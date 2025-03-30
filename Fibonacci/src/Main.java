import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Eleman Sayısını Giriniz : ");
        int n = sc.nextInt();
        int ilkSayi = 0, ikinciSayi = 1, sonrakiSayi;

        for (int i = 1; i <= n; i++) {
            System.out.print(ilkSayi + ", ");
            sonrakiSayi = ilkSayi + ikinciSayi;
            ilkSayi = ikinciSayi;
            ikinciSayi = sonrakiSayi;

        }

    }
}
