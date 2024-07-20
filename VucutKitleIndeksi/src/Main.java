import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     double kg,height,bmi;
        Scanner input=new Scanner(System.in);

        System.out.print("Boyunuzu (m) Giriniz:");
        height=input.nextDouble();
        System.out.print("Kilonuzu (kg) Giriniz:");
        kg=input.nextDouble();

        bmi= kg / (height * height);

        System.out.print("Vücut Kitle İndeksiniz: "+ bmi);



    }
}
