import java.util.Scanner;

public class PalindromSayılar {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayı giriniz: " );
        int sayı= input.nextInt();
        System.out.println(isPolindrom(sayı));
    }static boolean  isPolindrom(int sayı) {
        int temp = sayı;
        int reverseNumber = 0;
        int lastNumber = 0;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp = temp/10;
        }
        if(reverseNumber==sayı){
            return true;
        }else{
            return false;
        }

    }


}
