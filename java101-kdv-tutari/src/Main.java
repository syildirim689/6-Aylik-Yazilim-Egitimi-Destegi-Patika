import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //scanner sınıfı
        Scanner scan = new Scanner(System.in);
        //kullanıcıdan değer almak
        System.out.print("Ücreti giriniz: ");
        //kullanıcıdan alınan değeri değişkene atamak
        double ucret = scan.nextDouble();
        //kdv 1000'den büyükse %8, değilse %18 olarak hesaplayan koşul ifadesi
        double kdv = ucret > 1000 ? ucret * 0.08 : ucret * 0.18;
        //kdv'li ücreti hesaplamak
        double kdvliUcret = ucret + kdv;
        //ekrana yazdırmak
        System.out.println("KDV'siz ücret: " + ucret);
        System.out.println("KDV'li ücret: " + kdvliUcret);
        System.out.println("KDV tutarı: " + kdv);
        //kdv diilimini ekrana yazdırmak
        System.out.println("KDV dilimi: " + (ucret > 1000 ? "8%" : "18%"));
    }
}
