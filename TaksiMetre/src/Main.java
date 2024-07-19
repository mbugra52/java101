import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       double km, perKm= 17.61, startingPrice=24.55, total ;
       Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi Giriniz: ");
       km = input.nextDouble();

       total= km*perKm + startingPrice;

       total = total<90 ? 90 : total;

        System.out.print("Toplam Tutar : "+ total);

    }
}
