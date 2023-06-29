import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // değişkenler
        int n1, n2, select;
        Scanner input = new Scanner(System.in);
        // kullanıcıdan veri alma
        System.out.print("İlk sayıyı giriniz: ");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2 = input.nextInt();
        System.out.println("1- Toplama\n2- Çıkarma\n3- Çarpma\n4- Bölme");
        System.out.print("Seçiminiz: ");
        select = input.nextInt();
        // işlem tercihine göre sonuç yazdırma
        switch (select) {
            case 1 -> System.out.println("Toplam: " + (n1 + n2));
            case 2 -> System.out.println("Çıkarma: " + (n1 - n2));
            case 3 -> System.out.println("Çarpma: " + (n1 * n2));
            case 4 -> System.out.println("Bölme: " + (n1 / n2));
            default -> System.out.println("Yanlış seçim yaptınız.");
        }
    }
}
