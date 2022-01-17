import java.util.Scanner;

public class RecursiveileFibonacciSerisiBulanProgram {
    static  int n1=0;
    static int n2=1;
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Fibanocci basamağını giriniz: ");
        int sayı= input.nextInt();
        System.out.println("fibanocci sayıları: "+fib(sayı));

    }
    static int fib(int sayı){
        if(sayı==1||sayı==0){
            return 1;
        }

            return fib(sayı-1)+fib(sayı-2);
        }
    }

