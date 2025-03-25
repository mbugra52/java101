import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner sc = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0) {

            System.out.print("Kullanıcı Adınız:");
            userName = sc.nextLine();
            System.out.print("Şifrenizi Giriniz:");
            password = sc.nextLine();

            if (userName.equals("Patika") && password.equals("Dev123")) {
                System.out.println("Sisteme Giriş Yaptınız");

                do {
                    System.out.println("Lütfen Yapmak İstediğiniz İşlemi Seçiniz");
                    System.out.println("1- Para Yatırma \n2- Para Çekme\n3- Bakiye Sorgulama\n4- Çıkış Yapma");
                    System.out.print("Seçiminiz :");
                    select = sc.nextInt();

                    switch (select) {

                        case 1:
                            System.out.print("Para Mikrtarı :");
                            int price = sc.nextInt();
                            balance += price;
                            break;

                        case 2:
                            System.out.print("Para Miktarı :");
                            price = sc.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye Yetersiz");
                            } else {
                                balance -= price;
                            }
                            break;

                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;

                    }
                } while (select != 4);
                System.out.print("Tekrar Görüşmek Üzere");
                break;

            } else {
                right--;
                System.out.println("Hatalı Kullanıcı Adı veya Şifre\nTekrar Deneyiniz");
                if (right == 0) {
                    System.out.print("Hesabınız Bloke Edilmiştir\nLütfen Banka ile İletişime Geçiniz");
                } else {
                    System.out.println("Kalan Hakkınız :" + right);
                }
            }
        }

    }
}
