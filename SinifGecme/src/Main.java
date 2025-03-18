import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, biyo, turkce, muzik;
        int ders = 0;
        int ort = 0;
        double ort2;


        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz:");
        mat = input.nextInt();
        if (mat >= 0 && mat <= 100) {
            ort += mat;
            ders++;
        }

        System.out.print("Fizik Notunuz:");
        fizik = input.nextInt();
        if (fizik >= 0 && fizik <= 100) {
            ort += fizik;
            ders++;
        }

        System.out.print("Kimya Notunuz:");
        kimya = input.nextInt();
        if (kimya >= 0 && kimya <= 100) {
            ort += kimya;
            ders++;
        }

        System.out.print("Biyoloji Notunuz:");
        biyo = input.nextInt();
        if (biyo >= 0 && biyo <= 100) {
            ort += biyo;
            ders++;
        }

        System.out.print("Türkçe Notunuz:");
        turkce = input.nextInt();
        if (turkce >= 0 && turkce <= 100) {
            ort += turkce;
            ders++;
        }

        System.out.print("Müzik Notunuz:");
        muzik = input.nextInt();
        if (muzik >= 0 && muzik <= 100) {
            ort += muzik;
            ders++;
        }

        if (ders > 0) {
            ort2 = ort / ders;
            System.out.println("Ortalamanız: " + ort2);
            if (ort2 < 45) {
                System.out.println("Sınıfta Kaldınız");
            } else {
                System.out.println("Sınıfı Geçtiniz)");
            }

        } else {
            System.out.println("Ortalama Hesaplanamadı\nLütfen Geçerli Notlar Giriniz");
        }
    }
}
