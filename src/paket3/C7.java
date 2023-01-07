package paket3;

import java.util.Scanner;

public class C7 {
    String isim;
    String soyisim;

    String okul;

    int numara;

    @Override
    public String toString() {
        return "C7{" +
                "isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", okul='" + okul + '\'' +
                ", numara=" + numara +
                '}';
    }


    public String toString1() {
        return "C7{" +
                "okul='" + okul + '\'' +
                '}';
    }

    public static void main(String[] args) {
        // Soru 43-)
        // Biri parametreli, diğeri parametresiz 2 constructor oluşturun.
        // Bu const. kullanarak en az 2 nesne oluşturun ve
        // konsolda bu nesnelerin özellikleri yazdırın

        // Ipucu: Constructor konusunu pratik yapalım.
        // Nesnelerin rengini adını sayısını gönderelim
        // sonra cagırıp konsolda yazdıralım.
        Scanner scan=new Scanner(System.in);
        System.out.println("ısım gır");
        String isim=scan.next();
        System.out.println("soyısım gır");
        String soyisim=scan.next();
        System.out.println("numara gır");
        int no=scan.nextInt();
        System.out.println("okul gır");
        String okul=scan.next();
        C7 nesne2=new C7();
        System.out.println(nesne2);
        C7 nesne1=new C7(isim,soyisim,no);
        System.out.println(nesne1);

    }
    C7(){
        this.okul="ışıklar";


    }

    C7(String ism,String symisim,int no){
        this.isim=ism;
        this.soyisim=symisim;
        this.numara=no;

    }
}
