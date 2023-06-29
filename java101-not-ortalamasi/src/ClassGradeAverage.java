import java.util.Scanner;
public class ClassGradeAverage {
    public static void main(String[] args) {
        // değişkenler
        int matematik, fizik, kimya, turkce, tarih, muzik;
        int passGrade = 55;
        // kullanıcıdan veri alma
        Scanner inp = new Scanner(System.in);
        System.out.print("Matematik notunuz: ");
        matematik = inp.nextInt();
        System.out.print("Fizik notunuz: ");
        fizik = inp.nextInt();
        System.out.print("Kimya notunuz: ");
        kimya = inp.nextInt();
        System.out.print("Turkce notunuz: ");
        turkce = inp.nextInt();
        System.out.print("Tarih notunuz: ");
        tarih = inp.nextInt();
        System.out.print("Muzik notunuz: ");
        muzik = inp.nextInt();
        // hesaplama işlemleri
        int total = matematik + fizik + kimya + turkce + tarih + muzik;
        double average = total / 6.0;
        boolean isPass = average > passGrade;
        // sonucu ekrana yazdırma
        System.out.println("Ortalamanız: " + average);
        System.out.println("Sınıfı geçme durumunuz: " + (isPass ? "Geçti" : "Kaldı"));
    }
}
