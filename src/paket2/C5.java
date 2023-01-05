package paket2;

import java.util.Scanner;

public class C5 {

    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       /* Constructor Sorusu-
                1. Aşama: Başlangıçta İlk Oyuncuya oyunu başlatmak için bir kelime girmesini iste.
        2. Aşama: Sonra oyuncuyu degiştir ve ikinci oyuncuya geç. Yeni oyuncuya verilen kelimenin geçerli olup olmadıgını sor
        2.1) Eğer yeni oyuncu verilen kelimeyi kabul ederse : kelimeyi yazan oyuncuya puan olarak kelimedeki harf sayısını ekleyin ve 3. adıma gidin
        2.2) Eğer yeni oyuncu verilen kelimeyi	geçerli olarak kabul etmesse "Geçersiz kelime, oyuncu X(Mevcut oyuncu) oyunu kazandı" yazıp oyunu bitirin.
        3. Aşama: Kullanıcılara oyuna devam etmek isteyip istemediklerini sor: Eğer devam etmek isterlerse:
        3.1) Kullanıcıdan kelimeye eklemek için bir harf isteyin
        3.2) Ve kullanıcıya hangi tarafa eklemek istedigini sorun (Başa veya Sona)
        3.3) Daha sonra harfi kelimeye ekleyin ve 2.Aşamaya geçin Eğer devam etmek istemezlerse: "Game Finished" yazdırın.*/
        System.out.println("oyunu başlatmak için lutfen bir kelime giriniz:");
        String kelime=scan.next();

        C6.geçerliKelime(kelime);


    }
}
