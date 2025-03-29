import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N1 Sayısını Giriniz :");
        int n1 = sc.nextInt();
        System.out.print("N2 Sayısını Giriniz :");
        int n2 = sc.nextInt();

        int ebob, ekok;
        int i = n1;
        int k = 1;

        if (n1 <= n2) {

            while (i >= 1) { // tersten yapma amacı daha az işlem yaptırmak
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                    System.out.println("EBOB :" + i);
                    break; //en büyük sayıdan sonra döngüyü durdur
                }
                i--;
            }

            while (k <= (n1 * n2)) {
                if (k % n1 == 0 & k % n2 == 0) {
                    System.out.println("EKOK : " + k);
                    break;
                }
                k++;
            }

        } else {

            while (i >= 1) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                    System.out.println("EBOB :" + i);
                    break;
                }
                i--;
            }

            while (k <= (n1 * n2)) {
                if (k % n1 == 0 & k % n2 == 0) {
                    System.out.println("EKOK : " + k);
                    break;
                }
                k++;
            }

        }

    }
}
