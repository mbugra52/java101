import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yil;

        Scanner sc = new Scanner(System.in);
        System.out.print("Bir Yıl Giriinz:");
        yil = sc.nextInt();

        if (yil % 100 == 0) {
            if (yil % 400 == 0) {
                System.out.printf(yil + " Bir Artık Yıldır");
            } else {
                System.out.printf(yil + " Bir Artık Yıl Değildir");
            }
        } else if (yil % 4 == 0) {
            System.out.printf(yil + " Bir Artık Yıldır");
        } else {
            System.out.printf(yil + " Bir Artık Yıl Değildir");
        }
    }
}
