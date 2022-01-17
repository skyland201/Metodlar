import java.util.Scanner;

public class ÜsHesabıYapanProgram {
    static int üsAlma(int x,int y){
if(y==0){
    return 1;
}else{
    return x*üsAlma(x,y-1);

    }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Taban değerini giriniz: ");
        int taban= input.nextInt();
        System.out.println("Üs değerini giriniz: ");
        int üs= input.nextInt();

        System.out.println(üsAlma(taban,üs));
    }
}
