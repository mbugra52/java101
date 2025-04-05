import java.util.Scanner;

public class Main {
    static void metot(int a) {
        System.out.print(a + " ");

        if (a <= 0) {
            return;
        }
        
        metot(a-5);

        System.out.print(a + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int a = sc.nextInt();

        System.out.print("Çıktısı : " );
        metot(a);
    }
}
