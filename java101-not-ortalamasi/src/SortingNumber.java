import java.util.Scanner;

public class SortingNumber {
    public static void main(String[] args) {
        // değişkenler
        int a, b, c;
        // kullanıcıdan veri alma
        Scanner input = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz: ");
        a = input.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        b = input.nextInt();
        System.out.print("3. sayıyı giriniz: ");
        c = input.nextInt();
        // koşullar ile sıralama ve ekrana sonucu yazdırma
        if (a < b && a < c) {
            if (b < c) {
                System.out.println(a + " < " + b + " < " + c);
            } else {
                System.out.println(a + " < " + c + " < " + b);
            }
        } else if (b < a && b < c) {
            if (a < c) {
                System.out.println(b + " < " + a + " < " + c);
            } else {
                System.out.println(b + " < " + c + " < " + a);
            }
        } else {
            if (a < b) {
                System.out.println(c + " < " + a + " < " + b);
            } else {
                System.out.println(c + " < " + b + " < " + a);
            }
        }
    }
}
