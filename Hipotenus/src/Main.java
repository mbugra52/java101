import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b;
        double c;
        Scanner input= new Scanner(System.in);

        System.out.print("a Dik Kenarını Giriniz:");
        a = input.nextInt();
        System.out.print("b Dik Kenarını Giriniz:");
        b = input.nextInt();

        //formülü tam yazamadığımız için Math.sqrt kullanarak karekök içine aldık.
        c = Math.sqrt((a*a) + (b*b));

        System.out.println("Hiptenüs :"+ c );

        double alan;

        alan= a*b/2;

        System.out.print("Alan:"+ alan);





    }
}
