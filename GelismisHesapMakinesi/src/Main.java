import java.util.Scanner;

public class Main {

    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Toplam : " + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("Çıkarma : " + result);
        return result;
    }

    static int times(int a, int b) {
        int result = a * b;
        System.out.println("Çarpma : " + result);
        return result;
    }

    static int divide(int a, int b) {
        if (b == 0) {
            return 0;
        }
        int result = a / b;
        System.out.println("Bölme : " + result);
        return result;
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println("Üs İşlemi : " + result);
        return result;
    }

    static void factorial(int a, int b) {
        int result1 = 1;
        int result2 = 1;
        for (int i = 1; i <= a; i++) {
            result1 *= i;
        }

        for (int i = 1; i <= b; i++) {
            result2 *= i;
        }
        System.out.println("Birinci Sayının Faktöriyeli : " + result1);
        System.out.println("İkinci Sayının Faktöriyeli : " + result2);

    }

    static int mod(int a, int b) {
        int result = a % b;
        System.out.println("Mod İşlemi : " + result);
        return result;
    }

    static void rectangle(int a, int b) {
        int perimeter = 2 * (a + b);
        int area = a * b;
        System.out.println("Dikdörtgenin Çevresi : " + perimeter);
        System.out.println("Dikdörtgenin Alanı : " + area);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select;

        String menu = "1- Toplama İşlemi\n" +
                "2- Çıkarma İşlemi\n" +
                "3- Çarpma İşlemi\n" +
                "4- Bölme işlemi\n" +
                "5- Üslü Sayı Hesaplama\n" +
                "6- Faktoriyel Hesaplama\n" +
                "7- Mod Alma\n" +
                "8- Dikdörtgen Alan ve Çevre Hesabı\n" +
                "9- Çıkış Yap ";

        System.out.println(menu);

        while (true) {
            System.out.print("Bir İşlem Seçiniz : ");
            select = scanner.nextInt();

            if (select == 9) {
                break;
            }

            System.out.print("Birinci Sayıyı Giriniz : ");
            int a = scanner.nextInt();
            System.out.print("İkinci Sayıyı Giriniz : ");
            int b = scanner.nextInt();

            switch (select) {
                case 1:
                    sum(a, b);
                    break;

                case 2:
                    minus(a, b);
                    break;

                case 3:
                    times(a, b);
                    break;

                case 4:
                    if (divide(a, b) == 0) {
                        System.out.print("Tanımsız. İkinci Sayı Sıfırdan Farklı Olmalı");
                    }
                    divide(a, b);
                    break;

                case 5:
                    power(a, b);
                    break;

                case 6:
                    factorial(a, b);
                    break;

                case 7:
                    mod(a, b);
                    break;

                case 8:
                    rectangle(a, b);
                    break;

                default:
                    System.out.println("Geçersiz Bir Değer Girdiniz");
            }
        }
        System.out.println("Güle Güle ");
    }
}
