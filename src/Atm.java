import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        String userName, password;
        int select;
        int right = 3;
        int balance = 1500;
        Scanner inp = new Scanner(System.in);
        System.out.println("Kullanici adi giriniz :");
        userName = inp.nextLine();
        System.out.println("Sifre giriniz :");
        password = inp.nextLine();
        if (userName.equals("patika") && password.equals("dev123")) {
            System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
            System.out.println("1-Para yatırma\n" +
                    "2-Para Çekme\n" +
                    "3-Bakiye Sorgula\n" +
                    "4-Çıkış Yap");
            System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
            select = inp.nextInt();

            switch (select) {
                case 1:
                    System.out.print("Para miktarı : ");
                    int price = inp.nextInt();
                    balance += price;

                case 2:
                    System.out.print("Para miktarı : ");
                    int price1 = inp.nextInt();
                    if (price1 > balance) {
                        System.out.println("Bakiye yetersiz.");
                    } else {
                        balance -= price1;
                    }

                case 3:
                    System.out.println("Bakiyeniz : " + balance);

                case 4:
                    System.out.println("Tekrar görüşmek üzere.");
                    break;
            }
        } else {
            while (right >= 0)
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                }
                else {
                    System.out.println("Kalan Hakkınız : " + right);
                }

        }

    }
}