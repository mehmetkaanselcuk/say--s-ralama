import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("1. sayıyı girin: ");
        int a = input.nextInt();

        System.out.print("2. sayıyı girin: ");
        int b = input.nextInt();

        System.out.print("3. sayıyı girin: ");
        int c = input.nextInt();

        int enKucuk, orta, enBuyuk;

        if (a <= b && a <= c) {
            enKucuk = a;
            if (b <= c) {
                orta = b;
                enBuyuk = c;
            } else {
                orta = c;
                enBuyuk = b;
            }
        } else if (b <= a && b <= c) {
            enKucuk = b;
            if (a <= c) {
                orta = a;
                enBuyuk = c;
            } else {
                orta = c;
                enBuyuk = a;
            }
        } else {
            enKucuk = c;
            if (a <= b) {
                orta = a;
                enBuyuk = b;
            } else {
                orta = b;
                enBuyuk = a;
            }
        }

        System.out.println("Sıralama: " + enKucuk + " < " + orta + " < " + enBuyuk);

        input.close();
    }
}
