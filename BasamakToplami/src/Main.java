import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, digit = 0;
        Scanner scan = new Scanner(System.in);


        System.out.println("Sayı Giriniz :");
        number = scan.nextInt();

        while (number != 0) {
            digit += number % 10;
            number /= 10;
        }

        System.out.println("Basamakların Toplamı : " + digit);

    }

}

