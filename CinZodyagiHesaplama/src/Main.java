import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int dogumyılı;

        Scanner input = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz:");
        dogumyılı = input.nextInt();

        if (dogumyılı % 12 == 0) {
            System.out.print("Çin Zodyağı Burcunuz: Maymun");
        } else if (dogumyılı % 12 == 1) {
            System.out.print("Çin Zodyağı Burcunuz: Horoz");
        } else if (dogumyılı % 12 == 2) {
            System.out.print("Çin Zodyağı Burcunuz: Köpek");
        } else if (dogumyılı % 12 == 3) {
            System.out.print("Çin Zodyağı Burcunuz: Domuz");
        } else if (dogumyılı % 12 == 4) {
            System.out.print("Çin Zodyağı Burcunuz: Fare");
        } else if (dogumyılı % 12 == 5) {
            System.out.print("Çin Zodyağı Burcunuz: Öküz");
        } else if (dogumyılı % 12 == 6) {
            System.out.print("Çin Zodyağı Burcunuz: Kaplan");
        } else if (dogumyılı % 12 == 7) {
            System.out.print("Çin Zodyağı Burcunuz: Tavşan");
        } else if (dogumyılı % 12 == 8) {
            System.out.print("Çin Zodyağı Burcunuz: Ejderha");
        } else if (dogumyılı % 12 == 9) {
            System.out.print("Çin Zodyağı Burcunuz: Yılan");
        } else if (dogumyılı % 12 == 10) {
            System.out.print("Çin Zodyağı Burcunuz: At");
        } else if (dogumyılı % 12 == 11) {
            System.out.print("Çin Zodyağı Burcunuz: Koyun");
        }
    }
}
