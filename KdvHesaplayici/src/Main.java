import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar, KdvOran, KdvTutar, Toplam;
        Scanner input= new Scanner(System.in);

        System.out.print("Tutarı Giriniz:");
        tutar= input.nextDouble();


         KdvOran=(tutar <1000) ? 0.2 : 0.1;
         KdvTutar=tutar * KdvOran;
         Toplam= KdvTutar + tutar;

        System.out.println("KDV Oranı:"+ KdvOran);
        System.out.println("KDV Değeri:"+ KdvTutar);
        System.out.println("Toplam Tutar:"+ Toplam);


    }
}
