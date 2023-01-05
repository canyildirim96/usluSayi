import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       int a,b;
       int total=1;
       Scanner inp = new Scanner(System.in);

        System.out.print("Üssü Alınacak Sayıyı Giriniz: ");
        a = inp.nextInt();

        System.out.print("Üsse Alınacak Sayıyı Giriniz: ");
        b = inp.nextInt();

        for (int i = 1; i<=b; i++){
            total *=a;
        }
        System.out.println("Cevap: " + total);
    }
}