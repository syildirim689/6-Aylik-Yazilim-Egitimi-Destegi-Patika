import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // değişkenler
        int a, b, c;
        double u, alan;

        // scanner sınıfı
        Scanner input = new Scanner(System.in);

        // kullanıcıdan veri alma
        System.out.print("1. Kenar: ");
        a = input.nextInt();
        System.out.print("2. Kenar: ");
        b = input.nextInt();
        System.out.print("3. Kenar: ");
        c = input.nextInt();

        // alan hesaplama
        u = (a + b + c) / 2.0;
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        // sonucu ekrana yazdırma
        System.out.println("Üçgenin Alanı: " + alan);
    }
}
