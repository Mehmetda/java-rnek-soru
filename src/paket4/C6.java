package paket4;

import java.util.Map;
import java.util.Set;

public class C6 {
    public static void main(String[] args) {
        // verilen siniftaki ogrencilerin no, isim, soyisim, bolumlerini
        // bir liste olarak yazdiran bir method olusturun
        C3 obje=new C3();
        Set<Map.Entry<Integer,String>>entrylist=obje.Öğrencimap().entrySet();

        SınıfYazdırma(entrylist,"11");
    }
    private static void SınıfYazdırma(Set<Map.Entry<Integer, String>> entrylist, String s) {

        for (Map.Entry<Integer, String> each:entrylist
        ) {
            String bilgiler=each.getValue();
            String[]array=bilgiler.split("-");
            if(array[2].equalsIgnoreCase(s)){
                System.out.println(each.getKey()+" "+array[0]+" "+array[1]+" "+array[3]);
            }
        }
    }


}
