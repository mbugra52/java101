public class Main {

    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastDigit;
        while (temp != 0) {
            lastDigit = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            temp /= 10;
        }

        if (number == reverseNumber)
            return true;
        else
            return false;      //tek satır olduğu için paranteze gerek yok

    }

    public static void main(String[] args) {
        System.out.println(isPalindrom());

    }
}
