import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // kullanıcıdan yarıçap ve merkez açısının ölçüsünü al
        System.out.print("Yarıçapı giriniz: ");
        int r = scan.nextInt();
        System.out.print("Merkez açısının ölçüsünü giriniz: ");
        int a = scan.nextInt();

        double pi = 3.14;
        // hesap işlemleri
        double alan = (pi * (r*r) * a) / 360;
        // sonucu ekrana yazdır
        System.out.println("Daire diliminin alanı: " + alan);
    }
}
