import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // değişkenler
        int km;
        double perKm = 2.20, total, startPrice = 10;
        // kullanıcıdan veri alma
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km cinsinden giriniz: ");
        km = input.nextInt();
        // hesaplama işlemi
        total = (km * perKm);
        total += startPrice;

        total = (total < 20) ? 20 : total;
        // sonucu ekrana yazdırma
        System.out.println("Toplam Tutar: " + total);
    }
}
