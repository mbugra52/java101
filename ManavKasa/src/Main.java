import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut=2.14, elma=3.67, domates=1.11, muz=0.95, patlican=5, elmakg,armutkg,muzkg,domateskg,patlicankg;

        Scanner input=new Scanner(System.in);

        System.out.print("Armut Kilosunu Giriniz: ");
        armutkg=input.nextDouble();
        System.out.print("Elma Kilosunu Giriniz: ");
        elmakg=input.nextDouble();
        System.out.print("Domates Kilosunu Giriniz: ");
        domateskg=input.nextDouble();
        System.out.print("Muz Kilosunu Giriniz: ");
        muzkg=input.nextDouble();
        System.out.print("Patlıcan Kilosunu Giriniz: ");
        patlicankg=input.nextDouble();

        double elmafiyat, armutfiyat,domatesfiyat,muzfiyat,patlicanfiyat,total;

        elmafiyat = elmakg*elma;
        armutfiyat= armutkg*armut;
        muzfiyat= muzkg*muz;
        domatesfiyat=domateskg*domates;
        patlicanfiyat=patlicankg*patlican;
        total=elmafiyat + armutfiyat+muzfiyat+domatesfiyat+patlicanfiyat;

        System.out.println("Armut Fiyatı:"+armutfiyat);
        System.out.println("Elma Fiyatı:"+elmafiyat);
        System.out.println("Domates Fiyatı:"+ domatesfiyat);
        System.out.println("Muz Fiyatı:"+muzfiyat);
        System.out.println("Patlıcan Fiyatı:"+patlicanfiyat);
        System.out.println("Toplam Tutar:"+total);

    }
}
