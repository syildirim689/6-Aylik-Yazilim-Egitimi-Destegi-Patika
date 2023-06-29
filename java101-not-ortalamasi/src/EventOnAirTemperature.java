import java.util.Scanner;

public class EventOnAirTemperature {
    public static void main(String[] args) {
        // değişkenler
        int temperature;
        // kullanıcıdan veri alma
        Scanner input = new Scanner(System.in);
        System.out.print("Hava sıcaklığını giriniz: ");
        temperature = input.nextInt();
        // girilen değere göre işlem yapma ve sonucu yazdırma
        if (temperature < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if (temperature < 15) {
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if (temperature <= 25) {
            System.out.println("Pikniğe gidebilirsiniz.");
        } else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
