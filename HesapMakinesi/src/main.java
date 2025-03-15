import java.util.Scanner;

public class main {
    public static void main(String[] args) {
      int a,b,c;

      Scanner input= new Scanner(System.in);
        System.out.print("1. Sayıyı Giriniz:");
        a=input.nextInt();
        System.out.print("2. Sayıyı Giriniz:");
        b=input.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz:");
        c=input.nextInt();

        switch(c){
            case 1:
                System.out.print("Sonuç="+(a+b));
                break;

            case 2:
                System.out.print("Sonuç="+(a-b));
                break;

            case 3:
                System.out.print("Sonuç="+(a*b));
                break;

            case 4:
                if(b==0){
                    System.out.print("Tanımsız");
                }else{
                    System.out.println("Sonuç="+(a/b));
                }

                break;
            default:
                System.out.print("Hatalı Seçim Yaptınız");
        }

    }
}
