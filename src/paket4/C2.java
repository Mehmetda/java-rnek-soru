package paket4;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class C2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        /*Soru : Bir ogretmenden ogrencilerin notlarini girmesini isteyin, not grime islemi
        bittiginde Q’ya basmalidir. Not grime islemi bittikten sonra asagidaki sekilde
        output hazirlayin
        not ortalamasi : …..
        ogrenci sayisi : …..
        ortalama altindaki ogrenci sayisi : ….
        ortalamanin 10 puan alt ve ustunde olan ogrenci sayisi : ….*/
        List<Integer>notlar=new LinkedList<>();
        boolean devam=true;
        while(devam){
            System.out.println("notları girin çıkmak istiyorsanız Q ya basınız:");
            try {
                notlar.add(scan.nextInt());
            } catch (Exception e) {
                char çıkış=scan.next().charAt(0);
                if(çıkış=='q'||çıkış=='Q'){
                    devam=false;
                }


        }


        }
        int ort=notortalaması(notlar);

        System.out.print("not ortalaması:");
        System.out.println(notortalaması(notlar));
        System.out.println();
        System.out.print("öğrenci sayısı:");
        System.out.println(notlar.size());
        System.out.print(" ortalama altindaki ogrenci sayisi :");
        System.out.println(ortalamaaltindakiogrencisayisi(ort, notlar));
        ortalamanin1puanaltveustundeolanogrencisayisi(notlar,ort);


    }

    private static void ortalamanin1puanaltveustundeolanogrencisayisi(List<Integer> notlar,int ort) {
        int sayı=0;
        for (int each:notlar
             ) {
            if(each>=(ort+10)||each<=(ort-10)){
                sayı++;
            }

        }
        System.out.println(sayı);


    }

    private static int ortalamaaltindakiogrencisayisi(int ort, List<Integer> notlar) {
        int sayı=0;
        for (int each:notlar
             ) {
            if(each<ort){
                sayı++;
            }

        }
        return sayı;
    }

    private static int notortalaması(List<Integer> notlar) {
        int toplam=0;
        for (Integer each:notlar
             ) {
            toplam+=each;

        }
        int ortalama=toplam/notlar.size();
        return ortalama;
    }
}
