import java.util.Scanner;

public class FindEvenNumbers {
    public static void main(String[] args) {
        // kullanıcıdan veri alma
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = scanner.nextInt();
        // değişkenler
        int sum = 0;
        int count = 0;
        // for döngüsü ile 3 ve 4'e tam bölünen sayıları bulma
        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                count++;
            }
        }
        double average = (double) sum / count;
        // sonucu ekrana yazdırma
        System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: " + average);
    }
}
