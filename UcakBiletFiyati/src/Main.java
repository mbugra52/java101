import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km, yas, tur;
        double tutar, tutar2, tutar3, indirim, indirim2;
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km Türünden Giriniz:");
        km = input.nextInt();
        System.out.print("Yaşınızı Giriniz:");
        yas = input.nextInt();
        System.out.print("Yolculuk Tipini Giriniz(1-Tek Yön 2- Gidiş-Dönüş):");
        tur = input.nextInt();

        tutar = km * 0.10;


        switch (tur) {

            case 1:
                if (km > 0 && yas > 0) {
                    if (yas < 12) {
                        indirim = tutar * 0.50;
                        tutar2 = tutar - indirim;
                        System.out.print("Toplam Tutar:" + tutar2);
                    } else if (yas >= 12 && yas <= 24) {
                        indirim = tutar * 0.10;
                        tutar2 = tutar - indirim;
                        System.out.print("Toplam Tutar:" + tutar2);
                    } else if (yas > 24 && yas < 65) {
                        System.out.print("Toplam Tutar:" + tutar);
                    } else if (yas >= 65) {
                        indirim = tutar * 0.30;
                        tutar2 = tutar - indirim;
                        System.out.print("Toplam Tutar:" + tutar2);
                    }
                } else {
                    System.out.print("Hatalı Veri Girdiniz");
                }
                break;

            case 2:
                if (km > 0 && yas > 0) {
                    if (yas < 12) {
                        indirim = tutar * 0.50;
                        tutar2 = tutar - indirim;
                        indirim2 = tutar2 * 0.20;
                        tutar3 = (tutar2 - indirim2) * 2;
                        System.out.print("Toplam Tutar:" + tutar3);
                    } else if (yas >= 12 && yas <= 24) {
                        indirim = tutar * 0.10;
                        tutar2 = tutar - indirim;
                        indirim2 = tutar2 * 0.20;
                        tutar3 = (tutar2 - indirim2) * 2;
                        System.out.print("Toplam Tutar:" + tutar3);
                    } else if (yas > 24 && yas < 65) {
                        indirim = tutar * 0.20;
                        tutar2 = tutar - indirim;
                        tutar3 = (tutar2 - indirim) * 2;
                        System.out.print("Toplam Tutar:" + tutar3);
                    } else if (yas >= 65) {
                        indirim = tutar * 0.30;
                        tutar2 = tutar - indirim;
                        indirim2 = tutar2 * 0.20;
                        tutar3 = (tutar2 - indirim2) * 2;
                        System.out.print("Toplam Tutar:" + tutar3);
                    }
                } else {
                    System.out.print("Hatalı Veri Girdiniz");
                }
                break;
            default:
                System.out.print("Hatalı Giriş Yaptınız");
        }
    }
}
