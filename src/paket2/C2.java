package paket2;

import java.util.Scanner;

public class C2 {
    public static void main(String[] args) {
         /*
    Problem Tanımı :
Basit 4 işlem yapan bir hesap makinesi kodlayınız....
Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayinız.
Kullanicidan iki sayi girmesini isteyiniz.
Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
​
***cikan sonucla yeni bi islem yaptirmayi sectirip isleme devam ettirin
***hesap makinesi ve islemler methodla calissin.*/


        boolean devam = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen yapacagınız işlemi ve sayıları giriniz: / + - *");
        char işlem = scan.next().charAt(0);
        int sayı1 = scan.nextInt();
        int sayı2 = scan.nextInt();
        System.out.println(hesapmakinesi(işlem, sayı1, sayı2));
        while (devam) {
            System.out.println("çıkmak istiyorsanız  H ye basınız devam etmek ıstıyorsanız E ye basınız");
            char istek = scan.next().charAt(0);
            if (istek == 'H') {
                System.out.println("bızı tercıh ettıgınız ıcın tesekkur ederız ıyı gunler");
                devam = false;
            } else if (istek == 'E') {
                System.out.println("lutfen işleminizi ve rakamınızı gırınız");
                sayı1 = hesapmakinesi(işlem, sayı1, sayı2);
                işlem = scan.next().charAt(0);
                sayı2 = scan.nextInt();
                System.out.println(hesapmakinesi(işlem, sayı1, sayı2));
            }
        }

    }

    private static int bölme(int sayı1, int sayı2) {
        int bölme = sayı1 / sayı2;
        return bölme;
    }

    private static int çarpma(int sayı1, int sayı2) {
        int çarpma = sayı1 * sayı2;
        return çarpma;
    }

    private static int çıkarma(int sayı1, int sayı2) {
        int fark = sayı1 - sayı2;
        return fark;
    }

    private static int toplama(int sayı1, int sayı2) {
        int toplam = sayı1 + sayı2;
        return toplam;
    }

    private static int hesapmakinesi(char işlem, int sayı1, int sayı2) {

        switch (işlem) {
            case '+':
                return toplama(sayı1, sayı2);

            case '-':
                return çıkarma(sayı1, sayı2);

            case '/':
                return bölme(sayı1, sayı2);

            case '*':
                return çarpma(sayı1, sayı2);
            default:
                return 0;


        }

    }
}