package paket2;

import java.util.Scanner;

public class C6 {
    static Scanner scan=new Scanner(System.in);
    static int birincioyuncupuan=0;
    static int ikincioyuncupuan=0;

    public static void main(String[] args) {
               /* Constructor Sorusu-
                1. Aşama: Başlangıçta İlk Oyuncuya oyunu başlatmak için bir kelime girmesini iste.
        2. Aşama: Sonra oyuncuyu degiştir ve ikinci oyuncuya geç. Yeni oyuncuya verilen kelimenin geçerli olup olmadıgını sor
        2.1) Eğer yeni oyuncu verilen kelimeyi kabul ederse : kelimeyi yazan oyuncuya puan olarak kelimedeki harf sayısını ekleyin ve 3. adıma gidin
        2.2) Eğer yeni oyuncu verilen kelimeyi	geçerli olarak kabul etmesse "Geçersiz kelime, oyuncu X(Mevcut oyuncu) oyunu kazandı" yazıp oyunu bitirin.
        3. Aşama: Kullanıcılara oyuna devam etmek isteyip istemediklerini sor: Eğer devam etmek isterlerse:
        3.1) Kullanıcıdan kelimeye eklemek için bir harf isteyin
        3.2) Ve kullanıcıya hangi tarafa eklemek istedigini sorun (Başa veya Sona)
        3.3) Daha sonra harfi kelimeye ekleyin ve 2.Aşamaya geçin Eğer devam etmek istemezlerse: "Game Finished" yazdırın.*/

    }

    public static void oyunaDevam(String kelime) {
        System.out.println("oyuna devam etmek istiyorsanız E ye yoksa H ye basınız:");
        String devam=scan.next().substring(0,1);
        if(devam.equalsIgnoreCase("E")){
            System.out.println("lutfen kelimeye eklemek için bır harf gırınız:");
            String harf=scan.next().substring(0,1);
            System.out.println("Harfi Başa eklemek istiyorsanız B ye yoksa S ye basınız");
            String ekleme=scan.next().substring(0,1);
            if(ekleme.equalsIgnoreCase("B")){
                String yenikelime=harf.concat(kelime);

                geçerliKelime(yenikelime);
            }
            else if(ekleme.equalsIgnoreCase("S")){
                String yenikelime=kelime.concat(harf);
                geçerliKelime(yenikelime);

            }
        }
        else if (devam.equalsIgnoreCase("H")) {
            System.out.println("bu oyunu oynadığınız için teşekkür ederiz iyi günler GAME FINISHED");
            System.exit(0);


        }

    }

    public static void geçerliKelime(String kelime) {


        System.out.println(kelime+" kelimesi anlamlıysa E ye yoksa H ye basınız:");
        String kabul=scan.next().substring(0,1);
        if(kabul.equalsIgnoreCase("E")){
            birincioyuncupuan+=kelime.length();
            System.out.println("birinci oyuncunun puanı:"+birincioyuncupuan);
            oyunaDevam(kelime);
        }
        else if (kabul.equalsIgnoreCase("H")) {
            System.out.println("geçersiz kelime oyuncu ali oyunu kazandı: ");



        }
    }



}
