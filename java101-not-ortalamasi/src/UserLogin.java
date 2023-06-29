import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        // değişkenler
        String userName, password;
        // kullanıcıdan veri alma
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adınız: ");
        userName = input.nextLine();
        System.out.print("Şifreniz: ");
        password = input.nextLine();
        // kullanıcı adı ve şifre kontrolü
        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız!");
        } else {
            System.out.println("Kullanıcı adı veya şifre hatalı!");
            System.out.print("Şifrenizi sıfırlamak ister misiniz? (evet/hayır): ");
            String resetChoice = input.nextLine();
            // şifre sıfırlama işlemi
            if (resetChoice.equalsIgnoreCase("evet")) {
                System.out.print("Yeni şifrenizi girin: ");
                String newPassword = input.nextLine();
                // yeni şifre kontrolü
                if (!newPassword.equals(password)) {
                    System.out.print("Yeni şifreyi tekrar girin: ");
                    String confirmPassword = input.nextLine();
                    // yeni şifre tekrar kontrolü
                    if (confirmPassword.equals(newPassword)) {
                        System.out.println("Şifre oluşturuldu.");
                    } else {
                        System.out.println("Şifre oluşturulamadı, lütfen başka bir şifre giriniz.");
                    }
                } else {
                    System.out.println("Yeni şifre, hatalı girdiğiniz şifreyle aynı olamaz.");
                }
            } else {
                System.out.println("Şifre sıfırlama işlemi iptal edildi.");
            }
        }
    }
}
