import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pi=3.14, area, circumference,circleSlice;
        int r, a;
        Scanner input=new Scanner(System.in);

        System.out.print("Yarıçapı Giriniz:");
        r=input.nextInt();
        System.out.print("Merkez Açısını Giriniz: ");
        a=input.nextInt();

        area= pi*r*r;
        circumference= 2*pi*r;
        circleSlice=pi*r*r*a/360;

        System.out.println("Daire Alanı:"+ area);
        System.out.println("Daire Çevresi:"+ circumference);
        System.out.println("Daire Dilimi Alanı:"+circleSlice);

    }
}
