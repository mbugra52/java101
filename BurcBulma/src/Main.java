import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ay, gun;

        Scanner input = new Scanner(System.in);

        System.out.print("Kaçıncı Ayda Doğduğunuzu Giriniz:");
        ay = input.nextInt();
        System.out.print("Hangi Gün Doğduğunuzu Giriniz:");
        gun = input.nextInt();

        if ((ay >= 1 && ay <= 12) && (gun >= 1 && gun <= 31)) {

            if ((ay == 1 && gun <= 21) || (ay == 12 && gun >= 22)) {
                System.out.print("Oğlak Burcu");
            } else if ((ay == 1 && gun >= 22) || (ay == 2 && gun <= 19)) {
                System.out.print("Kova Burcu");
            } else if ((ay == 2 && (gun >= 20 && gun <= 29)) ||(ay == 3 && gun <= 20)){
                System.out.print("Balık Burcu");
            } else if ((ay == 3 && gun >= 21) || (ay == 4 && gun <= 20)) {
                System.out.println("Koç Burcu");

            } else if ((ay == 4 && gun >= 21) || (ay == 5 && gun <= 21)) {
                System.out.println("Boğa Burcu");

            } else if ((ay == 5 && gun >= 22) || (ay == 6 && gun <= 22)) {
                System.out.println("İkizler Burcu");

            } else if ((ay == 6 && gun >= 23) || (ay == 7 && gun <= 22)) {
                System.out.println("Yengeç Burcu");

            } else if ((ay == 7 && gun >= 23) || (ay == 8 && gun <= 22)) {
                System.out.println("Aslan Burcu");

            } else if ((ay == 8 && gun >= 23) || (ay == 9 && gun <= 22)) {
                System.out.println("Başak Burcu");

            } else if ((ay == 9 && gun >= 23) || (ay == 10 && gun <= 22)) {
                System.out.println("Terazi Burcu");

            } else if ((ay == 10 && gun >= 23) || (ay == 11 && gun <= 21)) {
                System.out.println("Akrep Burcu");

            } else if ((ay == 11 && gun >= 22) || (ay == 12 && gun <= 21)) {
                System.out.println("Yay Burcu");
            }
        } else {
            System.out.print("Hatalı Ay veya Gün Girdiniz");
        }
    }
}
