import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Basamak Sayısını Giriniz :");
        int a = sc.nextInt();

        for (int i = a ; i >= 1; i--) {

            for (int j = 1; j <= (2*i)-1; j++) {
                System.out.print("*");
            }

            System.out.println();
            
        }

    }
}
