import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Sayı Giriniz :");
        int a = sc.nextInt();
        int toplam = 0;

        for (int i = 1; i < a; i++) {

            if (a % i == 0) {
                toplam += i;
            }

        }

        if (toplam == a) {
            System.out.println(a + " Mükemmel Sayıdır");
        } else {
            System.out.print(a + " Mükemmel Sayı Değildir");
        }

    }

}
