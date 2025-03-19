import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sicak;

        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklığı Giriniz:");
        sicak = input.nextInt();

        if (sicak < 5) {
            System.out.print("Kayak Yapabilirsiniz");
        } else if (sicak >= 5 && sicak < 10) {
            System.out.print("Sinemaya Gidebilirsiniz");
        } else if (sicak >= 10 && sicak < 15) {
            System.out.println("Sinemaya Gidebilirsiniz");
            System.out.print("Pikniğe Gidebilirsiniz");
        } else if (sicak >= 15 && sicak <= 25) {
            System.out.print("Pikniğe Gidebilirsiniz");
        } else {
            System.out.print("Yüzmeye Gidebilirsiniz");
        }


    }
}
