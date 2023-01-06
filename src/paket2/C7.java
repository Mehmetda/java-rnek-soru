package paket2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C7 {
    public static void main(String[] args) {
        /*
    Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program
yazınız. Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir
method yazınız. Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını
gösteren bir method yazınız. Ayrıca bakkalın hangi günler ortalamanın altında
 kazandığını gösteren bir method yazınız.
​
 * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
   2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
   3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
   4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
   5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun. for döngüsü ile tüm günleri ortalama kazanç
   ile karşılaştır ortalama
             kazançtan yüksekse o günleri return yap.
   6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
   for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
             ortalama kazançtan aşağıysa o günleri return yap.
     */
        Scanner scan=new Scanner(System.in);
        List<String> günler=new ArrayList<>();
        günler.add("pazartesi");
        günler.add("salı");
        günler.add("çarşamba");
        günler.add("perşembe");
        günler.add("cuma");
        günler.add("cumartesi");
        günler.add("pazar");
        List<Integer>günlükkazançlar=new ArrayList<>();
        while(günlükkazançlar.size()<7){
            System.out.println("lutfen gunluk kazancı gırınız:");
            int kazanç=scan.nextInt();
            günlükkazançlar.add(kazanç);
        }
        System.out.println(getortalamakazanç(günlükkazançlar));
        System.out.println(getortalamanınustundekazancgunler(günlükkazançlar));
        System.out.println(getOrtalamaninAltindaKazancGünleri(günlükkazançlar));
    }

    public static List<Integer> getOrtalamaninAltindaKazancGünleri(List<Integer> günlükkazançlar) {
        List<Integer>ortalamaaltı=new ArrayList<>();
        for (int i = 0; i <günlükkazançlar.size() ; i++) {
            if(günlükkazançlar.get(i)<getortalamakazanç(günlükkazançlar)){
                ortalamaaltı.add(günlükkazançlar.get(i));
            }

        }
        return ortalamaaltı;
    }

    public static List<Integer> getortalamanınustundekazancgunler(List<Integer> günlükkazançlar) {

        List<Integer>ortalamaüstü=new ArrayList<>();

        for (int i = 0; i <günlükkazançlar.size() ; i++) {
            if(günlükkazançlar.get(i)>getortalamakazanç(günlükkazançlar)){
                ortalamaüstü.add(günlükkazançlar.get(i));

            }

        }
        return ortalamaüstü;
    }

    public static int getortalamakazanç(List<Integer> günlükkazançlar) {
        int toplam=0;
        for (int i = 0; i <günlükkazançlar.size() ; i++) {
            toplam+=günlükkazançlar.get(i);

        }
        int ortalama=toplam/günlükkazançlar.size();
        return ortalama;
    }
}
