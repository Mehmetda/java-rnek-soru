package paket3;

import java.util.Scanner;

public class C1 {
    public static void main(String[] args) {
        // Soru 45-)
        // StudentMaın adında bir class olusturun, ögrenci bilgilerini alın. (ad soyad yas cınsiyet okul)
        // Ardından Student adlı bir class olusturun ve
        // içine parametreli constructor koyun, bu parametreler Maın classdaki bılgılerı ıstesın.
        // Bu parametreli constructor icinde kullanıcıya ögrenci bilgilerini doldurtun.
        // Ardından consolda giriilen bilgileri yazdırın
        // Ipucu:
        // Bu soruda iki classa ihtiyacımız olacak.
        // Birinci main classda, ögrenci bilgilerini tanımlayacagımız variablerı olusturacagız.
        // String isim, int yas, char cinsiyet gibi...
        // Ardından baska bir class olusturacagız ve bu classa parametrelı bir constructor koyacagız,
        // bu parametrelı constructor az önce olusturdugumuz
        // classdaki parametreleri kabul edecek sekılde olmalı.
        // Ardından Main classda, parametreli constructoru olan classtan bir obje olusturacagız ve
        // tabi ki constructor parametrelı oldugu ıcın bızden parametre   azmamızı ısteyecek,
        // bızde yukarıda olusturdugumuz variable adlarını ekleyecegız.
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz:");
        String isim=scan.next();
        System.out.println("lutfen soyısmınızı gırınız:");
        String soyisim=scan.next();
        System.out.println("lutfen yaşınızı giriniz:");
        int yaş=scan.nextInt();
        System.out.println("lutfen cinsiyetinizi giriniz:");
        char cinsiyet=scan.next().charAt(0);
        System.out.println("lutfen okulu gırın:");
        String okul=scan.next();
        C2 student=new C2(isim,soyisim,yaş,cinsiyet,okul);
        System.out.println(student);


    }

}
