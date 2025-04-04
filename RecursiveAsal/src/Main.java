import java.util.Scanner;

public class Main {
    public static boolean isPrime(int number, int divisor) {
        if (number < 2) return false; // 2'den küçük sayılar asal değildir.
        if (divisor == 1) return true; // Eğer bölen kalmadıysa, asaldır.
        if (number % divisor == 0) return false; // Eğer bölündüyse asal değildir.

        return isPrime(number, divisor - 1); // Bir önceki böleni kontrol et.
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        if (isPrime(number, number / 2)) { // Sayının yarısından kontrol etmeye başla
            System.out.println(number + " sayısı ASALDIR!");
        } else {
            System.out.println(number + " sayısı ASAL değildir!");
        }
    }
}