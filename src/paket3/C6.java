package paket3;

import java.util.Scanner;

public class C6 {
    static Scanner scan= new Scanner(System.in);
    public static void main(String[] args) {
        // Soru 44-)
        // Main methodda ögrenci bilgileri oluşturun ve bu verileri kullanın.
        // Changename adında bir method oluşturun, parametre olarak öğrenci bilgileri alın ve
        // methodda tüm bilgileri değiştirin ve yeni bilgileri ekleyip yazdırın.
        // Main Methoddaki Rename methodunu çağırdığımız satırda öğrenci bilgilerini tekrardan yazdırın
        // Changesurname adlı bir method oluşturun , bu method lastname'i parametre olarak alsın.
        // Methodda kullanıcıya yeni bir lastname sorulsun ve eski lastname degiştirilsin.

        String isim="mehmet";
        String soyisim="dağ";
        int okulno=5224;
        String okul="ışıklar";
        C6 obje=new C6();
        Changename(isim,soyisim,okulno,okul);
        Changesurname(soyisim);
        rename(isim,soyisim);

    }

    private static void rename(String isim, String soyisim) {
        isim="osman";
        soyisim="dağ";
        System.out.println("yeni isim ve soyisim"+isim+" "+soyisim);
    }

    private static void Changesurname(String soyısm) {
        System.out.println("lutfen soyisim giriniz:");
        String soyisim=scan.next();
        System.out.println(soyisim);
    }

    public static void Changename(String ism,String syisim,int oklno,String okl) {
        ism="ali";
        syisim="bekir";
        oklno=5221;
        okl="antep";
        System.out.println(ism);
        System.out.println(syisim);
        System.out.println(oklno);
        System.out.println(okl);

    }
}
