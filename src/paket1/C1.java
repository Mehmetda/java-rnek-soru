package paket1;

import java.util.Scanner;

public class C1 {
    public static void main(String[] args) {
        /*ATM
        Kullanicidan giriş için kart numarasi ve şifresini isteyin, eger herhangi birini yanlis girerse tekrar isteyin.
        Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
        Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği
        işlemleri ekrana yazdirin,
        Menu listesinde Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis islemleri olacaktır.
                Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,
        Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali,
         eger değilse menü ekraninageri donsun.
        Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,
                Herkese merhabalar
        Yarın Practice dersinde çözeceğimiz soruyu şimdiden paylaşayım dedim.
        Yarın saat 19:00 da görüşmek üzere :man-raising-hand:*/
        boolean devam = false;
        int bakiye = 5224;
        String KartNumarası = "1234";
        String şifre = "mehmet123";
        Scanner scan = new Scanner(System.in);
        System.out.println("giriş için lutfen kart nosu ve şifreyi giriniz:");
        String Kart = scan.nextLine();
        String şifre1 = scan.nextLine();
        Kart = Kart.replaceAll("//s", "").replaceAll("//s+", "");
        while (!(KartNumarası.equalsIgnoreCase(Kart) && şifre.equalsIgnoreCase(şifre1))) {
            System.out.println("giriş için lutfen kart nosu ve şifreyi tekrar giriniz:");
            Kart = scan.nextLine();
            şifre1 = scan.nextLine();
            Kart = Kart.replaceAll("//s", "");
        }
        while (!devam) {
            System.out.println("bakiye sorgulama için 1 e basınız");
            System.out.println("para yatırma için 2 e basınız");
            System.out.println("para çekme için 3 e basınız");
            System.out.println("para gönderme için 4 e basınız ");
            System.out.println("şifre değiştirme için 5 e basınız");
            System.out.println("çıkış için 6 ya basınız");
            int işlem = scan.nextInt();
            if (işlem == 3) {
                System.out.println("lutfen cekmek ıstedıgınız tutarı gırınız");
                int tutar = scan.nextInt();
                if (bakiye >= tutar) {
                    System.out.println("işlem başarıyla gerçekleştirildi mevcut bakiye" + (bakiye - tutar));

                } else System.out.println("bu işlemi yapmak için yeterli bakiye yoktur");

            }
            if (işlem == 4) {
                System.out.println("lutfen göndermek ıstedıgınız tutarı gırınız");
                int tutar = scan.nextInt();
                if (bakiye >= tutar) {
                    System.out.println("lütfen iban numarası giriniz:");
                    String iban = scan.next();
                    iban = iban.replaceAll("//s", "").replaceAll("//s+", "");
                    if (!(iban.startsWith("TR"))) System.out.println("iban numaranız TR ile başlamalıdır");
                    if (!(iban.length() == 26)) System.out.println("iban numaranız 26 karakterli olmaalıdır");
                }
                else if(bakiye< tutar) {
                    System.out.println("bu işlemi yapmak için yeterli bakiye yoktur");

                }



            }
            if(işlem==5){
                System.out.println("lütfen eski şifreyi giriniz");
                String eskişifre=scan.next();
                if(eskişifre.equalsIgnoreCase(şifre)){
                    System.out.println("yeni şifreyi giriniz");
                    şifre=scan.nextLine();

                }
                else System.out.println("yanlış şifre lutfen tekrar deneyin");
            }
            if(işlem==6){
                devam=true;
            }
            if(işlem==2){
                System.out.println("lutfen yatırmak ıstediğin tutarı gir");
                int tutar=scan.nextInt();
                System.out.println("mevcut bakiye"+(tutar+bakiye));
            }
            if (işlem==1) System.out.println(bakiye);
        }
    }
}
