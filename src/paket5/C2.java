package paket5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C2 {
    public static void main(String[] args) {
        // 103 numarali ogrencinin sinifini 12 yapalim

        Map<Integer, Map<String,String >> ogrenciMap= new HashMap<>();


        Map<String,String > ogrenci101= new HashMap<>();
        ogrenci101.put("Isim","Ali");
        ogrenci101.put("Soyisim","Can");
        ogrenci101.put("Sinif","11");
        ogrenci101.put("Sube","H");
        ogrenci101.put("Bolum","MF");

        Map<String,String > ogrenci102= new HashMap<>();
        ogrenci102.put("Isim","Veli");
        ogrenci102.put("Soyisim","Cem");
        ogrenci102.put("Sinif","10");
        ogrenci102.put("Sube","K");
        ogrenci102.put("Bolum","TM");

        Map<String,String > ogrenci103= new HashMap<>();
        ogrenci103.put("Isim","Ali");
        ogrenci103.put("Soyisim","Cem");
        ogrenci103.put("Sinif","11");
        ogrenci103.put("Sube","K");
        ogrenci103.put("Bolum","TM");

        ogrenciMap.put(101,ogrenci101);
        ogrenciMap.put(102,ogrenci102);
        ogrenciMap.put(103,ogrenci103);

        System.out.println(ogrenciMap);
        sınıfdeğiştir(ogrenciMap);

    }

    private static void sınıfdeğiştir(Map<Integer, Map<String, String>> ogrenciMap) {

        Set<Map.Entry<Integer, Map<String, String>>> entrim= ogrenciMap.entrySet();
        for (Map.Entry<Integer, Map<String, String>> each:entrim
             ) {
            if(each.getKey()==103){
                Map<String,String>talebe=each.getValue();
                talebe.put("sınıf","12");
                each.setValue(talebe);
                System.out.println(each);
            }



        }

    }
}
