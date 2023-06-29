import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        // kullanıcıdan veri alma
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yıl Giriniz: ");
        // değişkenler
        int year = scanner.nextInt();
        boolean isLeapYear = false;
        // artık yıl hesaplama
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
        // sonucu ekrana yazdırma
        if (isLeapYear) {
            System.out.println(year + " bir artık yıldır!");
        } else {
            System.out.println(year + " bir artık yıl değildir!");
        }
    }
}
