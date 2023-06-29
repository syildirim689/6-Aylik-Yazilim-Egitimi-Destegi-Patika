import java.util.Scanner;
public class ChinaZodiac {
    public static void main(String[] args) {
        // kullanıcıdan veri alma
        Scanner scanner = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz: ");
        int birthYear = scanner.nextInt();
        // kullanıcıdan alınan veriye göre işlem yapma
        int zodiacIndex = birthYear % 12;
        String zodiacSign = switch (zodiacIndex) {
            case 0 -> "Maymun";
            case 1 -> "Horoz";
            case 2 -> "Köpek";
            case 3 -> "Domuz";
            case 4 -> "Fare";
            case 5 -> "Öküz";
            case 6 -> "Kaplan";
            case 7 -> "Tavşan";
            case 8 -> "Ejderha";
            case 9 -> "Yılan";
            case 10 -> "At";
            case 11 -> "Koyun";
            default -> "Hatalı Veri Girdiniz!";
        };
        // sonucu ekrana yazdırma
        System.out.println("Çin Zodyağı Burcunuz: " + zodiacSign);
    }
}
