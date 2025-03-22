import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz:");
        int sayi = sc.nextInt();
        int tempSayi = sayi;
        int digitNumber = 0;
        int digitValue;
        int result = 0;
        int basPow;

        while (tempSayi != 0) {
            tempSayi /= 10;
            digitNumber++;
        }

        tempSayi = sayi; //While çalışınca sayı 0 a düştü bu yüzden yeniden atadık

        while (tempSayi != 0) {

            digitValue = tempSayi % 10;
            basPow = 1;

            for (int i = 1; i <= digitNumber; i++) {
                basPow *= digitValue;  // Basamak sayısı kadar üssünü al
            }
            result += basPow;  // Sonucu toplama ekle
            tempSayi /= 10;     // Sayıyı bir basamak küçült

        }

        if (result == sayi) {
            System.out.print(sayi + " Bir Armstrong Sayısıdır");
        } else {
            System.out.print(sayi + " Bir Armstrong Sayı Değildir");
        }

    }
}
