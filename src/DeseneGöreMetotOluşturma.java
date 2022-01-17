import java.util.Scanner;

public class DeseneGöreMetotOluşturma {
    static int eksi(int n,int temp) {
        System.out.print(n + " ");
        if (n <= 0) {
            return arti(n+5, temp);
        } else {
            return eksi(n - 5, temp);
        }
    }

    static int arti(int n,int temp) {
        System.out.print(n + " ");
        if (n == temp) {
            return 0;
        } else {
            return arti(n + 5, temp);
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("N sayısı: ");
        int N= input.nextInt();
        int y=N;

        eksi(N,y);
    }
}
