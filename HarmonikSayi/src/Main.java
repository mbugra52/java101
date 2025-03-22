import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        double result = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz:");
        n = sc.nextInt();

        for (double i = 1; i <= n; i++) {
            result += 1 / i; //i yi double aldık çünkü resultta double -> int/double=double eğer i yi int alsaydık int sonucu çıkardı
        }

        System.out.print("Sonuç : " + result);

    }
}
