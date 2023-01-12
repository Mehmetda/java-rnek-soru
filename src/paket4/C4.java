package paket4;

import java.util.*;

public class C4 {
    public static void main(String[] args) {
        C3 obje=new C3();
        Map<Integer,String>ögrenci=obje.Öğrencimap();

        List<Integer> numara=new ArrayList<>();
        Collection<String> newcollect=ögrenci.values();
        // verilen ismin ogrenciMap'de olup olmadigini kontrol edip
        // true veya false donen bir method olusturun
        System.out.println(varmıyokmu(ögrenci, "murtaza"));
        soyisimilelisteyazdır(ögrenci,"berat");

    }

    private static void soyisimilelisteyazdır(Map<Integer, String> ögrenci, String berat) {
        Collection<String>yeniliste=ögrenci.values();
        for (String each:yeniliste
             ) {
            String[]array=each.split("-");
            if(berat.equalsIgnoreCase(array[1])){
                System.out.println(array[0]+" "+array[1]+" "+array[2]+" "+array[3]);

            }

        }

    }

    private static boolean varmıyokmu(Map<Integer, String> ögrenci, String ali) {

        Collection<String>yeniisim=ögrenci.values();

        for (String each:yeniisim
             ) {
            String[]arr=each.split("-");
            if(ali.equalsIgnoreCase(arr[0])){

                return true;
            }


        }
        return false;
    }
}
