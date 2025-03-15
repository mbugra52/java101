import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String ad, sifre, yeniSifre;
        int deger;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız Giriniz:");
        ad = input.nextLine();
        System.out.print("Şifrenizi Giriniz:");
        sifre = input.nextLine();

        if (ad.equals("Patika") && sifre.equals("Dev")) {
            System.out.print("Başarıyla Giriş Yaptınız");
        } else {
            System.out.print("Bilgileriniz Yanlış\nŞifrenizi Değiştirmek İçin 1'e Basınız:");
            deger = input.nextInt();
            input.nextLine();

            if (deger == 1) {
                System.out.print("Yeni Şifrenizi Giriniz:");
                yeniSifre = input.nextLine();

                if (!yeniSifre.equals("Dev")) {
                    System.out.println("Şifre Değiştirildi");
                    System.out.print("Tekrardan Giriş Yapmayı Deneyiniz\nKullanıcı Adı:");
                    ad = input.nextLine();
                    System.out.print("Şifrenizi Giriniz:");
                    sifre = input.nextLine();

                    if (ad.equals("Patika") && sifre.equals(yeniSifre)) {
                        System.out.print("Başarıyla Giriş Yaptınız");
                    } else {
                        System.out.print("Giriş Başarısız");
                    }

                } else {
                    System.out.print("Yeni Şifre Eskisiyle Aynı Olamaz");
                }

            }
        }
    }
}


