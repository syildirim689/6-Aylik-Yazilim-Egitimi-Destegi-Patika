import java.util.Scanner;
public class FlightTicket {
    public static void main(String[] args) {
        // kullanıcıdan veri alma
        Scanner scanner = new Scanner(System.in);
        // mesaefeyi km türünden alma
        System.out.print("Mesafeyi km türünden giriniz: ");
        int distance = scanner.nextInt();
        if (distance <= 0) {
            System.out.println("Hatalı Veri Girdiniz!");
            return;
        }
        // yaş bilgisini alma
        System.out.print("Yaşınızı giriniz: ");
        int age = scanner.nextInt();
        if (age <= 0) {
            System.out.println("Hatalı Veri Girdiniz!");
            return;
        }
        // yolculuk tipini alma
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş): ");
        int tripType = scanner.nextInt();
        // veri kontrolü
        if (tripType != 1 && tripType != 2) {
            System.out.println("Hatalı Veri Girdiniz!");
            return;
        }
        double basePrice = distance * 0.10;
        double totalPrice = basePrice;
        // indirimleri hesaplama
        if (age < 12) {
            totalPrice -= basePrice * 0.50; // %50 indirim
        } else if (age <= 24) {
            totalPrice -= basePrice * 0.10; // %10 indirim
        } else if (age >= 65) {
            totalPrice -= basePrice * 0.30; // %30 indirim
        }
        if (tripType == 2) {
            totalPrice *= 0.80; // %20 indirim
        }
        // sonucu ekran yazdırma
        System.out.println("Toplam Tutar = " + totalPrice + " TL");
    }
}
