package paket1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C7 {
     static List<C6>öğrenci=new ArrayList<>();
    static Scanner scan=new Scanner(System.in);
  void işlemler() {


      /*  2. ============= İŞLEMLER =============
        1-EKLEME
        2-ARAMA
        3-LİSTELEME
        4-SİLME
        Q-ÇIKIŞ

        SEÇİMİNİZ:

        ŞEKLİNDE BİR MENÜ OLUŞTURULMALI.*/

        System.out.println("=========İŞLEMLER==========\n"+
        "\t\t 1_EKLEME\n"+"\t\t 2_ARAMA\n"+"\t\t 3_LİSTELEME\n"+
                "\t\t 1_SİLME\n"+"\t\t Q_ÇIKIŞ\n\n"+
                "\t\tSEÇİMİNİZ:");
      int seçim= 0;
      try {
          seçim = scan.nextInt();
      } catch (Exception e) {
          String çıkış=scan.next().substring(0,1);
          if(çıkış.equalsIgnoreCase("q")){
              System.exit(0);
          }
      }
      switch (seçim){

            case 1: {
                ekleme();
            }
            case 2:
                arama(öğrenci);
            case 3:
                listeleme(öğrenci);
            case 4:
                silme(öğrenci);
          default:{
              System.out.println("hatalı değer girdiniz:");
          }

        }





}

    private void silme(List<C6> öğrenci) {
        System.out.println("silinecek öğrencinin adını giriniz:");
        String silinecekad=scan.next();
        boolean kontrol=false;
        for (C6 each:öğrenci
             ) {
            if(silinecekad.equalsIgnoreCase(each.getIsim())){
                öğrenci.remove(each);
                listeleme(öğrenci);
                kontrol=true;
            }

        }
        if(kontrol){
            System.out.println("silinecek öğrenci bulunamadı");
            işlemler();
        }
    }

    private void arama(List<C6>osman) {
        System.out.println("lutfen aramak ıstediğiniz öğrencinin adını giriniz:");
        String aranacakad=scan.next();
        for (C6 each:osman
             ) {
            if(aranacakad.equalsIgnoreCase(each.getIsim())){
                System.out.println("aradığınız öğrenci bilgileri"+each);
                işlemler();
            }
            else System.out.println("aradığınız isimde bir öğrencimiz yoktur!!!");
        }
    }

    public void ekleme() {
        System.out.println("lütfen adınızı giriniz:");
        String ad=scan.next();
        System.out.println("lütfen soyadınızı giriniz:");
        String soyad=scan.next();
        System.out.println("lütfen TC giriniz:");
        int tc=scan.nextInt();
        C6 kayıt=new C6(ad,soyad,tc);
        öğrenci.add(kayıt);
        listeleme(öğrenci);
        işlemler();

    }

    private void listeleme(List<C6> osman) {
        for (C6 each :osman
             ) {
            System.out.println(each);
            System.out.println();

        }
        işlemler();
    }
}
