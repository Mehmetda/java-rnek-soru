package paket3;

import java.util.Scanner;

public class C4 {
    String marka;
     String boya;

    @Override
    public String toString() {
        return "C4{" +
                "marka='" + marka + '\'' +
                ", boya='" + boya + '\'' +
                ", model=" + model +
                '}';
    }

    int model;



    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        // Soru 43-)
        // Biri parametreli, diğeri parametresiz 2 constructor oluşturun.
        // Bu const. kullanarak en az 2 nesne oluşturun ve
        // konsolda bu nesnelerin özellikleri yazdırın

        C4 obje=new C4("kırmızı","sarı",19);
        System.out.println(obje);

    }

    C4(){

    }
    C4(String mrka,String by,int mdl){
       this.marka=mrka;
       this.boya=by;
       this.model=mdl;


    }
}
