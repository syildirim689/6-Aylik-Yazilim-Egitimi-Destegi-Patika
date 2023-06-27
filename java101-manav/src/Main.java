import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // kullanıcıdan veri alma
        Scanner input = new Scanner(System.in);
        System.out.println("Armut kaç kilo? ");
        double armut = input.nextDouble();
        System.out.println("Elma kaç kilo? ");
        double elma = input.nextDouble();
        System.out.println("Domates kaç kilo? ");
        double domates = input.nextDouble();
        System.out.println("Muz kaç kilo? ");
        double muz = input.nextDouble();
        System.out.println("Patlıcan kaç kilo? ");
        double patlican = input.nextDouble();
        // toplam tutar hesaplama
        double toplam = (armut * 2.14) + (elma * 3.67) + (domates * 1.11) + (muz * 0.95) + (patlican * 5.00);
        // sonucu yazdırma
        System.out.println("Toplam tutar: " + toplam);
    }
}
