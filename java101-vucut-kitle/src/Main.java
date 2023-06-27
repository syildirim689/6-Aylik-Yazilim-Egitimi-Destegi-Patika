import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // değişkenler
        // kullanıcıdan veri alma
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz. (örn: 1,75): ");
        double m = input.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz. (örn: 75): ");
        double kg = input.nextDouble();
        // formül
        double i = kg / (m * m);
        // sonucu yazdırma
        System.out.println("Vücut Kitle İndeksiniz: " + i);
    }
}
