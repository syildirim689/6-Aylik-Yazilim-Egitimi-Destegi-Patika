import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenler
        int mat, fizik, kimya, turkce, tarih, muzik;

        // Scanner sınıfı tanımlama
        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan değer alma
        System.out.print("Matematik notunuz: ");
        mat = inp.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = inp.nextInt();

        System.out.print("Türkçe notunuz: ");
        turkce = inp.nextInt();

        System.out.print("Tarih notunuz: ");
        tarih = inp.nextInt();

        System.out.print("Müzik notunuz: ");
        muzik = inp.nextInt();

        // Ortalama hesaplama
        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0;

        // Sonucu ekrana yazdırma
        System.out.println("Ortalamanız: " + sonuc);

        // Durum kontrolü
        boolean kosul1 = sonuc >= 60;
        boolean kosul2 = sonuc <= 100;
        boolean sonuc1 = (kosul1 && kosul2);
        boolean kosul3 = sonuc >= 0;
        boolean kosul4 = sonuc < 60;
        boolean sonuc2 = (kosul3 && kosul4);

        // Duruma göre ekrana yazdırma
        System.out.println("Durum: " + (sonuc1 ? "Sınıfı Geçti" : (sonuc2 ? "Sınıfta Kaldı" : "Hatalı Değer Girdiniz!")));
    }
}
